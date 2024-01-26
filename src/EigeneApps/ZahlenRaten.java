package EigeneApps;

import java.util.Random;
import java.util.Scanner;

public class ZahlenRaten {

    public static void main(String[] args) {
        Random rand = new Random();
        int randomZahl = rand.nextInt(100);
        int zahl;
        Scanner scanner = new Scanner(System.in);

        do {
            zahl = zahlEingabe(scanner);

            if (zahl > randomZahl) {
                System.out.println("\nDie Zahl ist kleiner als deine");
            }
            if (zahl < randomZahl) {
                System.out.println("\nDie Zahl ist größer als deine");
            }
        } while (zahl != randomZahl);
        System.out.println("\nDu hast die Zahl erraten! Glückwunsch");
        scanner.close();
    }
    

    public static int zahlEingabe(Scanner scanner) {
        System.out.println("Gib eine Zahl ein:");
        return scanner.nextInt();
    }
}
