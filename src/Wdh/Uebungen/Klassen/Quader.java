package Wdh.Uebungen.Klassen;

public class Quader {
    double laenge;
    double breite;
    double hoehe;

    public Quader(double laenge, double breite, double hoehe) {
        this.laenge = laenge;
        this.breite = breite;
        this.hoehe = hoehe;
    }

    public double oberfläche(){
        double oberflaeche = 2*this.breite*this.hoehe + 2*this.hoehe*this.laenge;
        return oberflaeche;
    }

    public double volumen(){
        double volumen = this.breite*this.hoehe*this.laenge;
        return volumen;
    }



    public static void main(String[] args) {
        Quader quader1 = new Quader(63,17,3);
        System.out.println(quader1.volumen());
        Rechteck recht1 = new Rechteck();
        recht1.breite=19;
        recht1.laenge=41;
        System.out.println(recht1.flaeche());
        System.out.println(quader1.oberfläche());
        quader1.laenge=20;
        System.out.println(quader1.volumen());
    }
}
