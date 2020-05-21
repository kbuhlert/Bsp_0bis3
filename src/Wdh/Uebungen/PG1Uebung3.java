package Wdh.Uebungen;

public class PG1Uebung3 {
    //kuschelBedarf gibt an ob ein Hund derzeit gekuschelt werden soll oder nicht. Als Parameter
    // erhält die Methode ein int Array kuschelZeit mit der Länge der letzten 3 Kuscheleinheiten.
    // Der Rückgabewert soll angeben ob gekuschelt werden soll oder nicht (boolean). Falls in Summe
    // die letzten 3 Kuscheleinheiten länger als 60 Minuten waren muss der Hund nicht gekuschelt
    // werden. Wenn die Länge der Kuschelzeiten aufsteigend ist (Erste Kuscheleinheit am kürzesten,
    // zweite Kuscheleinheit in der Mitte, dritte Kuscheleinheit am längsten) dann soll der Hund
    // gekuschelt werden. Für die restlichen gilt, dass sie gekuschelt werden sollen – mit der
    // Ausnahme all jener Hunde bei denen die vorletzte Kuschelzeit länger als 25 Minuten war.

    public static boolean kuschelBedarf (int[] kuschelZeit){
        boolean kuscheln = false;
        int k1 = kuschelZeit[0];
        int k2 = kuschelZeit[1];
        int k3 = kuschelZeit[2];
        if (k1+k2+k3>60){
            kuscheln=false;}

        else if (k2>25)
        {kuscheln=false;}

        else if (k1<k2 && k2<k3)
        {kuscheln=true;}

        else {kuscheln=true;}
        return kuscheln;
    }

    public static void main(String[] args) {
        int[] array1 = {5,24,20};
        System.out.println(kuschelBedarf(array1));

    }
}
