package Fahrkartenautomat;

public class A115_Spezialkonfiguration {
    public static void main(String[] args) {
        String typ = "Automat AVR";
        String bezeichnung = "Q2021_FAB_A";
        char sprachModul = 'd';
        final int PRUEFNR = 4;
        double prozent;
        double maximum = 100.00;
        double patrone = 46.24;
        int summe;
        int euro;
        int muenzenCent = 1280;
        int muenzenEuro = 130;
        int cent;

        String name = typ + " " + bezeichnung;
        prozent = maximum - patrone;
        summe = muenzenCent + muenzenEuro * 100;
        euro = summe / 100;
        cent = summe % 100;

        boolean status = (euro <= 150) && (euro >= 50) && (cent != 0) && (sprachModul == 'd') && (prozent >= 50.00) && (!(PRUEFNR == 5 || PRUEFNR == 6));

        System.out.println("Name: " + name);
        System.out.println("Sprache: " + sprachModul);
        System.out.println("Pruefnummer: " + PRUEFNR);
        System.out.println("Fuellstand Patrone: " + prozent + " %");
        System.out.println("Summe Euro: " + euro + " Euro");
        System.out.println("Summe Rest: " + cent + " Cent");
        System.out.println("Status: " + status);
    }
}
