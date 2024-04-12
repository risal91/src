package Day2;

/*
 * Aufgabe 1
 * Schreiben Sie eine statische Methode, die die Quersumme einer Zahl berechnet.
 * Übergabewert (Parameter): int zahl
 * Rückgabewert: Die berechnete Quersumme.
 * Hinweis: Zur Berechnung bietet sich der Modulo-Operator % an.
 */

public class Aufgabe1 {
    public static int berechneQuersumme(int zahl) {
        int quersumme = 0;

        while (zahl > 0) {
            quersumme += zahl % 10;
            zahl /= 10;
        }

        return quersumme;
    }

    public static void main(String[] args) {
        int zahl = 12345;
        int quersumme = berechneQuersumme(zahl);

        System.out.println("Die Quersumme von " + zahl + " ist: " + quersumme);
    }
}
