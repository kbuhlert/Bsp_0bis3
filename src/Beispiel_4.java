public class Beispiel_4 {
    public static void main(String[] args) {
        //Ausgabe von 4a)
        int alter = 8;      //Eingabe des Alters des Patienten
        int letztesImpfungsjahr = 2016;     //Eingabe der letzten Impfung des Patienten
        boolean auffrischung = false;       //Eingabe ob es sich um eine Auffrischung handelt (true = es ist eine Auffrischung)

        int naechstesImpfungsjahr = naechsteZeckenimpfung(alter, letztesImpfungsjahr, auffrischung);

        System.out.println("Entsprechend Ihrer Daten erfolgt die nächste Impfung in " + naechstesImpfungsjahr + " Jahren.");

        //Ausgabe von 4b)
        int[] f = new int[] {1,2,3,4,};
        System.out.println(f[0]);
        System.out.println(f[1]);
        System.out.println(f[2]);
        System.out.println(f[3]);
        feldUmsortieren(f);
        System.out.println("----");
        System.out.println(f[0]);
        System.out.println(f[1]);
        System.out.println(f[2]);
        System.out.println(f[3]);

        //Ausgabe von 4c)
        int testJahr = 2020;        //Eingabe des zu testen Jahres
        boolean schaltjahr = schaltjahr(testJahr);  //Abruf der Testmethode
       if(schaltjahr){ System.out.println("Das Jahr " + testJahr + " ist ein Schaltjahr.");}
       else{
           System.out.println("Das Jahr " + testJahr + " ist KEIN Schaltjahr.");}

        //Ausgabe von 4d)
        double einkommen = 1000000;
        double lohnsteuer = berechneLohnsteuer(einkommen);
        double nettoeinkommen = einkommen-lohnsteuer;
        System.out.println("Ihr Jahresbruttoeinkommen beträgt " + einkommen + "€");
        System.out.println("Die Höhe Ihrer Steuer beträgt somit " + lohnsteuer + "€. Sie haben ein Nettoeinkommen von " + nettoeinkommen + "€");

            }

            //Methode für 4a)
    static int naechsteZeckenimpfung (int alter, int letztesImpfungsjahr, boolean auffrischung){
        int naechstesImpfungsjahr;

        if(auffrischung) {
            naechstesImpfungsjahr=3;}
        else if (alter>=60){
            naechstesImpfungsjahr=3;}
        else{naechstesImpfungsjahr=5;}

        return naechstesImpfungsjahr; }

        //Methode für 4b)
    public static void feldUmsortieren (int[] feld){
        int t;
        t = feld[0];
        feld[0] = feld[3];
        feld[3] = t;
        t = feld [1];
        feld[1] = feld[2];
        feld[2] = t;
    }

            //Methode für 4c)
    static boolean schaltjahr (int testJahr){

        boolean schaltjahr;

        if(testJahr%4 == 0 && testJahr%400 == 0){   //abfrage der 400er Jahre/ erster Test (durch 4 teilbahr) ist überflüssig, da alle die durch 400 teilbar sind sind immer auch durch 4 teilbar
            schaltjahr=true; }
        else if(testJahr%4 == 0 && testJahr%100 == 0){     //abfrage der 100er Jahre/ erster Test (durch 4 teilbahr) ist überflüssig, da alle die durch 100 teilbar sind sind immer auch durch 4 teilbar
            schaltjahr=false; }
        else if (testJahr%4 == 0){
            schaltjahr=true; }
        else {schaltjahr = false;}

        return schaltjahr; }

        //Methode für 4d)

    static double berechneLohnsteuer (double einkommen){
        double steuer;

        if(einkommen>1000000){
            steuer=(einkommen-1000000)*0.55 + 487880;}
        else if (einkommen>90000){
            steuer=(einkommen-90000)*0.5 + 32880;}
        else if (einkommen>60000){
            steuer=(einkommen-60000)*0.48 + 18480;}
        else if (einkommen>31000){
            steuer=(einkommen-31000)*0.42 + 6300;}
        else if (einkommen>18000){
            steuer=(einkommen-18000)*0.35 + 1750;}
        else if (einkommen>11000){
            steuer=(einkommen-11000)*0.25;}
        else {steuer=0;}

        return steuer;
    }

}
