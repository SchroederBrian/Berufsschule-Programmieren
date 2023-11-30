package Klausuren;

import java.util.Scanner;

public class ThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int z1 = scanner.nextInt();
        int z2 = scanner.nextInt();
        int z3 = scanner.nextInt();
        double summe;
        double produkt;
        int merian;

        summe = summerechnen(z1, z2, z3);
        produkt = produktrechner(z1, z2, z3);
        merian = z2;

        System.out.println("Zahl 1: " + z1 + "\nZahl 2: " + z2 + "\nZahl 3: " + z3 + "\nSumme: " + summe + "\nProdukt: " + produkt + "\nMerian: " + merian);
        
        scanner.close();
    }

    public static double summerechnen(int z1, int z2, int z3) {
        return z1 + z2 + z3;
    }

    public static double produktrechner(int z1, int z2, int z3) {
        return z1 * z2 * z3;
    }
}

