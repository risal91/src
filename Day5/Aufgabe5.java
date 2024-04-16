package Day5;

/*
 * Aufgabe 5
 * Schreiben Sie eine Funktion, die die Stromkosten im Jahr für einen Computer berechnet.
 * Es soll der Verbrauch des Computers (in Watt),
 * die durchschnittliche Zeit, die der Computer am Tag läuft in Stunden
 * und die Stromkosten pro kWh als Argumente an die Funktion übergeben werden.
 * Wer die Werte seines Computers, oder die Stromkosten pro kWh seines Anbieters nicht kennt,
 * sollte mit folgenden Werten arbeiten:
 * Verbrauch eines Laptops: 70
 * Stromkosten kWh: 25 Cent
 * Erstellen Sie einen PAP, ein Struktogramm, oder Pseudocode und anschließend ein Java-Programm.
 */



public class Aufgabe5 {

    public static void stromKostenKalkulator(double watt, double zeit, double kWh){
        double durchTagKosten = watt * zeit / 1000 * kWh;
        System.out.printf("Tägliche Kosten vom PC %.2f Euro \n", durchTagKosten);
        durchTagKosten = durchTagKosten * 365;

        System.out.printf("Jährliche Kosten vom PC %.2f Euro \n", durchTagKosten);

    }


    public static void main(String[] args) {
        double laufzeit = 18;
        double stromkosten = 0.25;
        double verbrauch = 70;

        stromKostenKalkulator(verbrauch,laufzeit,stromkosten);


    }
}
