package Day6;

/* Aufgabe 0
 * Sie möchten Ihre Musiksammlung verwalten.
 * Erstellen Sie ein Array "Album" vom Typ String mit der Größe 5 (Es ist ein kleines Album).
 * Fügen Sie dem Album nun 5 Songs hinzu. Dabei ist jedes Element im Array ein Song-Titel.
 * In einer For-Schleife sollen dann alle Songs des Albums ausgegeben werden. Verwenden Sie Length-Eigenschaft des Arrays für die Schleifenbedingung.
 */






public class Aufgabe0 {
    public static void main(String[] args) {
        // Ein Arry "Album" vom Typ Sting mit der Gr 5 erstellen
        String[] album = new String[5];

        //5 Songs dem Album Hinzufügen
        album[0] = "Song 1";
        album[1] = "Song 2";
        album[2] = "Song 3";
        album[3] = "Song 4";
        album[4] = "Song 5";

        //Alle Song Printen in For
        for (int i = 0; i < album.length; i++){
            System.out.println("Sie hören jetzt: " + album[i]);
        }




    }
}
