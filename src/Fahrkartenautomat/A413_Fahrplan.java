package Fahrkartenautomat;

import java.util.Scanner;

public class A413_Fahrplan {
    public static void main(String[] args) throws InterruptedException {
        int fahrzeit;
        String eingabe;

        Scanner tastatur = new Scanner(System.in);

        System.out.println("Du startest in Berlin Hbf. und fährst nach Spandau.");
        fahrzeit = 8;

        System.out.println("Möchtest du in Spandau halten?");
        eingabe = tastatur.nextLine();

        if (eingabe.equalsIgnoreCase("ja") || eingabe.equalsIgnoreCase("yes") || eingabe.equalsIgnoreCase("true") || eingabe.equals("1")) {
           fahrzeit = fahrzeit + 2;
        }

        System.out.println("Möchtest du nach Hamburg fahren?");
        eingabe = tastatur.nextLine();
        if (eingabe.equalsIgnoreCase("ja") || eingabe.equalsIgnoreCase("yes") || eingabe.equalsIgnoreCase("true") || eingabe.equals("1")) {
            fahrzeit = fahrzeit + 96;
            System.out.println("Der Zug endet in Hamburg\n");
        }else {
            fahrzeit = fahrzeit + 34;

            System.out.println("Der zug fährt weiter richtung Stendal. Möchtest du Stendal Umfahren?");
            eingabe = tastatur.nextLine();
            if (eingabe.equalsIgnoreCase("ja") || eingabe.equalsIgnoreCase("yes") || eingabe.equalsIgnoreCase("true") || eingabe.equals("1")) {
                fahrzeit = fahrzeit + 6;
            }else {
                fahrzeit = fahrzeit + 16;
            }

            System.out.println("Möchtest du nach Wolfsburg?");
            eingabe = tastatur.nextLine();
            if (eingabe.equalsIgnoreCase("ja") || eingabe.equalsIgnoreCase("yes") || eingabe.equalsIgnoreCase("true") || eingabe.equals("1")) {
                System.out.println("Der Zug endet in Wolfsburg\n");
                fahrzeit = fahrzeit + 29;
            }else {
                System.out.println("Möchtest du nach Braunschweig?");
                eingabe = tastatur.nextLine();
                if (eingabe.equalsIgnoreCase("ja") || eingabe.equalsIgnoreCase("yes") || eingabe.equalsIgnoreCase("true") || eingabe.equals("1")) {
                    System.out.println("Der Zug endet in Braunschweig\n");
                    fahrzeit = fahrzeit + 50;
                }else {
                    System.out.println("Du möchtest also nach Hannover. Der Zug endet in Hannover\n");
                    fahrzeit = fahrzeit + 62;
                }
            }
        }

        System.out.println("Let me do it for you <3");
        for (int i = 0; i < 8; i++) {
            System.out.print("=");
            Thread.sleep(200);
        }

        System.out.println("\nDeine Fahrzeit beträgt: " + fahrzeit + "min");

        tastatur.close();
    }
}
