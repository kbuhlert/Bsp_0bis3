public class Beispiel_3 {
    public static void main(String[] args) {
        //Abruf Übung 3a)
        double gewicht = 1;     //Gewicht des Hundes in kg
        int letztesMal = 23;     // Wann war der Hund zum letzten mal spazieren in h
        boolean vertraegtSich = true; //Verträgt sich der Hund mit anderen Hunden und kann gemeinsam mit anderen ausgeführt werden? true=Ja

        double wieWeit = wieWeitSpazieren(gewicht,letztesMal,vertraegtSich);

        System.out.println("Der Hund mit obigen Parametern soll " + wieWeit + "km spazieren gehen." );

        //Abruf Übung 3b)

        int[] kuschelZeit = new int[3];     //Array für drei Kuschelzeiteinheiten in h
        kuschelZeit[0] = 5;                 //hier Kuschelzeit 1-3 in Min angeben
        kuschelZeit[1] = 20;
        kuschelZeit[2] = 5;

        boolean kuschelJaNein = kuschelbedarf(kuschelZeit);

        System.out.println("Entsprechend obiger Parameter muss mit dem Hund gekuschelt werden: " + kuschelJaNein);


    }

    //Methode zu Übung 3a)
    static double wieWeitSpazieren (double gewicht, int letztesMal, boolean vertraegtSich){
        /*Hunde mit einem Gewicht unter einem kg die sich nicht mit anderen vertragen werden nur 2 km ausgeführt.
        Hunde mit niedrigen Gewicht unter 1 kg, die sich vertragen, gehen 4 km spazieren.
        Hunde die mehr als 15kg oder schon mehr als 24h nicht ausgeführt wurden dürfen 8km spazieren
        gehen so sie sich mit anderen vertragen. Alle anderen Hunde werden 5km ausgeführt.
         */
        double spazierDistanz = 0;
        if (gewicht<=1.0 && !vertraegtSich){
            spazierDistanz = 2.00;}
        else if (gewicht<=1.0 && vertraegtSich){
            spazierDistanz = 4.00;}
        else if (gewicht>15.0 || letztesMal>=24){
        spazierDistanz = 8.00;}
        else {spazierDistanz = 5.00;}

        return spazierDistanz;
    }

    //Methode zu Übung 3b)

    static boolean kuschelbedarf (int[] kuschelzeit){
        /* Falls in Summe die letzten 3 Kuscheleinheiten länger als 60 Minuten waren muss der Hund nicht
        gekuschelt werden. Wenn die Länge der Kuschelzeiten aufsteigend ist (Erste Kuscheleinheit am kürzesten,
        zweite Kuscheleinheit in der Mitte, dritte Kuscheleinheit am längsten) dann soll der Hund gekuschelt werden.
        Für die restlichen gilt, dass sie gekuschelt werden sollen – mit der Ausnahme all jener Hunde
        bei denen die vorletzte Kuschelzeit länger als 25 Minuten war.*/

        int sum = kuschelzeit[0] + kuschelzeit[1] + kuschelzeit[2];
        boolean aufsteigend1 = kuschelzeit[0] < kuschelzeit[1] && kuschelzeit[1] < kuschelzeit[2];
       boolean groesser25 = kuschelzeit[1] >= 25;

        boolean kuschelJaNein;

        if (sum>=60){      // letzten drei Kuscheleinheiten > 60Min
            kuschelJaNein = false;}
        else if (aufsteigend1) {    //Aufsteigende Kuschelzeit
            kuschelJaNein = true;}
        else if (groesser25) {    //Kuschelzeit länger 25Min
            kuschelJaNein = false;}
        else {kuschelJaNein = true;}

        return kuschelJaNein;

    }

}
