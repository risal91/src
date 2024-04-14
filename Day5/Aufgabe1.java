package Day5;

/* Aufgabe 1
 * Schreiben Sie eine statische Methode, die vom Benutzer eine Zahl abfragt und die eingegebene Zahl als Integer zurückgibt.
  Wenn der Benutzer etwas eingibt, was keine ganze Zahl ist, soll eine Fehlermeldung erscheinen und die Abfrage wird wiederholt.
 * Geben Sie zum Testen die eingegebene Zahl in der Konsole aus.
 * Rückgabewert: Die eingegebene Zahl
 */


import java.util.InputMismatchException;
import java.util.Scanner;

public class Aufgabe1 {
    static Scanner sc = new Scanner(System.in);

    public static int eingabeZahl(){
        int pimmel = 0;
        boolean buchstabenSalat;

        do {
            try {
                System.out.println("Bitte geben sie ganze Zahl ein: ");
                pimmel = Integer.parseInt(sc.nextLine());
                buchstabenSalat = false;

            } catch (InputMismatchException e) {
                System.err.println("Fehler: Bite geben Sie eine ganze Zahl ein.");
                buchstabenSalat = true;

            } catch (NumberFormatException e){
                System.err.println("Fehler: Bite geben Sie eine ganze Zahl ein.");
                buchstabenSalat = true;
            }
        }while (buchstabenSalat != false);
        return pimmel;
        }



    public static void main(String[] args) {
        int zahl = eingabeZahl();

        System.out.println("Du hast gerade " +zahl+ " eingegeben!");

    }
}



