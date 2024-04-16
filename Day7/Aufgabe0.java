package Day7;

/* Aufgabe 0
 * Sie möchten Ihre Musiksammlung verwalten.
 * Erstellen Sie ein 2-Dimensionales Array "Album" vom Typ String mit der Größe 5 und 2 (Es ist ein kleines Album).
 * Fügen Sie dem Album nun 5 Songs hinzu. In der ersten Dimension stehen die Interpreten oder die Komponisten, in der zweiten die Songs. Zum Beispiel:
	Album[0][0] = "Cello Suite No. 1 in G Major"; Album[0][1] = "Johann Sebastian Bach"; (oder "Yo-Yo Ma" als Interpret)
 * In einer For-Schleife sollen dann alle Songs des Albums ausgegeben werden. Verwenden Sie length für die Schleifenbedingung.
 */

public class Aufgabe0 {
    public static void main(String[] args) {
        // 2-dimensionales Array erstellen
        String[][] album = new String[5][2];

        // Songs hinzufügen
        album[0][0] = "Song 1 ";
        album[0][1] = "Interpret 1";
        album[1][0] = "Song 2";
        album[1][1] = "Interpret 2";
        album[2][0] = "Song 3";
        album[2][1] = "Interpret 3";
        album[3][0] = "Song 4";
        album[3][1] = "Intepret 4";
        album[4][0] = "Song 5";
        album[4][1] = "Ob du behindert bist hab ich das so oft gemacht";


        // eine Schleife zur ausgabe des Arrays
        for (int i = 0; i < album.length; i++) {
            System.out.println("Interpret: " + album[i][1]);
            System.out.println("Song: " + album[i][0]);
            System.out.println("____________________________");

        }


    }
}
