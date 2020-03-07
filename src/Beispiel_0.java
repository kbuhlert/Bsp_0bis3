public class Beispiel_0 {

    public static void main(String[] args) {
    String licht = Lichtschalter_a(1);
        System.out.println(licht);
    }

    public static String Lichtschalter_a (int schalter) {
       String ergebnis;
        if (schalter > 1) {
            ergebnis = "Licht an!"; }
        else {
            ergebnis = "Licht aus!";}
        return ergebnis;
    }

}
