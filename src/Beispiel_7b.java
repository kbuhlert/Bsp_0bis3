import java.util.Arrays;

public class Beispiel_7b {
    public static void main(String[] args) {
        //String warMalZahl = zahlZuString(8);
        System.out.println(zahlZuString(8) + 100);      //mit +100 teste ich ob Zahl tatsächlich als String ausgegeben,
                                                        // wenn nicht dann Ausgabe 108 (Rechnung), sonst 8100("8"+"100")
        stringInArray();

    }
    static String zahlZuString (int zahl){
        String warMalZahl = String.valueOf(zahl);
        return warMalZahl;
    }

    static void stringInArray (){
        String[] array1 = new String[20];
        for(int i=0; i>array1.length; i++){
            array1[i] = zahlZuString(i);
        }
        System.out.println(array1[1]);
        System.out.println(Arrays.toString(array1));
    }
}
