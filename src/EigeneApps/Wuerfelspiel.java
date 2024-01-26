package EigeneApps;

import java.util.Random;
import java.util.Scanner;

public class Wuerfelspiel {
    public static void main(String[] args) {
        /*
         * Programm Übungsprojekt
         * @author Max Mustermann (FS23-99)
         * @version 1.2 Programm kommentieren
         */

        //Variablen Initialisierung/Deklaration
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int zahl1, zahl2, augensumme;
        boolean playAgain = false;
        String eingabe;

        //Spiel Ablauf
        do {
            //Anweisungen
            do {
                System.out.println("Schreibe 'Roll', um den ersten Wuerfel zu wuerfeln");
                eingabe = scanner.nextLine();
            } while (!eingabe.equalsIgnoreCase("Roll"));

            zahl1 = random.nextInt(6) + 1;
            System.out.println("\nDu hast eine " + zahl1 + " gewuerfelt");

            do {
                System.out.println("\nSchreibe 'Roll', um den zweiten Wuerfel zu wuerfeln");
                eingabe = scanner.nextLine();
            } while (!eingabe.equalsIgnoreCase("Roll"));

            zahl2 = random.nextInt(6) + 1;
            System.out.println("\nDu hast eine " + zahl2 + " gewuerfelt");

            //Berechnung / Auswertung
            System.out.println("\nErster Wuerfel ist: " + zahl1 + "    Zweiter Wuerfel ist: " + zahl2);
            augensumme = zahl1 + zahl2;
            System.out.println("\nAugensumme: " + augensumme);

            if (augensumme >= 12) {
                System.out.println("\nResultat: 1. Preis");
            } else if (augensumme >= 10) {
                System.out.println("\nResultat: 2. Preis");
            } else if (augensumme >= 7) {
                System.out.println("\nResultat: 3. Preis");
            } else if (augensumme == 6) {
                System.out.println("\nResultat: Trostpreis");
            } else {
                System.out.println("\nResultat: Niete");
            }

            //Erneut Spielen abfrage
            do {
                System.out.println("Möchtest du noch einmal spielen? (Ja/Nein)");
                String playAgainInput = scanner.nextLine().toLowerCase();

                if (playAgainInput.equals("ja")) {
                    playAgain = true;
                    break;
                } else if (playAgainInput.equals("nein")) {
                    playAgain = false;
                    break;
                } else {
                    System.out.println("Ungültige Eingabe. Bitte nur 'Ja' oder 'Nein' eingeben.");
                }
            } while (true);

            System.out.print("\033[H\033[2J");
            System.out.flush();
        } while (playAgain);

        scanner.close();
    }
}