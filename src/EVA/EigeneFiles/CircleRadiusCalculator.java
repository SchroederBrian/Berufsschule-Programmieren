package EVA.EigeneFiles;

import java.util.*;

public class CircleRadiusCalculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Geben Sie den Durchmesser des Kreises ein: ");


        int diameter = scanner.nextInt();

        double radius = diameter / 2.0;

        double area = Math.PI * Math.pow(radius, 2);

        double circumference = 2 * Math.PI * radius;


        System.out.println("Der Radius des Kreises ist: " + radius);

        System.out.println("Die Fläche des Kreises ist: " + area);

        System.out.println("Der Umfang des Kreises ist: " + circumference);
        
        scanner.close();
    }
}