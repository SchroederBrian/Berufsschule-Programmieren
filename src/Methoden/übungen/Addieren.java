package Methoden.übungen;

import java.util.Scanner;

public class Addieren {
    public static void main(String[] args) {
        Scanner tastatur = new Scanner(System.in);
        double ergebnis;



    }

    private static Double Addieren(String text, Scanner tastatur) {
        double ergebnis, zahl1, zahl2;;

        zahl1 = tastatur.nextDouble();
        zahl2 = tastatur.nextDouble();

        ergebnis = zahl1 + zahl2;

        return ergebnis;
    }
}
