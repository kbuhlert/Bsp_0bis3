package Wdh.Uebungen;

public class Unterricht_11_RekursivZaehlen {
    //Erstellen Sie eine Klasse mit Methoden, sodass von von 99
    //bis 0 heruntergezählt und korrekt ausgegeben wird!
    //Fügen Sie einen Parameter hinzu mit dem man auswählen
    //kann, dass statt bei 0 bei einer beliebigen Zahl kleiner als
    //99 angehalten wird.
    //Bonus: Fügen Sie auch einen Startparameter hinzu (bisher
    //konstant 99). Falls dieser kleiner ist als der Endparameter,
    //beenden Sie die Methode.

    public static void runterzaehlen1 (int start, int stopp){
        if (start>=stopp){
            System.out.println(start);
            start--;
            runterzaehlen1(start,stopp);
        }
    }

    public static void main(String[] args) {
        runterzaehlen1(99,0);
    }
}
