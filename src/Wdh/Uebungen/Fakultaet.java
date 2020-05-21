package Wdh.Uebungen;

public class Fakultaet {
    //Eine rekursive Berechnung von 5! (5*4*3*2*1)

    public static int fakultaet (int wert){
        if (wert>0){
            return fakultaet(wert-1)*wert;
        }
        else return 1;
    }

    public static int fakultaetMitFor (int wert){
        int summe = 1;
        for (int i = wert; i>=1; i--){
            summe = summe * i;
        }
        return summe;
    }

    public static int fakultaetMitWhile (int wert){
        int summe = 1;

        while (wert>1){
            summe = summe*wert;
            wert--;
        }
        return summe;
    }

    public static int fakultaetMitDoWhile(int wert){
        int summe = 1;
        do {
            summe=summe*wert;
            wert--;
        }while (wert>1);
        return summe;
    }

    public static void main(String[] args) {
        System.out.println(fakultaet(8));
        System.out.println(fakultaetMitFor(8));
        System.out.println(fakultaetMitWhile(8));
        System.out.println(fakultaetMitDoWhile(8));
    }

}
