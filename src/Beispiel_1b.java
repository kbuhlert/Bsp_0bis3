public class Beispiel_1b {
    public static void main (String[] args){

    }

    static double düngung (int pflanzennr, double giessvolumen){     // giessvolumen ist gesamtflüssigkeit,
        double wassergehalt;
        double duengemenge;
        double wassermenge;

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
        }
        return duengemenge;
        return wassermenge;
    }

}
