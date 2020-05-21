package Wdh.Uebungen;

public class Primzahlen {

    public static void primzahlen (int bis){
        //alle Primzahlen ausgeben die von 1 bis x gehen
        //da für 1 eine sonderregel gil (sie ist zwar nur durch sich selber und 1 teilbar,
        // aber sie ist trotzdem keine Primzahl starte ich bei 2)
        for (int i=2; i<=bis;i++) {  //jede Zahl einzeln durchlaufen mit for
            boolean teilbar = false;    //fals Zahl keine Primzahl ist wird boolean auf true gesetzt
            for (int j = 2; j < i; j++) {   //testen auf Teilbarkeit mit jeder kleineren Zahl (j<i)
                if (i % j == 0) {
                    teilbar = true;
                    break;         //wenn feststeht, dass Zahl teilbar ist muss nicht weiter gestestet werden
                }
            }
            if (teilbar == false) {
                System.out.println(i + " --> ist eine Primzahl");
            }
        }
        }

    public static void main(String[] args) {
        primzahlen(50);
    }
}
