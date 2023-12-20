package Klausuren;

import java.util.Scanner;

public class Wettkampf  {
    public static void main(String[] args) {
        int punkteSpieler1 = 0;
        int punkteSpieler2 = 0;
        int punkteSatzgewinn = 15;
        int spieler;

        Scanner tastatur = new Scanner(System.in);

        while (punkteSpieler1 < 15 || punkteSpieler2 < 15 ) {

            System.out.println("Bitte geben Sie \"1\" falls Spieler 1 ein Punkt erhält oder \"2\" falls Spieler 2 den Punkt erhält: ");

            spieler = tastatur.nextInt();

            if (spieler == 1) {
                punkteSpieler1++;
            } else if (spieler == 2) {
                punkteSpieler2++;
            } else {
                System.out.println("Falsche Eingabe!");
            }

            if (punkteSpieler1 >= punkteSatzgewinn) {
                System.out.println("Satzgewinn Spieler 1");
                System.exit(0);
            } else if (punkteSpieler2 >= punkteSatzgewinn) {
                System.out.println("Satzgewinn Spieler 2");
                System.exit(0);
            }
        }

        tastatur.close();
    }
}

