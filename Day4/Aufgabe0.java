package Day4;

/*
    Aufgabe_0

    Schreiben Sie ein Programm, bei dem eine Methode eine Division ausführt.
    Erzwingen Sie bei Aufruf dieser eine 0 Division und fangen Sie den dazugehörigen Fehler ab.
 */

public class Aufgabe0 {
    public static int division(int zahl1){
        int zahl2 = 5;
        try {
            int ergebniss = 5 / 0;
            return ergebniss;
        } catch (ArithmeticException e){
            System.out.println("");
            System.err.println("Fehler: Division durch 0 ist nicht möglich DEPP!");
            return 0;
        }
    }

    public static void main(String[] args) {

        int exception = division(0);

    }
}
