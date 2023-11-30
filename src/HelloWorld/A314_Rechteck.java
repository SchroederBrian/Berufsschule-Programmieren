package HelloWorld;

import java.util.Scanner;

public class A314_Rechteck {
    public static void main(String[] args) {
        int SeiteA;
        int SeiteB;
        int ergebnisUmfang;
        int ergebnisFlaeche;

        //Eingabe
        Scanner tastatur = new Scanner(System.in);
        System.out.print("Bitte geben Sie die Laenge der ersten Seite ein: ");
        SeiteA = tastatur.nextInt();
        System.out.print("Bitte geben Sie die Laenge der zweiten seite ein: ");
        SeiteB = tastatur.nextInt();

        //Verarbeitung
        ergebnisUmfang = 2 * SeiteA + 2 * SeiteB;
        ergebnisFlaeche = SeiteA * SeiteB;

        //Ausgabe
        System.out.println();
        System.out.println("Umfang: " + ergebnisUmfang + "cm");
        System.out.println("Flaeche: " + ergebnisFlaeche + "cm^2");

        tastatur.close();
    }
}
