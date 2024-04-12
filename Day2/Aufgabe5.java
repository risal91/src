package Day2;

/*
    Erstellen Sie eine Funktion, die die Fakultät einer übergebenen Zahl berechnet und das Ergebnis zurückgibt.

    Fakultät = mathematische Funktion, die eine natürliche Zahl n auf n! = 1 * 2 * … * n abbildet
    https://de.wikipedia.org/wiki/Fakult%C3%A4t_(Mathematik)

    Beispiel: 5! = 1 * 2 * 3 * 4 * 5 = 120
*/


public class Aufgabe5 {

    public static long berechneFakultat(int n){
        long ergebnis = 1;
        for (int i = 1; i <= n; i++){
            ergebnis = ergebnis*i;
        }

        return ergebnis;
    }


    public static void main(String[] args) {

        int n = 13;
        long fakulat = berechneFakultat(n);

        System.out.println("Die Fakultät von "+ n +" = " + fakulat);

    }
}
