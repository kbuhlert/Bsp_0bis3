public class Beispiel_3 {
    public static void main(String[] args) {
        double gewicht = 0.5;     //Gewicht des Hundes in kg
        int letztesMal = 23;     // Wann war der Hund zum letzten mal spazieren in h
        boolean vertraegtSich = true; //Verträgt sich der Hund mit anderen Hunden und kann gemeinsam mit anderen ausgeführt werden? true=Ja

        double wieWeit = wieWeitSpazieren(gewicht,letztesMal,vertraegtSich);

        System.out.println("Der Hund mit obigen Parametern soll " + wieWeit + "km spazieren gehen." );


    }
    static double wieWeitSpazieren (double gewicht, int letztesMal, boolean vertraegtSich){
        /*Hunde mit einem Gewicht unter einem kg die sich nicht mit anderen vertragen werden nur 2 km ausgeführt.
        Hunde mit niedrigen Gewicht unter 1 kg, die sich vertragen, gehen 4 km spazieren.
        Hunde die mehr als 15kg oder schon mehr als 24h nicht ausgeführt wurden dürfen 8km spazieren
        gehen so sie sich mit anderen vertragen. Alle anderen Hunde werden 5km ausgeführt.
         */
        double spazierDistanz = 0;
        if (gewicht<=1 && !vertraegtSich){
            spazierDistanz = 2.00;}
        else if (gewicht<=1 && vertraegtSich){
            spazierDistanz = 4.00;}
        else if (gewicht>15 || letztesMal>=24){
        spazierDistanz = 8.00;}
        else {spazierDistanz = 5.00;}

        return spazierDistanz;
    }

}
