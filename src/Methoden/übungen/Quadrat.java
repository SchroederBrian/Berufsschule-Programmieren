package Methoden.übungen;

import java.util.Scanner;

public class Quadrat {
    public static void main(String[] args) {
        //Initialisierung
        Scanner tastatur = new Scanner(System.in);
        int zahl,wert;

        //Eingabe
        System.out.println("Bitte geben sie die Zahl zum Quadrieren ein:");

        //Verarbeitung
        wert = quadrieren(zahl = tastatur.nextInt());

        //Ausgabe
        System.out.println("Die Zahl" + zahl + "²: " + wert);
    }

    private static int quadrieren(int eingabe) {
        return eingabe * eingabe;
    }
}
