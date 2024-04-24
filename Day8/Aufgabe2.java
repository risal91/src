package Day8;

/*
    Schreiben Sie bitte zunächst die 3 folgenden Methoden:
    a) Funktionsname: schreibeListe
       Übergabewert:  1 String-Liste 'l'
       Funktion:      l wird sortiert, anschließend werden alle Strings in l auf der Konsole ausgegeben
       Rückgabewert:  Keiner

    b) Funktionsname: hatLeerzeichen
       Übergabewert:  1 String 's'
       Funktion:      Füllt die boolesche Variable 'b' mit 'true', FALLS s (mindestens) ein Leerzeichen besitzt, SONST 'false'
       Rückgabewert:  b

    c) Funktionsname: schonVorhanden
       Übergabewert:  1 String-Liste 'l' und ein String 's'
       Funktion:      Füllt die boolesche Variable 'b' mit 'true', FALLS s in l vorkommt, SONST 'false'
       Rückgabewert:  b

    Testen Sie die obigen Methoden bitte mithilfe des folgenden Programms:
    - Zunächst wird eine Liste vom Typ String eingeführt

    - Das Programm startet eine Endlos-Schleife, in der pro Durchlauf ...

      + vom User ein Wort abgefragt wird
        - falls in der Eingabe ein Leerzeichen vorkommt: entsprechende Fehlermeldung:
        - falls in der Eingabe KEIN Leerzeichen vorkommt, ABER die Eingabe bereits in der Liste vorkommt: entsprechende Fehlermeldung
        - falls WEDER ein Leerzeichen vorkommt, NOCH die Eingabe bereits vorkommt, so wird die Eingabe in die Liste mit aufgenommen

      + alle Elemente der Liste werden auf der Konsole ausgegeben
*/


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Aufgabe2 {
    public static Scanner sc = new Scanner(System.in);

    //Die methode Sortiert das Ankommende StringArray Alphabetisch und Zeigt es auf der Konsole
    public static void schreibeListe(ArrayList<String> l){
        Collections.sort(l);
            System.out.println(l);

    }

    // hier prüfen wir ob ein String ein leerzeichen entählt ist dies der Fall wird b als True returnt
    public static boolean hatLeerzeichen(String s){
        boolean b = false;
        if (s.contains(" ")){
            b = true;
        }
     return b;
    }
    // hier prüfen wir ob ein String ein schon einmal entahlten ist dies der Fall wird b als True returnt
    public static boolean schonVorhanden(ArrayList<String> l, String s){
        boolean b =  false;
        if (l.containsAll(Collections.singleton(s))){
            b = true;
        }return b;
    }


    public static void main(String[] args) {
        ArrayList<String> liste = new ArrayList<>();
        //eine endloss schleife
        while (true){
            System.out.println("Geben Sie ein Wort ein: ");
            String wort = sc.nextLine();

            //wenn der user ein wort eingegben hat wird die ensprechende methode getriggert
            if (hatLeerzeichen(wort)){
                System.out.println("\033[31m Fehler: Das Wort darf keine Leerzeichen enthalten\033[0m");
            } else if (schonVorhanden(liste, wort)) {
                System.out.println("\033[31m Fehler: Das Wort darf ist bereits enthalten\033[0m");
            } else {
                liste.add(wort);
                schreibeListe(liste);
            }
        }

    }
}
