package Day3;

/*
 * Aufgabe 2
 * Schreiben Sie ein Programm, das Ihnen ausgibt, ob das über die Integer-Variable "jahr" eingeführte Jahr ein Schaltjahr ist.
 * Durch 4 ohne Rest teilbare Jahre sind normalerweise Schaltjahre.
 * Durch 100 ohne Rest teilbare Jahre sind keine Schaltjahre.
 * Durch 400 ohne Rest teilbare Jahre sind jedoch Schaltjahre.
 * Nutzen Sie zu Umsetzung die Boolesche Variable schaltjahr und lassen Sie sich das Jahr, sowie ob es ein Schaltjahr ist oder nicht, auf der Konsole ausgeben.
 */


import java.util.Scanner;

public class Aufgabe2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Geben Sie ein Jahr ein :");
        System.out.println("");
        int jahr = sc.nextInt();
        System.out.println("");

        if (jahr % 400 == 0){
            System.out.println("Das jahr " + jahr + " ist ein Schaltjahr und hat 366 Tage Yeah mehr Arbeiten ");
        } else if (jahr % 100 == 0) {
            System.out.println("Das jahr " + jahr + " ist leider kein Schaltjahr wenn du am 29.02 Geburtstag hast wirst du nicht Älter");
        } else if (jahr % 4 == 0){
            System.out.println("Das jahr " + jahr + " ist ein Schaltjahr und hat 366 Tage Yeah mehr Arbeiten ");
        } else {
            System.out.println("Das jahr " + jahr + " ist leider kein Schaltjahr wenn du am 29.02 Geburtstag hast wirst du nicht Älter");
        }

    }
}
