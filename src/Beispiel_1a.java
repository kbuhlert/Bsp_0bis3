public class Beispiel_1a {
    static int giessen (int feuchtigkeit){
        int giesszeit = 0;

        if (feuchtigkeit<=20){giesszeit=5;}
        else if (feuchtigkeit<=40 && feuchtigkeit>20){giesszeit=3;}
        else if (feuchtigkeit<=75 && feuchtigkeit>40){giesszeit=1;}
        else {giesszeit=0;}

        return giesszeit;}

        public static void main (String [] args){
        int feuchtigkeit = 10;  //hier den aktuellen Feuchtigkeitsmesswert (%) eingeben
        int bsp1a = giessen(feuchtigkeit);

            System.out.println("Die Feuchtigkeit wurde mit " + feuchtigkeit + "% bestimmt.");
            System.out.println("Die Gießzeit beträgt also " + bsp1a + " Sekunden.");
        }
}
