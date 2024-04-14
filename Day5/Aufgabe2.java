package Day5;

/*
    Schreiben Sie bitte ein Programm, in dem  ...
    - in einer Schleife pro Durchlauf so lange 2 Double-Zahlen vom User abgefragt werden, bis deren Differenz (auf 2 Nachkommastellen gerundet) 0 beträgt
    - pro Durchlauf wird jeweils die aktuelle Differenz ausgegeben

    HINWEIS:
    Je nach Reihenfolge der Differenzbildung (bzw. Eingabe der Zahlen) kann die Differenz positiv, oder negativ sein ...
    ... sorgen Sie bitte bei der Ausgabe dafür, dass die Differenz stets als ein Wert größer gleich 0 ausgegeben wird.
    Zum Runden oder zum Bilden des positiven Betrags eines Wertes gibt es passende Methoden in der Math-Klasse
*/


import java.util.Scanner;
import java.math.*;

public class Aufgabe2 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        double zahl1 = 0;
        double zahl2 = 0;
        double differenz = 0;

        do {
            System.out.println("Geben sie eine erste Zahl ein: ");
            zahl1 = sc.nextDouble();
            System.out.println();
            System.out.println("Geben sie eine zweite Zahl ein: ");
            zahl2 = sc.nextDouble();
            System.out.println();

            differenz = zahl1 - zahl2;
            differenz= Math.abs(differenz);
            if (differenz != 0){
                System.out.printf("Die Differenz beträgt %.2f ", differenz);
            }

        }while (differenz != 0);
    }
}
