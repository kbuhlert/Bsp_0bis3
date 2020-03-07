public class Beispiel_0 {

    public static void main(String[] args) {
    String lichta = Lichtschalter_a(1);      //Ausgabe für Bsp. 0a)
        System.out.println(lichta);

        String lichtb = Lichtschlter_b(1);
        System.out.println(lichtb);
    }

    public static String Lichtschalter_a (int schalter) {
       String ergebnis;
        if (schalter > 1) {
            ergebnis = "Licht an!"; }
        else {
            ergebnis = "Licht aus!";}
        return ergebnis;
    }

    public static String Lichtschlter_b (int schalter) {
        String ergebnis;
        if (schalter == 1) {
            ergebnis = "Licht an!";
        } else {
            ergebnis = "Licht aus!";
        }
        return ergebnis;
    }

}
