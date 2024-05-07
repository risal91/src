package Day3;

/*
 * Aufgabe 1
 * Führen Sie 3 Integer-Variablen ein: auswahl, zahl1 und zahl2.
 * Über auswahl soll in einem Switch-Case eine Wahl getroffen werden, welche der 4 Grundrechenarten als Methode aufgerufen wird.
 * Sollte eine falsche Auswahl getroffen werden soll eine Ausgabe auf der Konsole erscheinen die anzeigt, welche Auswahl getroffen
 * wurde und das diese nicht korrekt oder verfügbar ist.
 * Schreiben Sie für jede Rechenart eine separate Methode und übergeben Sie an sie die für die Berechnung notwendigen Parameter
 * zahl1 und zahl2.
 * In der Methode soll dann die Berechnung durchgeführt und das Ergebnis an die Main zurückgegeben werden.
 * Die Ausgabe des Ergebnisses soll dann auf der Konsole erscheinen.
 *
 * Beachten: Geben Sie eine Fehlermeldung auf der Konsole aus, wenn durch 0 dividiert wird.
 */

import java.sql.SQLOutput;
import java.util.Scanner;

public class Aufgabe1 {
    public static void main(String[] args) {
        int auswahl;
        int zahl1;
        int zahl2;

        Scanner sc = new Scanner(System.in);

        System.out.println("Bitte geben sie die erste Zahl ein mit der sie Rechnen wollen!");
        System.out.println("");
        zahl1 = sc.nextInt();
        System.out.println("");
        System.out.println("Bitte geben sie die Zweite Zahl ein mit der sie Rechnen wollen!");
        System.out.println("");
        zahl2 = sc.nextInt();
        System.out.println("");


        System.out.println("Ihre erste zahl ist " + zahl1 + " und Ihre zweite zahl ist " + zahl2);
        System.out.println("Bitte wähle nun für die zahlen eine der 4 Grund Rechen Methoden ein");
        System.out.println("1. Addieren");
        System.out.println("2. Dividieren");
        System.out.println("3. Multiplizieren");
        System.out.println("4. Subtrahieren");
        System.out.println("");
        auswahl = sc.nextInt();
        System.out.println("");


        switch (auswahl) {
            case 1:
                System.out.println("Ihr Ergebnis lautet: " + (zahl1 + zahl2));
                break;
            case 2:
                if (zahl2 == 0){
                    System.out.println("wusstest du es noch nicht Teilen durch 0 ist nicht möglich denn:");
                    System.out.println("Stell dir vor, du hast null Kekse und verteilst die gleichmäßig auf null Freunde");
                    System.out.println("Wie viele Kekse bekommt jeder?");
                    System.out.println("Siehst du? Das macht keinen Sinn.");
                    System.out.println("Und das Krümelmonster ist traurig, weil es keine Kekse mehr gibt");
                    System.out.println("und du bist traurig, weil du keine Freunde hast!");
                }else {
                    System.out.println("Ihr Ergebnis lautet: " + (zahl1 / zahl2));
                }
                break;
            case 3:
                System.out.println("Ihr Ergebnis lautet: " + (zahl1 * zahl2));
                break;
            case 4:
                System.out.println("Ihr Ergebnis lautet: " + (zahl1 - zahl2));
                break;
            default:
                System.out.println("die zahl " + auswahl + "ist keine Gültigie eingabe");
                break;
        }

    }

}
