package HelloWorld;

import java.util.Scanner;

public class A343_Zinsen {
    public static void main(String[] args) {
        double Euro;
        double Prozent;
        double Jahre;
        double Vermoegen;
        double Zins;

        //Eingabe
        Scanner tastatur = new Scanner(System.in);
        System.out.println("Einzahlung in Euro:");
        Euro = tastatur.nextDouble();
        System.out.println("Zinsen in Prozent:");
        Prozent = tastatur.nextDouble();
        System.out.println("Jahre:");
        Jahre = tastatur.nextDouble();

        //Verarbeitung
        Vermoegen = Euro * (Prozent / Jahre);

        //Ausgabe
        System.out.println("Der Investor hat " + Vermoegen + " Euro erwirtschaftet.");
        Zins = Euro * Math.pow(1 + (Prozent / 100), Jahre);
        System.out.println("Der Investor hat insgesamt " + Zins + " Euro erhalten (mit Zinsen)");

        tastatur.close();
    }
}
