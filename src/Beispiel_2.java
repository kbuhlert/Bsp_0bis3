public class Beispiel_2 {

    static int zumZiel (int station, int baustellenStation, int zusatzZeit) {
        int fahrzeit = 0;

        switch (station) {
            case 1:
                fahrzeit = 20;
                break;
            case 2:
                fahrzeit = 16;
                break;
            case 3:
                fahrzeit = 15;
                break;
            case 4:
                fahrzeit = 10;
                break;
            case 5:
                fahrzeit = 3;
                break;
        }
        if (baustellenStation >= station) {
            return fahrzeit + zusatzZeit;
        } else {
            return fahrzeit;
        }
    }




    public static void main (String[] args){
        int station = 2;
        int baustellenStation = 2;
        int zusatzZeit = 5;

        int bsp2b = zumZiel(station, baustellenStation, zusatzZeit);
        /*if ( bsp2b>=1){System.out.println("Die Restliche Fahrzeit zum Ziel beträgt: " + bsp2b + " Minuten");}
        else{
            System.out.println("Achtung: JETZT aussteigen!!!");}*/
        if (baustellenStation>=station && station!=6){
            System.out.println("Die Restliche Fahrzeit zum Ziel beträgt: " + bsp2b + " Minuten. Aufgrund einer Baustelle bei Station " + baustellenStation + " kommt es zu einer Verzögerung von " + zusatzZeit + " Minuten");
        }
        else if( baustellenStation<station && station!=6){System.out.println("Die Restliche Fahrzeit zum Ziel beträgt: " + bsp2b + " Minuten");}
        else{
            System.out.println("Achtung: JETZT aussteigen!!!");}
    }
}
