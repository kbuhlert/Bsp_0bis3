package Wdh.Uebungen;

import java.util.Arrays;

public class PG1Uebung4 {
    //feldUmsortieren sortiert die Inhalte eines Feldes in die umgekehrte Reihenfolge
    // (1 2 3 7 wird zu – 7 3 2 1) Das int feld mit der Länge 4 soll nach dem Funktionsaufruf
    // entsprechend umsortiert sein.

    public static int[] umsortiern (int[] array1){

        int i = array1[0];
        array1[0]=array1[3];
        array1[3]=i;
        i=array1[1];
        array1[1]=array1[2];
        array1[2]=i;

        return array1;
    }

    //) istSchaltjahr gibt mit einem boolean Rückgabewert an ob der übergebene jahr Parameter
    // (integer) ein Schaltjahr ist. Ein durch 4 dividierbares Jahr ist ein Schaltjahr. Ein
    // durch 100 teilbares Jahr ist kein Schaltjahr, jedoch ist ein durch 400 Jahre teilbares
    // Jahr ein Schaltjahr.

    public static boolean schaltjahr(int jahr){
        boolean istschaltjahr = false;
        if(jahr%400==0){
            istschaltjahr=true;
        }
        else if(jahr%100==0){
            istschaltjahr=false;
        }
        else if(jahr%4==0){
            istschaltjahr=true;
        }
        else istschaltjahr=false;

        return istschaltjahr;
    }
    //naechsteZeckenImpfung liefert zurück in welchem Jahr man die nächste Zecken Auffrischungsimpfung
    // durchführen soll. Als Parameter gibt man das alter an, mit letztesImpfungsjahr, wann man das letzte
    // mal geimpft wurde, und mit dem boolean ersteAuffrischung ob es sich um die erste Auffrischung handelt.
    // Die nächste Auffrischung ist nach 3 Jahren fällig falls es die erste Auffrischung oder man mindestens
    // 60 Jahre alt ist – ansonsten 5 Jahre später.

    public static int naechsteImpfung (int alter, int letzteImpfjahr, boolean ersteAuffrichung){
        int naechsteImpfung;
        if(alter>=60 || ersteAuffrichung==true){
            naechsteImpfung=letzteImpfjahr+3;
        }
        else {
            naechsteImpfung=letzteImpfjahr+5;
        }
        return naechsteImpfung;
    }

    public static void main(String[] args) {
        int[] array1 = {1,2,3,4};
        umsortiern(array1);
        System.out.println(Arrays.toString(array1));
    }
}
