import org.w3c.dom.ls.LSOutput;

public class Beispiel_1b {
    public static void main (String[] args){
        int pflanzennr = 2;         //hier eingeben welche Pflanze gegossen werden soll
        double giessvolumen = 2.5;  //hier das Gesamtvolumen mit dem gegossen werden soll eingeben

        double duengeanteil = duengung(pflanzennr,giessvolumen);
        double wasseranteil = wasser(pflanzennr,giessvolumen);

        System.out.println("Die Düngemenge beträgt " + duengeanteil + "l und muss mit " + wasseranteil + "l Wasser auf ein Gesamtvolumen von " + giessvolumen + "l aufgefüllt werden.");


    }

    static double wasser (int pflanzennr, double giessvolumen){     // giessvolumen ist gesamtflüssigkeit,
        double wassergehalt = 0;
        double wassermenge = 0;

        switch (pflanzennr){
            case 1:
                wassergehalt = 0.99;
                wassermenge = giessvolumen * wassergehalt;
                break;
            case 2:
                wassergehalt = 0.95;
                wassermenge = giessvolumen * wassergehalt;
                break;
            case 3:
                wassergehalt = 1;
                wassermenge = giessvolumen * wassergehalt;
                break;
            case 4:
                wassergehalt = 0.98;
                wassermenge = giessvolumen * wassergehalt;
                break;
            default:
                wassergehalt = 0.99;
                wassermenge = giessvolumen * wassergehalt;
                break;
        }

        return wassermenge;           //ich kann hier nicht zwei Werte ausgeben, wie geht das?
    }

    static double duengung (int pflanzennr, double giessvolumen){     // giessvolumen ist gesamtflüssigkeit,
        double wassergehalt = 0;
        double duengemenge = 0;
        double wassermenge = 0;

        switch (pflanzennr){
            case 1:
                wassergehalt = 0.99;
                wassermenge = giessvolumen * wassergehalt;
                duengemenge = giessvolumen - wassermenge;
                break;
            case 2:
                wassergehalt = 0.95;
                wassermenge = giessvolumen * wassergehalt;
                duengemenge = giessvolumen - wassermenge;
                break;
            case 3:
                wassergehalt = 1;
                wassermenge = giessvolumen * wassergehalt;
                duengemenge = giessvolumen - wassermenge;
                break;
            case 4:
                wassergehalt = 0.98;
                wassermenge = giessvolumen * wassergehalt;
                duengemenge = giessvolumen - wassermenge;
                break;
            default:
                wassergehalt = 0.99;
                wassermenge = giessvolumen * wassergehalt;
                duengemenge = giessvolumen - wassermenge;
                break;
        }
        return duengemenge;
    }

}
