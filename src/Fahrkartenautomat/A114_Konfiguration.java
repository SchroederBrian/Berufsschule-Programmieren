package Fahrkartenautomat;

public class A114_Konfiguration {
    public static void main(String[] args) {
        String name = "Automat AVR Q2021_FAB_A";
        char sprachModul = 'd';
        final byte PRUEFNR = 4;
        double prozent = 49.16;
        int euro, cent;
        boolean status = true;

        prozent = 53.76;
        euro = 14;
        cent = 80;

        System.out.println("Name: " + name);
        System.out.println("Sprache: " + sprachModul);
        System.out.println("Pruefnummer : " + PRUEFNR);
        System.out.println("Fuellstand: " + prozent + " %");
        System.out.println("Summe Euro: " + euro +  " Euro");
        System.out.println("Summe Rest: " + cent +  " Cent");
        System.out.println("Status: " + status);
    }
}

