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
                break;
            case 2:
                //februar
                tage = 28;
                break;
            case 3:
                //märz
                tage = 31;
                break;
            case 4:
                //april
                tage = 30;
                break;
            case 5:
                //mai
                tage = 31;
                break;
            case 6:
                //juni
                tage = 30;
                break;
            case 7:
                //juli
                tage = 31;
                break;
            case 8:
                //august
                tage = 31;
                break;
            case 9:
                //september
                tage = 30;
                break;
            case 10:
                //october
                tage = 31;
                break;
            case 11:
                //november
                tage = 30;
                break;
            case 12:
                //dezember
                tage = 31;
                break;
        }

        System.out.printf("Der %d-te Monat im Jahr hat %d Tage.", monat, tage);
        tastatur.close();
    }
}