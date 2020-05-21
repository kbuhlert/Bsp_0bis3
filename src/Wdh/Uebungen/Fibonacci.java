package Wdh.Uebungen;

import java.util.Arrays;

public class Fibonacci {

    //Die Fibonacci Reihe enthält die folgenden Zahlen (in dieser Reihenfolge):
    //0 1 1 2 3 5 8 13 21 …
    //Schreibe eine rekursive Methode welche die Fibonacci-Reihe bis zum oberen Limit von 1000 ausgibt.
    //(Tipp: Sie muss mindestens 2 Parameter haben)

    public static void fibonacciRekursiv2(int bis, int wert1, int wert2){
        int summe = wert1 +wert2;
            if (summe>bis)
                return;
            else  System.out.print(summe +",");
        wert1 = wert2;
        wert2 = summe;
        fibonacciRekursiv2(bis,wert1,wert2);
    }

    public static void fibonaccRekursiv1(int a, int b){
        int ergeb = a+b;
        if (ergeb>80){
            return;
        }else{
            System.out.print(ergeb + ",");
            a=b;
            b=ergeb;
            fibonaccRekursiv1(a,b);}
    }
    //Schreibe eine while oder do-while Schleife, welche die Fibonacci-Reihe bis zum oberen Limit von 1000 ausgibt.
    //(Tipp: Es braucht mehr als eine Variable. Die ersten 3 Werte können von Beginn an feststehen!)

    public static void fibonacciWhile (int ziel){
        int a = 0;
        int b = 1;
       System.out.print(a + "," + b);
        int summe = a+b;
        while (summe<=ziel){
            System.out.print(","+summe);
            a=b;
            b=summe;
            summe =a+b;
        }
    }

    public static void fibonacciDoWhile(int ziel){
        int a=0;
        int b=1;
        System.out.print(a + "," + b);
        int summe = a+b;
        do{
            System.out.print("," + summe);
            a=b;
            b=summe;
            summe=a+b;
        }while (summe<=ziel);
    }

    public static void fibonacciFor(int anzahlZahlen){
        int a = 0;
        int b = 1;
        System.out.print(a + "," + b);
        int summe = a+b;
        for (int i=2; i<=anzahlZahlen; i++){
            System.out.print("," + summe);
            a=b;
            b=summe;
            summe= a+b;
        }
    }

    public static int[] fibonacciArray (int[] array1){
        array1[0]=0;
        array1[1]=1;
        for(int i =2; i<array1.length; i++){
            array1[i]=array1[i-1]+array1[i-2];
        } return array1;
    }

    public static void main(String[] args) {

        fibonacciRekursiv2(80,0,1);
        System.out.println("--");
        fibonacciWhile(80);
        System.out.println("--");
        fibonacciDoWhile(80);
        System.out.println("--");
        fibonaccRekursiv1(0,1);
        System.out.println("--");
        fibonacciFor(15);
        System.out.println("--");
        //int[]array1 = new int[15];
        //fibonacciArray(array1);
        System.out.println(Arrays.toString(fibonacciArray(new int[15])));

    }

}
