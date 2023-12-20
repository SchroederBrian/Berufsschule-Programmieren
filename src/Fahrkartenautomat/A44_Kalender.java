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
                ausgabe(tage, 1, "Januar");
                break;
            case 2:
                //februar
                tage = 28;
                ausgabe(tage, 2, "Februar");
                break;
            case 3:
                //märz
                tage = 31;
                ausgabe(tage, 3, "März");
                break;
            case 4:
                //april
                tage = 30;
                ausgabe(tage, 4, "April");
                break;
            case 5:
                //mai
                tage = 31;
                ausgabe(tage, 5, "Mai");
                break;
            case 6:
                //juni
                tage = 30;
                ausgabe(tage, 6, "Juni");
                break;
            case 7:
                //juli
                tage = 31;
                ausgabe(tage, 7, "Juli");
                break;
            case 8:
                //august
                tage = 31;
                ausgabe(tage, 8, "August");
                break;
            case 9:
                //september
                tage = 30;
                ausgabe(tage, 9, "September");
                break;
            case 10:
                //october
                tage = 31;
                ausgabe(tage, 10, "October");
                break;
            case 11:
                //november
                tage = 30;
                ausgabe(tage, 11, "November");
                break;
            case 12:
                //dezember
                tage = 31;
                ausgabe(tage, 12, "Dezember");
                break;
            default:
                System.out.println("Die eingegebene zahl ist kein gültiger Monat, bitte starte das Programm neu und wähle von 1-12 aus.");
        }

        tastatur.close();
    }

    private static void ausgabe(int tage, int monat, String name) {
        System.out.printf("Der %d-te Monat im Jahr hat %d Tage. Der Name des Monats lautet: %s", monat, tage, name);
    }
}