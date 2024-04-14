package Day5;
/*
    AUFGABE 3A
    Schreiben Sie bitte die folgende Funktion (und testen Sie diese im Main)
    Name: inputINT
    Übergabewert: 1 String als User-Information-Text (z.B."Geben Sie bitte eine ganze Zahl ein: ")
    Funktion: Fragt vom User eine ganze Zahl ab (OHNE Überprüfung der Korrektheit der User-Eingabe)
    Rückgabewert: User-Eingabe

    AUFGABE 3B
    Schreiben Sie bitte ein Java-Programm, in dem (unter Verwendung der Funktion aus Teilaufgabe A) ...
    - eine Schleife solange durchlaufen wird, bis der User die Eingabe 42 tätigt
    - bei jeder falschen Eingabe eine Fehlermeldung auf der Konsole erscheint
    - bei der ersten korrekten Eingabe die Schleife beendet und eine Erfolgsmeldung ausgegeben wird

*/

import java.util.Scanner;

public class Aufgabe3 {

    static Scanner sc = new Scanner(System.in);


    public static String inputINT (String text){
        String wert;
        do {
            System.out.println(text);

            wert = sc.nextLine();
            if (wert.equals("42") == false){
                System.err.println("Das war Falsch du Honk probier es nochmal!");
                System.out.println();
            }
        }while (wert.equals("42") == false);
     return wert;
    }



    public static void main(String[] args) {

        String uebergabeWert = "Geben Sie bitte eine ganze Zahl ein: ";
        String rueckgabewert = inputINT(uebergabeWert);

        System.out.println("das hast du eingegeben: " + rueckgabewert);

    }
}
