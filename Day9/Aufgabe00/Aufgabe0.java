package Day9.Aufgabe00;

/* Aufgabe 0 (Basics)
 * Erstellen Sie die Klasse "Song" mit den Attributen
 * string "titel", int "dauerSekunden", string "interpret"
 * passenden Getter und Setter für die Attribute
 * und der Methode "spielen",
 * die auf der Konsole alle Informationen
 * über den Song ausgibt (die Dauer dabei in Minuten und Sekunden, z.B. 03:35).
 *
 * Erstellen Sie in der Main einen Song und rufen Sie die Methode auf.
 */


public class Aufgabe0 {

    public static void main(String[] args) {

        Song meinSong1 = new Song("Highway to hell", 330, "AC/DC");
        Song meinSong2 = new Song("TnT", 280, "AC/DC");
        Song meinSong3 = new Song("Feuersänger", 678, "Sören Vogelsang");


        meinSong1.spielen();
        meinSong2.spielen();
        meinSong3.spielen();

    }
}
