package Day2;

/*
Aufgabe 4
Erstellen Sie ein Programm, welches zählt, wie viele Großbuchstaben in einer Zeichenkette vorkommen.
For-Schleifen und If-Else funktionieren hier exakt wie Sie auch schon aus C bekannt sind.
Die Länge einer Zeichenkette können Sie mit length() geprüft werden.
Ob ein Zeichen ein Großbuchstabe ist, erfahren Sie über Character.isUpperCase().
 */

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Aufgabe4 {

    public static void main(String[] args) {
        String kette = "HiPpOpotoMonstrosesqAippEdAliopFobIE";
        int laenge = kette.length();
        int UpperCase = 0;

        for (int i = 0; i < laenge; i++){
            if (Character.isUpperCase(kette.charAt(i))){
                System.out.println("Der Buchstabe an der Stelle " + i +" ist ein Großbuchstabe. Der Buchstabe Lautet: " + kette.charAt(i));
                UpperCase++;
            }
        }
        System.out.println("Es sind " + UpperCase + " Großbuchstaben ");
    }
}
