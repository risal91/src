package Day5;

/*
Aufgabe 0
Schreiben Sie bitte ein Java-Programm, das
a) einen Integer-Wert so lange abfragt, bis er mindestens die Größe 10 hat
b) bei jeder zu kleinen Eingabe eine Fehlermeldung ausgibt
c) bei einer Eingabe von mindestens 10 mit einer Erfolgsmeldung das Programm beendet


Bemerkungen:
1) Auch while und do-while Schleifen unterscheiden sich in Java nicht von denen in ANSI C
2) Fehleingaben im Sinne von Buchstaben, Zeichen, oder Kommazahlen werden vom Programm NICHT abgefangen
*/


import java.util.Scanner;

public class Aufgabe0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int zahl = 0;

        while( zahl < 10 ){
            System.out.println("Bitte geben Sie eine Zahl (mindestens 10) ein: ");
            zahl = sc.nextInt();

            if (zahl < 10){
                System.err.println("Die Eingabe ist zu klein! Bitte geben Sie eine größere Zahl ein.");
            }
        }
        System.out.println("Klasse! Sie haben alles richtig gemacht. Toll!!!");
    }
}
