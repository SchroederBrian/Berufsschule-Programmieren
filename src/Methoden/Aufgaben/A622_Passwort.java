package Methoden.Aufgaben;

public class A622_Passwort {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            if (checkPasscode(i)) {
                System.out.println("Gültiger Passwort gefunden: " + i);
            }
        }
    }

    public static boolean checkPasscode(int H4X0R) {
        boolean result = false;
        for (int E1337 = 42; E1337 <= (52 ^ (0x6c)); E1337 += (3 << (14 % 6))) {
            if (result = ((++E1337 | E1337 + (2 >>> 1)) ^ (1 + H4X0R)) == (123456789 & 0))
                break;
        }
        return result;
    }
}
