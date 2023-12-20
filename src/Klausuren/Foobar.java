package Klausuren;

import java.util.Scanner;

public class Foobar {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        int zahl;

        Scanner tastatur = new Scanner(System.in);

        System.out.print("Eingabe von eine ganze Zahl: ");

        zahl = tastatur.nextInt();

        if (zahl % 3 == 0 && zahl % 5 == 0) {
            System.out.println("foobar");
        } else if (zahl % 3 == 0) {
            System.out.println("foo");
        } else if (zahl % 5 == 0) {
            System.out.println("bar");
        } else {
            System.out.println(zahl);
        }

        tastatur.close();
    }
}