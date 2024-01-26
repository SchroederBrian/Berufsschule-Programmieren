package Fahrkartenautomat;

public class A11_Uebung {
    public static void main(String[] args) {
        //Übung 1.1.2 1 Variablen
        int cent = 70;
        double maximum = 95.50;

        //Übung 1.1.2 2 Variablen
        boolean a = true;
        short b = -1000;
        double c = 1.255;
        char d = '#';
        byte e = 8;
        long f = 2147483648L;

        //Übung 1.1.2 3 Variablen
        String name = "Ich Bin Cool";
        final short check_nr = 8765;

        //Übung 1.1.3 1 Variablen
        int ergebnis = 4 + 8 * 9 - 1;
        int zaehler = 1;
        int divisionErgebnis = 22 / 6;




        //Übung 1.1.2 1 Verarbeitung
        cent = cent + 80;

        //Übung 1.1.3 1 Verarbeitung
        zaehler++;




        //Übung 1.1.2 1 Ausgabe
        System.out.println("Cent: " + cent);
        System.out.println("Maximum: " + maximum);

        System.out.println();

        //Übung 1.1.2 2 Ausgabe
        System.out.println("A: " + a);
        System.out.println("B: " + b);
        System.out.println("C: " + c);
        System.out.println("D: " + d);
        System.out.println("E: " + e);
        System.out.println("F: " + f);

        System.out.println();

        //Übung 1.1.2 3 Ausgabe
        System.out.println("Text: " + name);
        System.out.println("Check Number: " + check_nr);

        System.out.println();

        //Übung 1.1.2 4
        /*   Datentypen in Programmiersprachen sind wichtig, um Daten zu klassifizieren,
         *    Fehler zu verhindern, die Effizienz zu steigern und die Codequalität zu verbessern.
         */


        //Übung 1.1.3 1 Ausgabe
        System.out.println("Ergebnis: " + ergebnis);
        System.out.println("Zaehler " + zaehler);
        System.out.println("Division " + divisionErgebnis);

        // Übung 1.1.3 1
        int x = 5;

        int result1 = 5 + x++;
        System.out.println("Ergebnis von 5 + x++: " + result1);

        x = 5;

        int result2 = 5 + ++x;
        System.out.println("Ergebnis von 5 + ++x: " + result2);

        System.out.println();

        /*
         *   x++ (Post-Inkrement): Hier wird x zuerst verwendet und dann um 1 erhöht. Das bedeutet, dass, wenn Sie x++
         *   in einem Ausdruck verwenden, Sie zuerst den aktuellen Wert von x sehen, bevor er erhöht wird.
         *
         *   ++x (Pre-Inkrement): Hier wird x zuerst um 1 erhöht und dann verwendet. Das bedeutet, dass, wenn Sie ++x
         *   in einem Ausdruck verwenden, Sie den bereits um 1 erhöhten Wert von x sehen.
         */


        //Übung 1.1.3 2
        /*  false  &&  false  =   false
         *   false  &&  true   =   false
         *   true   &&  true   =   true
         *   true   &&  false  =   false
         *
         *   false  ||  false  =   false
         *   false  ||  true   =   true
         *   true   ||  true   =   true
         *   true   ||  false  =   true
         */

        //Übung 1.1.3 3
        int schalter = 10;
        boolean bedingung1 = (schalter > 7 && schalter < 12);
        boolean bedingung2 = (schalter != 10 || schalter == 12);

        System.out.println("Ist schalter groesser als 7 und kleiner als 12? " + bedingung1);
        System.out.println("Ist schalter ungleich 10 oder gleich 12? (fasle = ungleich, true = gleich) " + bedingung2);

        System.out.println();

        //Übung 1.1.3 4
        String zeichenkette = "Meine Oma " + "faehrt im " + "Huehnerstall Motorrad.";

        System.out.println(zeichenkette);
    }
}
