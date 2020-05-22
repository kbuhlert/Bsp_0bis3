package Wdh.Uebungen;

public class Unterricht_26_Tamagotchi {

    int x;
    int y;
    int futterstand;

    public void bewegen (String richtung, int schrittzahl){
        if(futterstand>=schrittzahl) {
            switch (richtung) {
                case ("links"):
                    x = x - schrittzahl;
                    futterstand = futterstand - schrittzahl;
                    break;
                case ("rechts"):
                    x = x + schrittzahl;
                    futterstand = futterstand - schrittzahl;
                    break;
                case ("oben"):
                    y = y + schrittzahl;
                    futterstand = futterstand - schrittzahl;
                    break;
                case ("unten"):
                    y = y - schrittzahl;
                    futterstand = futterstand - schrittzahl;
                    break;
            }
        }else System.out.println("ich brauche futter um zu gehen");
    }

    public void futtern (int futterNeu){
        futterstand = futterstand+futterNeu;
    }

    public static void main(String[] args) {
        Unterricht_26_Tamagotchi herbert = new Unterricht_26_Tamagotchi();
        herbert.futterstand=5;
        herbert.x=6;
        herbert.y=4;
        System.out.println("x=" + herbert.x + " y=" + herbert.y);
        herbert.bewegen("unten",4);
        System.out.println("x=" + herbert.x + " y=" + herbert.y);
        herbert.bewegen("links",6);
        System.out.println("x=" + herbert.x + " y=" + herbert.y);
        herbert.futtern(5);
        herbert.bewegen("links",6);
        System.out.println("x=" + herbert.x + " y=" + herbert.y);

    }

}
