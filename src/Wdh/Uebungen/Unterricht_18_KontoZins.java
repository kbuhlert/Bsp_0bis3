package Wdh.Uebungen;

public class Unterricht_18_KontoZins {

    //Erstellen Sie eine Methode mit den Parametern:
    //Jahre
    //Einlage
    //Zinssatz
    //Geben Sie den Kontostand in jedem Jahr aus
    //Wieviel Geld ist das nach 10 Jahren am Konto bei
    //2000€ Startkapital und 2,5% Zinsen p.a.?

    public static void kontostand (int jahre, double einlage, double zins){
        for (int i=1; i<=jahre;i++){
            System.out.println("kontostand="+einlage + " Jahr: " + (i-1));
            einlage = einlage+(einlage*zins/100);
        }
        System.out.println("kontostand="+einlage + " Jahr: " + jahre);
    }

    public static void main(String[] args) {
        kontostand(15,2000,2.5);
    }
}
