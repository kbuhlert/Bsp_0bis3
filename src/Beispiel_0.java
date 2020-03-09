public class Beispiel_0 {

    public static void main(String[] args) {
        //Ausgabe für Bsp. 0a)
        String bsp0a = lichtschalter_a(1);
        System.out.println(bsp0a);

        //Ausgabe für Bsp. 0b)
        String bsp0b = lichtschalter_b(1);
        System.out.println(bsp0b);

        //Ausgabe für Bsp. 0c)
        String bsp0c = janneAhonen(50.1);
        System.out.println("Der Sprung von Janne Ahonen hat folgendes Ergebnis: " + bsp0c);

       //Ausgabe für Bsp. 0d)
        double bsp0d = fahrgeschwindigkeit(4, 10, 'g'); //fahrtrichtung m=mitwind und g=gegenwind
        System.out.println("Das Auto fährt mit " + bsp0d + "km/h");
    }

    public static String lichtschalter_a (int schalter) {
       String ergebnis;
        if (schalter > 1) {
            ergebnis = "Licht an!"; }
        else {
            ergebnis = "Licht aus!";}
        return ergebnis;
    }

    public static String lichtschalter_b (int schalter) {
        String ergebnis;
        if (schalter == 1) {
            ergebnis = "Licht an!";
        } else {
            ergebnis = "Licht aus!";
        }
        return ergebnis;
    }

    public static String janneAhonen (double flugweite){
        String ergebnis;
        String rettung = "Achtung Teilnehmer hat sich verletzt, bitte Rettung holen!";

        if (flugweite>198.7){
            ergebnis = "Erster Platz! Lauter Jubel!!!";
        }else if (flugweite>197.1 && flugweite<=198.7){
            ergebnis = "Zweiter Platz! Gut gemacht!!";
        }else if (flugweite>195 && flugweite<=197.1){
            ergebnis = "Dritter Platz! Ein tolles Ergebnis!";
        }else if (flugweite>=193.67 && flugweite<=195){
            ergebnis = "Vierter Platz! Not bad :-)";
        }else if (flugweite>150 && flugweite<193.67){
            ergebnis = "Nicht platziert";
        }else { ergebnis = "Sprung war nicht weit genug. Disqualifiziert!"; }

        if (flugweite >50){
        return ergebnis;} else { return rettung;}
    }

    public static double fahrgeschwindigkeit (int gang, int windegeschwindigkeit, char fahrtrichtung){

        int velocity = 0;

        switch (gang){
            case 1: velocity = 10; break;
            case 2: velocity = 20; break;
            case 3: velocity = 30; break;
            case 4: velocity = 40; break; }

        double velocityLessWind;
        if (windegeschwindigkeit<=15)
            {velocityLessWind = velocity * 0.9;}
        else if (windegeschwindigkeit<=25)
            {velocityLessWind = velocity * 0.8;}
        else
            {velocityLessWind = velocity * 0.6;}

        if (fahrtrichtung == 'm'){return velocity;} //fahrtrichtung m=mitwind und g=gegenwind
        else{return velocityLessWind;}
    }

}
