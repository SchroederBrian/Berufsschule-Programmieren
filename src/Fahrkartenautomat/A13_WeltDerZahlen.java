package Fahrkartenautomat;

public class A13_WeltDerZahlen {
    public static void main(String[] args) {

        // Wie viele Einwohner hat Berlin?
        int bewohnerBerlin = 3669491;

        // Wann wurde der erste Computer gebaut?
        short ersterComputer = 1941;

        // Wieviele Planeten hat unser Sonnensystem?
        byte anzahlPlaneten = 8;

        // Wieviele Sonnen sind in der Milchstraße?
        long sonnenMilchstrasse = 100000000000L;

        // Wie viel wiegt das schwerste Tier der Welt(kg)?
        int schwerstesTier = 200000;

        // Wie groß ist das kleinste Land der Erde?
        float flaecheKleinsteLand = 0.44F;

        // Wie viel km2 der Erde sind mit Wasser bedeckt?
        int wasser = 510100000;

        // An wieviel Tagen im Jahr regnet es durchschnittlich in Waialeale auf Hawaii?
        int regen = 350;

        // Wieviele Menschen leben auf der Erde?
        long einwohnerErde = 7837000000L;

        // Wie alt bist du? Wie viele Tage sind das?
        int alterJahre = 25;
        int alterTage = alterJahre * 365;

        System.out.println("Bewohner von Berlin: " + bewohnerBerlin);
        System.out.println("Erste Computer gebaut: " + ersterComputer);
        System.out.println("Anzahl an Planeten: " + anzahlPlaneten);
        System.out.println("Sonnen in der Milchstrasse: " + sonnenMilchstrasse);
        System.out.println("Schwerstes Tier: " + schwerstesTier + " kg");
        System.out.println("Flaeche kleinste Land (km2): " + flaecheKleinsteLand);
        System.out.println("Wasser der Erde (km2): " + wasser);
        System.out.println("Regen in Waialeale (Tagen): " + regen);
        System.out.println("Einwohner auf der Erde: " + einwohnerErde);
        System.out.println("Alter in Tagen: " + alterTage);
    }
}
