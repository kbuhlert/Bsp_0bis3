package Wdh.Uebungen;

public class Unterricht_19_ForEachPinguine {

    public static String[] machPinguine(int soOft){
        String [] pinguinSpeicher = new String[soOft];
        for(int i=0; i<soOft;i++){
            pinguinSpeicher[i]="Ein Pinguin liest Zeitung, da steht:";
        }
        return pinguinSpeicher;
    }
    public static void pinguinForEach (int soOft){
        String[] pinguine = machPinguine(soOft);
        for(String s:pinguine){
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        pinguinForEach(6);
    }
}
