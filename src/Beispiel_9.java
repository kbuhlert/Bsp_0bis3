import java.util.Arrays;

public class Beispiel_9 {
    //Fibonacci
    public static void main(String[] args) {

        //a) Ausgabe Rekursive Methode Fibonacci
        //fibonacciRecursiv(1, 3);
        /*int fiboA = 0;
        int fiboB = 1;
        System.out.println(fiboA);
        System.out.println(fiboB);*/

        fibonaccRekurs(0, 1);


        //b) While-Schleife Fbonacci
        int a = 0;
        int b = 1;
        int summe = a+b;
        int limit = 15;
        System.out.println(a);
        System.out.println(b);
        while(summe<=limit){
            a = b;
            b = summe;
            summe = a+b;
            System.out.println(summe);
        }

        //c) Aufruf Fibonacci Array
        int [] array1 = new int[25];
        fibonacciArray(array1);
        System.out.println(Arrays.toString(array1));

    }

    //a) Rekursive Methode Fibonacci

    /*public static void fibonacciRecursiv (int start, int limit){
        int ersteZahl = start;
        int zweiteZahl = start + 1;
        int summe = ersteZahl + zweiteZahl;
        //System.out.println(ersteZahl);
        //System.out.println(zweiteZahl);
        if(start<=limit){
            ersteZahl = zweiteZahl;
            zweiteZahl = summe;
            summe = ersteZahl + zweiteZahl;
            System.out.println(summe);
            fibonacciRecursiv(ersteZahl,limit);
        }else {return;}
        System.out.println(limit);*/
    public static void fibonaccRekurs (int a, int b){
        int ergeb = a+b;
        if (ergeb>50){
        return;
            }else{
             System.out.println(ergeb);
            a=b;
            b=ergeb;
            fibonaccRekurs(a,b);}
        }

        // c) Fibonacci mit Array

    public static int[] fibonacciArray (int[] array1){
        array1[0]=0;
        array1[1]=1;
        for(int i =2; i<array1.length; i++){
        array1[i]=array1[i-1]+array1[i-2];
        } return array1;
    }


}
