package Fahrkartenautomat;

public class A32_Format {
    public static void main(String[] args) {
        System.out.printf("%4s%s\n", "*", "*");
        System.out.printf("%s %6s\n", "*", "*");
        System.out.printf("%s %6s\n", "*", "*");
        System.out.printf("%4s%s\n\n", "*", "*");

        System.out.println("---------------------------");
        System.out.printf("| %-11s | %9s |\n", "Fahrenheit", "Celsius" );
        System.out.println("|-------------|-----------|");
        System.out.printf("| %-11d | %9.2f |\n", -20, -28.8889);
        System.out.printf("| %-11d | %9.2f |\n", -10, -23.3333);
        System.out.printf("| %-+11d | %9.2f |\n", 0, -17.7778);
        System.out.printf("| %-+11d | %9.2f |\n", 20, -6.6667);
        System.out.printf("| %-+11d | %9.2f |\n", 30, -1.1111);
        System.out.printf("| %-+11d | %9.2f |\n", 54, -20.000);
        System.out.println("---------------------------");
    }
}
