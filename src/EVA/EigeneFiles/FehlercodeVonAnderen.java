package EVA.EigeneFiles;

import java.util.Scanner;

public class FehlercodeVonAnderen {
    public static void main(String[] args) {

        String name;
        int alter;
        int jahrDerGeburt;

        // Eingabe
        Scanner neu = new Scanner(System.in);

        System.out.print("Bitte geben Sie Ihren Namen ein: ");
        name = neu.nextLine();

        System.out.print("Bitte geben Sie Ihr Alter ein: ");
        alter = neu.nextInt();

        // Verarbeitung
        jahrDerGeburt = 2023 - alter;

        // Ausgabe
        System.out.println("Hallo, " + name);
        System.out.println("Sie sind im Jahr " + jahrDerGeburt + " geboren.");

        neu.close();
    }
}