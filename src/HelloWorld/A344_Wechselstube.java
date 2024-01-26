package HelloWorld;

import java.util.Scanner;

public class A344_Wechselstube {
    public static void main(String[] args) {
        Scanner tastatur = new Scanner(System.in);

        // Benutzereingabe für Euro und Cent
        System.out.print("Bitte geben Sie den Betrag in Euro ein: ");
        int euro = tastatur.nextInt();
        System.out.print("Bitte geben Sie den Betrag in Cent ein: ");
        int cent = tastatur.nextInt();

        // Summe in Cent berechnen
        int gesamtInCent = euro * 100 + cent;

        System.out.println();
        System.out.println("Gesamtbetrag in Cent: " + gesamtInCent);

        // Berechnung der Anzahl von Münzen und Scheinen
        int[] muenzenScheine = new int[8];
        int[] werte = {200, 100, 50, 20, 10, 5, 2, 1};

        for (int i = 0; i < 8; i++) {
            muenzenScheine[i] = gesamtInCent / werte[i];
            gesamtInCent %= werte[i];
        }

        // Ausgabe der Ergebnisse
        System.out.println();
        System.out.println("Anzahl von Muenzen und Scheinen:");
        System.out.println("2 Euro: " + muenzenScheine[0]);
        System.out.println("1 Euro: " + muenzenScheine[1]);
        System.out.println("50 Cent: " + muenzenScheine[2]);
        System.out.println("20 Cent: " + muenzenScheine[3]);
        System.out.println("10 Cent: " + muenzenScheine[4]);
        System.out.println("5 Cent: " + muenzenScheine[5]);
        System.out.println("2 Cent: " + muenzenScheine[6]);
        System.out.println("1 Cent: " + muenzenScheine[7]);

        tastatur.close();
    }
}