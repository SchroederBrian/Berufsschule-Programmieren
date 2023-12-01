package Fahrkartenautomat;

import java.util.Scanner;

public class A421_Rabattsystem {
    public static void main(String[] args) {
        Scanner tastatur = new Scanner(System.in);
        double rabatt;
        double endPreis;
        double bestellWert;

        System.out.print("Bitte geben sie Ihren Bestellwert ein: ");
        bestellWert = tastatur.nextFloat();

        if (bestellWert >= 0 && bestellWert <= 100) {
            rabatt = 0.1; // 10 % Rabatt
        } else if (bestellWert > 100 && bestellWert <= 500) {
            rabatt = 0.15; // 15 % Rabatt
        } else {
            rabatt = 0.2; // 20 % Rabatt
        }

        endPreis = bestellWert - (bestellWert * rabatt);
        System.out.println("Der Bestellwert abzüglich Rabatt beträgt: " + endPreis + "€");

        tastatur.close();
    }
}
