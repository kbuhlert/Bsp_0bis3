package Wdh.Uebungen;

public class PG1Uebung5 {
   /* Schreiben sie eine Methode zeilensumme die als Parameter ein zweidimensionales
   Feld array bekommt (int). Es wird angenommen, dass dieses Feld 3 Zeilen und 3 Spalten hat.
   Weiters gibt es einen Parameter zeile (int) der eine Zeile auswählt.  Falls auf diesem
   Parameter 1 steht -> wir möchten die Summe alle Elemente in der ersten Zeile als
   Rückgabewert (int) bekommen. Entsprechend soll das auch für andere Zeilenwerte funktionieren:
Beispiel:
1   1   1				-> Zeilensumme dieser Zeile ist 3
2   2   2				-> Zeilensumme dieser Zeile ist 6
3   3   3				-> Zeilensumme dieser Zeile ist 9
*/
     public static void main(String[] args) {
       System.out.println(vergleiche("qwertzdfghjxcv", "ertz"));

       String[] monate1 = {"Jan","Feb","März","April","Mai","juni"};
       String[] monate2 = new String[4];
       monate2[0] = "Juli";
       monate2[1] = "Aug";
       monate2[2] = "Sep";
       monate2[3] = "Okt";

       for (int i=0; i<monate1.length; i++){
           System.out.println(monate1[i] + " [" + (i+1) + "]");
       }

   }


    public static int vergleiche (String s1, String s2){
        if(s2.contains(s1))
            return 1;
        if (s1.contains(s2))
            return 2;
        if (s1.contains(s2) && s2.contains(s1))
            return 3;
        else return 4;

    }





}
