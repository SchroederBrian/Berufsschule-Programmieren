package EigeneApps;

import java.util.Scanner;

public class Taschenrechner {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Willkommen zum Taschenrechner!");
        System.out.println("Mögliche Operationen:");
        System.out.println("1. Grundrechenarten (+, -, *, /, ^)");
        System.out.println("2. Umfang Quadrat (umfang quadrat)");
        System.out.println("3. Volumen Quader (volumen quader)");
        System.out.println("4. Flächeninhalt Rechteck (flächeninhalt rechteck)");

        int operation = chooseOperation(scanner);

        switch (operation) {
            case 1 -> doBasicCalculation(scanner);
            case 2 -> calculateSquarePerimeter(scanner);
            case 3 -> calculateCuboidVolume(scanner);
            case 4 -> calculateRectangleArea(scanner);
            default -> System.out.println("Ungültige Operation ausgewählt. Programm wird beendet.");
        }
    }

    public static int chooseOperation(Scanner scanner) {
        System.out.print("Bitte wählen Sie eine Operation (1-4): ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Verbrauche das Zeilenumbruch-Zeichen

        return choice;
    }

    public static void doBasicCalculation(Scanner scanner) throws InterruptedException {
        double zahl1 = Zahlfunc(scanner, "1. Zahl eingeben:");
        String opera = operatorfunc(scanner);
        double zahl2 = Zahlfunc(scanner, "2. Zahl eingeben:");

        double ergebnis = calculate(zahl1, opera, zahl2);
        displayResult(ergebnis);

        restart(scanner);
    }

    public static void calculateSquarePerimeter(Scanner scanner) throws InterruptedException {
        double sideLength = Zahlfunc(scanner, "Seitenlänge des Quadrats eingeben:");

        double perimeter = 4 * sideLength;
        System.out.println("Der Umfang des Quadrats beträgt: " + perimeter);

        restart(scanner);
    }

    public static void calculateCuboidVolume(Scanner scanner) throws InterruptedException {
        double length = Zahlfunc(scanner, "Länge des Quaders eingeben:");
        double width = Zahlfunc(scanner, "Breite des Quaders eingeben:");
        double height = Zahlfunc(scanner, "Höhe des Quaders eingeben:");

        double volume = length * width * height;
        System.out.println("Das Volumen des Quaders beträgt: " + volume);

        restart(scanner);
    }

    public static void calculateRectangleArea(Scanner scanner) throws InterruptedException {
        double length = Zahlfunc(scanner, "Länge des Rechtecks eingeben:");
        double width = Zahlfunc(scanner, "Breite des Rechtecks eingeben:");

        double area = length * width;
        System.out.println("Der Flächeninhalt des Rechtecks beträgt: " + area);

        restart(scanner);
    }

    public static double Zahlfunc(Scanner scanner, String message) {
        System.out.println(message);
        String eingabe = scanner.nextLine();

        try {
            return Double.parseDouble(eingabe);
        } catch (NumberFormatException e) {
            System.out.println("Eingabe ist keine Zahl! Bitte gib eine Zahl ein!");
            return Zahlfunc(scanner, message);
        }
    }

    public static String operatorfunc(Scanner scanner) {
        System.out.println("Operator eingeben (+ | - | * | / | ^):");
        String opera = scanner.nextLine();

        if (!isValidOperator(opera)) {
            System.out.println("Ungültiger Operator. Bitte gib einen anderen Operator ein.");
            return operatorfunc(scanner);
        }

        return opera;
    }

    public static boolean isValidOperator(String opera) {
        return opera.equals("+") || opera.equals("-") || opera.equals("*") || opera.equals("/") || opera.equals("^");
    }

    public static double calculate(double zahl1, String opera, double zahl2) {
        switch (opera) {
            case "+" -> {
                return zahl1 + zahl2;
            }
            case "-" -> {
                return zahl1 - zahl2;
            }
            case "*" -> {
                return zahl1 * zahl2;
            }
            case "/" -> {
                if (zahl2 == 0) {
                    System.out.println("Division durch Null ist nicht erlaubt. Bitte gib eine andere Zahl ein.");
                    return calculate(zahl1, operatorfunc(new Scanner(System.in)), zahl2);
                }
                return zahl1 / zahl2;
            }
            case "^" -> {
                return Math.pow(zahl1, zahl2);
            }
            default -> {
                return 0;
            }
        }
    }

    public static void displayResult(double ergebnis) {
        System.out.println("Das Ergebnis ist: " + ergebnis);
    }

    public static void restart(Scanner scanner) throws InterruptedException {
        System.out.println("Weiter rechnen? (Ja/Nein)");
        String eingabe = scanner.nextLine();

        if (eingabe.equalsIgnoreCase("Ja") || eingabe.equalsIgnoreCase("j")) {
            main(null);
        } else if (eingabe.equalsIgnoreCase("Nein") || eingabe.equalsIgnoreCase("n")) {
            System.out.println("Rechner beendet!");
            System.exit(0);
        } else {
            System.out.println("Ungültige Eingabe. Bitte gib 'Ja' oder 'Nein' ein.");
            restart(scanner);
        }
    }
}