package Fahrkartenautomat;

import java.util.Scanner;// Um die Scanner-Klasse zu verwenden, muss diese importiert werden

public class A31_ScannerDemo {
    public static void main(String[] args) {
        int ganzzahl = 23;
        double kommazahl = 12.34;
        String wort = "Schatztruhe";
        boolean wahrheitswert = false;
        char buchstabe = 'U';

        Scanner tastatur = new Scanner(System.in); // Erzeugen eines Objekts der Klasse Scanner

        System.out.print("Bitte geben Sie eine ganze Zahl ein: ");
        ganzzahl = tastatur.nextInt();
        System.out.println("Sie haben " + ganzzahl + " eingegeben!");
        System.out.println();

        System.out.print("Bitte geben Sie eine Zahl mit Nachkommastellen ein: ");
        kommazahl = tastatur.nextDouble();
        System.out.println("Sie haben " + kommazahl + " eingegeben!");
        System.out.println();

        System.out.print("Bitte geben Sie ein Wort ein: ");
        wort = tastatur.nextLine();
        System.out.println("Sie haben '" + wort + "' eingegeben!");
        System.out.println();

        System.out.print("Bitte geben Sie einen Wahrheitswert ein (true / false): ");
        wahrheitswert = tastatur.nextBoolean();
        System.out.println("Sie haben '" + wahrheitswert + "' eingegeben!");
        System.out.println();

        System.out.print("Bitte geben Sie einen einzelnen Buchstaben ein: ");
        buchstabe = tastatur.next().charAt(0);
        System.out.println("Sie haben '" + buchstabe + "' eingegeben!");

        tastatur.close();
    }
}