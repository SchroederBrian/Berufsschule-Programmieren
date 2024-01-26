package Fahrkartenautomat;

import java.util.Scanner;

public class A422_Groessterwert {
    public static void main(String[] args) {
        Scanner Tastatur = new Scanner(System.in);
        int a, b, c, max;

        // Eingabe
        System.out.print("a: ");
        a = Tastatur.nextInt();
        System.out.print("b: ");
        b = Tastatur.nextInt();
        System.out.print("c: ");
        c = Tastatur.nextInt();

        // Verabeitung
        if (a > b) {
            if (a > c) {
                max = a;
            } else {
                max = c;
            }
        } else {
            if (b > c) {
                max = b;
            } else {
                max = c;
            }
        }

        String werIstMax = "";
        if (a == max) {
            werIstMax += "a, ";
        }
        if (b == max) {
            werIstMax += "b, ";
        }
        if (c == max) {
            werIstMax += "c";
        }

        System.out.println("Der größte eingegebene Wert ist: " + max);
        System.out.println("Der größte eingegebene Wert ist Nummer: " + werIstMax);
    }
}
