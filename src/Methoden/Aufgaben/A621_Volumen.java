package Methoden.Aufgaben;

import java.util.Scanner;

public class A621_Volumen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double seitenLaenge = eingabeSeitenLaenge(scanner);

        double volumen = volumenWuerfel(seitenLaenge);

        ausgabeErgebnis(seitenLaenge, volumen);
    }

    public static double eingabeSeitenLaenge(Scanner scanner) {
        System.out.print("Geben Sie die Seitenlänge des Würfels ein: ");
        return scanner.nextDouble();
    }

    public static double volumenWuerfel(double seitenLaenge) {
        return Math.pow(seitenLaenge, 3);
    }

    public static void ausgabeErgebnis(double seitenLaenge, double volumen) {
        System.out.println("Das Volumen des Würfels mit Seitenlänge " + seitenLaenge + " beträgt: " + volumen);
    }
}
