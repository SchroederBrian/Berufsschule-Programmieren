import java.util.Scanner;
public class A521_Addieren {
    public static void main(String[] args) {

        int startwert;
        int summe = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Bitte geben sie eine ganze Zahl ein:");
        startwert = sc.nextInt();

        for(int i = 1; i<=startwert;i++ ) {
            System.out.println(i);
            summe = i+ summe;
        }

        System.out.print("Die Summe ist:" + summe);



    }
}