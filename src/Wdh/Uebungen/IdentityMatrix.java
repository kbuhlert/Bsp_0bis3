package Wdh.Uebungen;

import java.util.Arrays;

public class IdentityMatrix {
    /*Die Methode soll mittels 2d double Array eine Einheitsmatrix
erstellen, deren Größe über den Parameter size bestimmt ist
und diese zurückliefern. Die Diagonale der Matrix soll mit “1.0”
initialisiert werden, die restlichen Werte sind “0.0”.*/
    public static void main(String[] args) {


        System.out.println(Arrays.toString(generateIdentityMatrix(6)));

    }

    public static double[][] generateIdentityMatrix (int size){

        double[][] identitym = new double[size][size];

        for (int i=0; i<identitym.length;i++){
            identitym[i][i] = 1.0;
        }
        return identitym;
    }
}
