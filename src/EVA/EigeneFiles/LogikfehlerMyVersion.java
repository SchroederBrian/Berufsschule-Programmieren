package EVA.EigeneFiles;

public class LogikfehlerMyVersion {
    public static void main(String[] args) {

        int[] zahlen = {85, 42, 33, 25, 14, 12, 66, 58, 11, 58, 34, 20};
        int kleinsteZahl = zahlen[0];

        for (int i = 1; i < zahlen.length; i++) {
            if (zahlen[i] < kleinsteZahl) {
                kleinsteZahl = zahlen[i];
            }
        }

        System.out.println("Das Programm gibt die kleinste Zahl von sechs ganzen Zahlen aus.");
        System.out.println("Die kleinste Zahl ist: " + kleinsteZahl);
    }
}
