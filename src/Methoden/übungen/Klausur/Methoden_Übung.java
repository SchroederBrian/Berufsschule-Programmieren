package Methoden.übungen.Klausur;

public class Methoden_Übung {
    public static void main(String[] args) {
        //erstelle eine methode in der etwas gerechnet wird und das ergebnis geben wir wieder als return zurück

        berechnen(5, 6, "+");
    }

    public static void berechnen(double zahl1, double zahl2, String operator) {
        double ergebnis;

        switch (operator) {
            case "+":
                ergebnis = zahl1 + zahl2;
                break;
            case "-":
                ergebnis = zahl1 - zahl2;
                break;
            case "*":
                ergebnis = zahl1 * zahl2;
                break;
            case "/":
                ergebnis = zahl1 / zahl2;
                break;
            default:
                System.out.println("Ungültiger Operator");
                return;
        }

        System.out.println("Das Ergebnis ist: " + ergebnis);
    }
}
