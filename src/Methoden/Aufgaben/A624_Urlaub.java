package Methoden.Aufgaben;

import java.util.Scanner;

public class A624_Urlaub {
    private static double reisebudget;
    private static double reserve;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Geben Sie Ihr gesamtes Reisebudget an: ");
        reisebudget = scanner.nextDouble();
        reserve = reisebudget * 0.1;

        System.out.printf("Ihre Reserve beträgt: %.2f€%n%n", reserve);

        while (reisebudget > reserve) {
            printMenu();

            System.out.print("Eingabe: ");
            char land = Character.toUpperCase(scanner.next().charAt(0));

            System.out.print("Wie viele Euros wollen Sie umwechseln? ");
            double betrag = scanner.nextDouble();

            if (betrag > reisebudget - reserve) {
                System.out.println("Sie haben nicht genügend Geld in der Reisekasse. Bitte geben Sie einen kleineren Betrag ein.");
                continue;
            }

            umrechnenUndAusgeben(land, betrag);

            reisebudget -= betrag;
            if (reisebudget < reserve) {
                System.out.println("Sie sind unter die Reserve gefallen.");
                if (mehrEinzahlenAbfragen(scanner)) {
                    continue;
                } else {
                    break;
                }
            }

            System.out.printf("Ihr freies Reisebudget beträgt: %.2f€ + %.2f€ (Reserve)%n%n", reisebudget, reserve);
        }

        System.out.println("Programm wurde beendet. Reserve: " + (reisebudget + reserve) + "€");
        scanner.close();
    }

    private static void printMenu() {
        System.out.println("Welches Land wollen Sie auswählen?");
        System.out.println("D: Dänemark");
        System.out.println("E: England");
        System.out.println("J: Japan");
        System.out.println("S: Schweiz");
        System.out.println("U: USA");
    }

    private static void umrechnenUndAusgeben(char land, double betrag) {
        double umgerechnet;
        String waehrung;

        switch (land) {
            case 'D':
                umgerechnet = betrag * 7.44;
                waehrung = "DKK (Kronen)";
                break;
            case 'E':
                umgerechnet = betrag * 0.88;
                waehrung = "GBP (Pfund)";
                break;
            case 'J':
                umgerechnet = betrag * 141;
                waehrung = "JPY (Yen)";
                break;
            case 'S':
                umgerechnet = betrag * 0.96;
                waehrung = "CHF (Franken)";
                break;
            case 'U':
                umgerechnet = betrag * 0.98;
                waehrung = "USD (Dollar)";
                break;
            default:
                System.out.println("Ungültige Eingabe. Bitte wählen Sie ein gültiges Land.");
                return;
        }

        System.out.printf("Sie erhalten %.2f %s%n", umgerechnet, waehrung);
    }

    private static boolean mehrEinzahlenAbfragen(Scanner scanner) {
        System.out.print("Wollen Sie mehr in Ihre Reisekasse einzahlen? (y/n) ");
        char antwort = Character.toUpperCase(scanner.next().charAt(0));

        if (antwort == 'Y') {
            System.out.print("Geben Sie den Wert ein den Sie einzahlen möchten: ");
            double einzahlung = scanner.nextDouble();
            reisebudget += einzahlung;
            reserve = reisebudget * 0.1;
            System.out.printf("Neuer Reisekassenwert: %.2f€ + %.2f€ (Reserve)%n%n", reisebudget, reserve);
            return true;
        } else {
            return false;
        }
    }
}
