package Day5;

/*
 * In ihrem Unternehmen werden neue Artikelnummern vergeben. Sie bestehen aus 5 Zahlen und einer Prüfziffer.
 * Sie sollen ein Programm entwerfen,
 * dass 5 einstellige Zahlen einliest und daraus die Prüfziffer errechnet und sie auf der Console ausgibt.
 * Wie Sie mit Fehleingaben umgehen, bleibt Ihnen überlassen.
 * Folgende Informationen erhalten Sie für die Berechnung der Prüfziffer:
 * - die geraden Zahlen werden addiert, die ungeraden Zahlen werden mit 3 multipliziert und anschließend addiert.
 * - die Prüfziffer ergibt sich aus der letzten Stelle der Summe.
 * Beispiel:    27493 => 2+4 = 6;
 *              7*3+9*3+3*3 = 57;
 *              6 + 57 = 63 => Prüfziffer 3
 *              Artikelnummer = 27493-3
 */


import java.util.Scanner;


public class Aufgabe6 {
    public static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {

        int zahl1;
        int zahl2;
        int zahl3;
        int zahl4;
        int zahl5;
        int prüfziffer;
        String Atrikelnummer;


        System.out.println("Geben sie eine 1. Zahl ein: ");
        zahl1 = Integer.parseInt(sc.nextLine());
        System.out.println("Geben sie eine 2. Zahl ein: ");
        zahl2 = Integer.parseInt(sc.nextLine());
        System.out.println("Geben sie eine 3. Zahl ein: ");
        zahl3 = Integer.parseInt(sc.nextLine());
        System.out.println("Geben sie eine 4. Zahl ein: ");
        zahl4 = Integer.parseInt(sc.nextLine());
        System.out.println("Geben sie eine 5. Zahl ein: ");
        zahl5 = Integer.parseInt(sc.nextLine());

        System.out.println("Dein Prüfziffer wird berrechnet");

        Atrikelnummer = String.valueOf(zahl1)+zahl2+zahl3+zahl4+zahl5;

        if (zahl1 % 2 != 0){
            zahl1 = zahl1 * 3;
        }
        if (zahl2 % 2 != 0){
            zahl2 = zahl2 * 3;
        }
        if (zahl3 % 2 != 0){
            zahl3 = zahl3 * 3;
        }
        if (zahl4 % 2 != 0){
            zahl4 = zahl4 * 3;
        }
        if (zahl5 % 2 != 0){
            zahl5 = zahl5 * 3;
        }

        prüfziffer = zahl1+zahl2+zahl3+zahl4+zahl5;
        if (prüfziffer > 10 ){
            prüfziffer = prüfziffer % 10;
        }

        System.out.println("Die neue Artikel Nummer ist " + Atrikelnummer + "-" + prüfziffer);







    }
}
