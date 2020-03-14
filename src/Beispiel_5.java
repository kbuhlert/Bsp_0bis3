public class Beispiel_5 {
    //5a Methode: Taschenrechner
    static double taschenrechner (int zahl1, int zahl2, String operation){
        String rechenart = operation;
        if(rechenart.equals("plus")){
            return zahl1 + zahl2;
        }else if (rechenart.equals("minus")){
            return zahl1-zahl2;
        }else if (rechenart.equals("mal")){
            return zahl1*zahl2;
        }else if (rechenart.equals("durch")){
            return zahl1/zahl2;
        }
        else{return 0;}
    }
public static void main (String[] args){
        // Abruf 5a: Taschenrechnereingabe
    int zahl1 = 6;
    int zahl2 = 3;
    String rechenart = "durch";
double rechenergebnis = taschenrechner(zahl1,zahl2,rechenart);
    System.out.println("Das Ergebnis lautet: " + rechenergebnis);
}
}
