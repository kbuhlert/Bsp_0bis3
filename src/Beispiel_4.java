public class Beispiel_4 {
    public static void main(String[] args) {
        //Ausgabe von 4a)
        int alter = 8;      //Eingabe des Alters des Patienten
        int letztesImpfungsjahr = 2016;     //Eingabe der letzten Impfung des Patienten
        boolean auffrischung = false;       //Eingabe ob es sich um eine Auffrischung handelt (true = es ist eine Auffrischung)

        int naechstesImpfungsjahr = naechsteZeckenimpfung(alter, letztesImpfungsjahr, auffrischung);

        System.out.println("Entsprechend Ihrer Daten erfolgt die nächste Impfung in " + naechstesImpfungsjahr + " Jahren.");

        //Ausgabe von 4b)

        //Ausgabe von 4c)
        int testJahr = 1904;        //Eingabe des zu testen Jahres
        boolean schaltjahr = schaltjahr(testJahr);  //Abruf der Testmethode
        System.out.println("Das Jahr " + testJahr + " ist ein Schaltjahr ist: " + schaltjahr);

        //Ausgabe von 4d)
            }

            //Methode für 4a)
    static int naechsteZeckenimpfung (int alter, int letztesImpfungsjahr, boolean auffrischung){
        int naechstesImpfungsjahr;

        if(auffrischung) {
            naechstesImpfungsjahr=3;}
        else if (alter>=60){
            naechstesImpfungsjahr=3;}
        else{naechstesImpfungsjahr=5;}

        return naechstesImpfungsjahr;
    }

            //Methode für 4c)
    static boolean schaltjahr (int testJahr){

        boolean schaltjahr;

        if(testJahr%4 == 0 && testJahr%1000 == 0){
            schaltjahr=true; }
        else if(testJahr%4 == 0 && testJahr%100 == 0){
            schaltjahr=false; }
        else if (testJahr%4 == 0){
            schaltjahr=true; }
        else {schaltjahr = false;}

        return schaltjahr;
    }

}
