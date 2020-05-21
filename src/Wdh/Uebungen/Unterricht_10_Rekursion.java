package Wdh.Uebungen;

public class Unterricht_10_Rekursion {
    //Rekursionsübun 10: Eine Methode schreiben die x Mal folgenden Text
    //ausgibt: Der Pinguin schlug die Zeitung auf, da stand:


    //mit while-Schleife
    public static void pinguinLiestWhile(int xMal){
        while (xMal>0){
        System.out.println("Der Pinguin schlug die Zeitung auf, da stand:");
        xMal--;
        }
    }
    //mit if-Bedingung/ Rekursiv
    public static void pinguinLiestRekusiv(int xMal){
        if (xMal>0){
            System.out.println("Der Pinguin schlug die Zeitung auf, da stand:");
            xMal--;
            pinguinLiestRekusiv(xMal);
        }
    }

    public static void main(String[] args) {
        pinguinLiestWhile(5);
        System.out.println("-------");
        pinguinLiestRekusiv(4);
    }

}
