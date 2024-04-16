package Day7;

/*
Aufgabe 1
Schreiben Sie bitte ein Java-Programm, in dem
a) ein 2-dimensionales Array (Dimensionen 2,3) namens "lexikon" eingeführt wird
b) in [0][x] (für alle x=0;1 oder 2) ein Begriff initialisiert wird
c) in [1][x] jeweils die Erläuterung des Begriffes abgespeichert wird
d) in einer Endlosschleife vom User pro Durchlauf ein Begriff abgefragt wird
e) die passende Erläuterung ausgegeben wird, oder eine Fehlermeldung, falls der Begriff nicht vorhanden

Beispiel:
lexikon[0][0]="Auto" / lexikon[1][0]="Motorisiertes Straßen-Fahrzeug mit 4 Rädern"
lexikon[0][1]="OOP" / lexikon[1][1]="Abkürzung für 'Objektorientierte Programmierung'"
lexikon[0][2]="Süßstoff" / lexikon[1][2]="Kalorienarmer Zuckerersatz"

Hinweis:
- die erste Dimension (3) zählt die Anzahl der abgespeicherten Begriffs-Erläuterung-Paare
- die zweite Dimension (2) zählt also die "Textarten" (Begriff oder Erläuterung)
(oder umgekehrt, je nachdem welche Zählrichtung der Dimensionen man betrachtet)
*/


import java.util.Scanner;

public class Aufgabe1 {

    public static void main(String[] args) {
        // Einführung Scanner
        Scanner sc = new Scanner(System.in);

        //2-dimensionales Array erstellen
        String[][] lexikon = new String[2][3];

        // Array Initialisieren
        lexikon[0][0]="Auto";
        lexikon[1][0]="Motorisiertes Straßen-Fahrzeug mit 4 Rädern";
        lexikon[0][1]="OOP" ;
        lexikon[1][1]="Abkürzung für 'Objektorientierte Programmierung'";
        lexikon[0][2]="Süßstoff";
        lexikon[1][2]="Kalorienarmer Zuckerersatz";


        // letsgo in die Endloss schleife
        while (true){
            boolean gefunden = false;


            //Abfrage nach einem begriff
            System.out.println();
            System.out.println("Bitte geben Sie einen Begriff ein: ");
            String begriff = sc.nextLine();

            //prüfe ob der Begriff im Lexikon ist
            for (int i = 0; i < lexikon[0].length; i++) {
                if (begriff.equals((lexikon[0][i]))){
                    System.out.println("Erklärung: " + lexikon[1][i]);
                    gefunden = true;
                    break;
                }
            }
            // Fehlermeldung, wenn begriff nicht vorhanden
            if(!gefunden){
                System.out.println(" ");
                System.err.println("Deinen Begriff gibt es nicht in Meinem Lexikon!");
                System.out.println(" ");
            }

        }


    }
}
