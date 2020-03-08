import org.w3c.dom.ls.LSOutput;

public class Beispiel_1b {
    public static void main (String[] args){
        int pflanzennr = 2;         //hier eingeben welche Pflanze gegossen werden soll
        double giessvolumen = 2.5;  //hier das Gesamtvolumen mit dem gegossen werden soll eingeben

        double ergebnis = duengung(pflanzennr,giessvolumen);

        System.out.println("Die Düngemenge beträgt " + ergebnis + "l auf ein Gesamtvolumen von " + giessvolumen + "l");

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
        //return wassermenge;           //ich kann hier nicht zwei Werte ausgeben, wie geht das?
    }

}
