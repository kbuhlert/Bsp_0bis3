package Wdh.Uebungen;

public class Unterricht_20_ForEachArray {
    public static void main(String[] args) {
        int[] array1 = new int[100];
        int quadieren = 200;
        for(int i=0;i<array1.length;i++){
            array1[i]=quadieren*quadieren;
            quadieren++;
        }
        for (Integer i : array1){
            if (i%3==0){
                System.out.println(i);
            }
        }
    }
}
