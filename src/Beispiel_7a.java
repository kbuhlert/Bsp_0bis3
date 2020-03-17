public class Beispiel_7a {
    public static void main(String[] args) {
        fizzBuzz(20, 69);
    }

    static void fizzBuzz (int start, int stop){
        for (int i=start; i<=stop; i++ ){
            if (i%5==0 && i%3==0){
                System.out.println(i + " FizzBuzz");
            }else if (i%5==0){
                System.out.println(i + " Buzz");}
                else if (i%3==0){
                    System.out.println(i + " Fizz");
                } else {
                    System.out.println(i);
                }
            }
        }

}
