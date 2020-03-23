import java.util.Arrays;

public class Beispiel_7b {
    public static void main(String[] args) {
        for(int zahl = 1; zahl<=30; zahl++){
            String fizzBuzz = fizzBuzzString(zahl);
            System.out.println(fizzBuzz);
        }
        System.out.println("-----");
        System.out.println(Arrays.toString(fizzBuzzArray()));


    }

    public static String fizzBuzzString (int zahl){
        if (zahl%3==0 && zahl%5==0){
            return "FizzBuzz";
        } else if (zahl%3==0){
            return "Fizz";
        }else if (zahl%5==0){
            return "Buzz";
        }else{
            String zahlWort = Integer.toString(zahl);
            return zahlWort;
        }
    }

    public static String [] fizzBuzzArray(){

        int startwert = 1;
        int stoppwert = 50;
        int laenge = stoppwert-startwert;
        String[] fizzBuzzArray = new String[laenge];
        for(int zahl = 0; zahl<fizzBuzzArray.length; zahl++){
            String fizzBuzz = fizzBuzzString(zahl);
            fizzBuzzArray[zahl] = fizzBuzz;
        }
        return fizzBuzzArray;
    }
}
