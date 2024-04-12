package Day4;

/*
    Aufgabe_2
    Schreiben Sie ein Programm, bei dem ein Array mittels Schleife befüllt wird und zu viele Elemente hinzugefügt werden.
    Fangen Sie den dabei auftretenden Fehler ab.
 */

public class Aufgabe2 {
    public static void main(String[] args) {
    int[] zahlen = new int[10]; //Array mit 10 Elementen
        int i = 0;
        try {
            for (i = 0; i < 15; i++) {
                zahlen[i] = i++;
            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.err.println("Fehler: Das Array kann nicht mehr Elemente aufnehmen!");
            System.err.println("Maximale Anzahl: " +zahlen.length);
            System.err.println("Du hast versucht das " + i + "te Element hinzuzufügen." );
        }
        System.out.println("Das Programm lief bis hier hin weiter");
    }
}
