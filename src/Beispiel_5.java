public class Beispiel_5 {
    //5a Methode: Taschenrechner
    static double taschenrechner (double zahl1, double zahl2, String operation){
        if(operation.equals("plus")){
            return zahl1 + zahl2;
        }else if (operation.equals("minus")){
            return zahl1-zahl2;
        }else if (operation.equals("mal")){
            return zahl1*zahl2;
        }else if (operation.equals("durch")){
            return zahl1/zahl2;
        }
        else{return 0;}
    }
    //5b Methode Vergleiche Strings
    static int vergleiche (String s1, String s2){
        if(s1.contains(s2)){
            return 1;
        }else if(s2.contains(s1)){
            return 2;
        }else if(s1.contains(s2) && s2.contains(s1)){
            return 3;
        } else {return 4;}
    }
    //5c Methode Zeilensumme eines zweidimensionalen Arrays
    static int zeilensumme (int [][] zahlen2D, int zeilenAuswahl){
        int zeilensumme;
        if(zeilenAuswahl ==1){
            zeilensumme = zahlen2D[0][0] + zahlen2D[0][1] + zahlen2D[0][2];
            return zeilensumme;
        } else if(zeilenAuswahl ==2){
            zeilensumme = zahlen2D[1][0] + zahlen2D[1][1] + zahlen2D[1][2];
            return zeilensumme;
        }else if(zeilenAuswahl ==3){
            zeilensumme = zahlen2D[2][0] + zahlen2D[2][1] + zahlen2D[2][2];
            return zeilensumme;
        } else {return 0;}
    }

public static void main (String[] args){
        // Abruf 5a: Taschenrechnereingabe
    double zahl1 = 63.0;  //Eingabe Zahl 1
    double zahl2 = 5.0;  //Eingabe Zahl 2
    String operation = "durch"; //Eingabe der Rechenart "plus", "minus", "mal", "durch"

    double rechenergebnis = taschenrechner(zahl1,zahl2,operation);
    System.out.println("Das Ergebnis lautet: " + rechenergebnis);

        //Aufruf 5b: Vergleiche String
    String s1 = "ZAMZAM";   //Eingabe von der ersten Buchstabenfolge
    String s2 = "ZAM";      //Eingabe von der zweiten Buchstabenfolge

    if(vergleiche(s1,s2)==1){   //Abruf der Methode und Prüfung des Returnwertes mit den oben eingegebenen Strings s1 und s2
        System.out.println("Die Buchstabenfolge " + s1 + " enthält die Buchstabenfolge " + s2 + " .");
    }else if (vergleiche(s1,s2)==2){
        System.out.println("Die Buchstabenfolge " + s1 + " ist in der Buchstabenfolge " + s2 + " enthalten.");
    }else if (vergleiche(s1,s2)==3){
        System.out.println("Die Buchstabenfolgen " + s1 + " und " + s2 + " sind ineinander enthalten.");
    }else {
        System.out.println("String 1 und String 2 enthalten nicht die gleiche Buchstabenfolge");}

        //Aufruf 5c: Zeilensumme eines Zweidimensionalen Arrays
    int[][] new2DArray = new int[][] {{1,2,3},{5,5,5},{9,8,7}}; // hier 2D Array (3Zeilen, 3Spalten) befüllen
    int zeilenAuswahl = 3;      //hier Zeile auswählen von der Summe gebildet werden soll
    System.out.println(zeilensumme(new2DArray,zeilenAuswahl));  //Ausgabe der Zeilensumme

    }
}
