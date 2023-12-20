package Fahrkartenautomat;

import java.util.Scanner;

public class A44_Kalender {
    public static void main(String[] args) {
        int tage = 0;
        int monat;
        Scanner tastatur = new Scanner(System.in);

        System.out.print("Wie lautet der Monat (1-12): ");
        monat = tastatur.nextInt();

        switch (monat) {
            case 1:
                //januar
                tage = 31;
                ausgabe(tage, 1);
                break;
            case 2:
                //februar
                tage = 28;
                ausgabe(tage, 2);
                break;
            case 3:
                //märz
                tage = 31;
                ausgabe(tage, 3);
                break;
            case 4:
                //april
                tage = 30;
                ausgabe(tage, 4);
                break;
            case 5:
                //mai
                tage = 31;
                ausgabe(tage, 5);
                break;
            case 6:
                //juni
                tage = 30;
                ausgabe(tage, 6);
                break;
            case 7:
                //juli
                tage = 31;
                ausgabe(tage, 7);
                break;
            case 8:
                //august
                tage = 31;
                ausgabe(tage, 8);
                break;
            case 9:
                //september
                tage = 30;
                ausgabe(tage, 9);
                break;
            case 10:
                //october
                tage = 31;
                ausgabe(tage, 10);
                break;
            case 11:
                //november
                tage = 30;
                ausgabe(tage, 11);
                break;
            case 12:
                //dezember
                tage = 31;
                ausgabe(tage, 12);
                break;
            default:
                System.out.println("Die eingegebene zahl ist kein gültiger Monat, bitte starte das Programm neu und wähle von 1-12 aus.");
        }

        tastatur.close();
    }

    private static void ausgabe(int tage, int monat) {
        System.out.printf("Der %d-te Monat im Jahr hat %d Tage.", monat, tage);
    }
}