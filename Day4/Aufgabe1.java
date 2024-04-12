package Day4;

/* Aufgabe_1

    Schreiben Sie eine statische Funktion, die die Quersumme einer Zahl berechnet.
    Übergabewert (Parameter): int zahl
    Rückgabewert: die berechnete Quersumme.
    Ist die übergebene Zahl negativ, soll eine IllegalArgumentException ausgelöst werden.
    Im Main rufen Sie die Methode innerhalb einer passenden Try-Catch-Anweisung auf.
    Der Catch-Teil soll dabei eine passende Fehlermeldung ausgeben.
    Hinweis: Zur Berechnung bietet sich der Modulo-Operator % an.

 */

public class Aufgabe1 {

    static public int QuersummenBerrechnung(int zahl){
    int quersumme = 0;

    if(zahl < 0){
        throw new IllegalArgumentException("Eingabe darf nicht negativ sein!");
    }

    while ( zahl > 0){
        quersumme += zahl % 10;
        zahl /= 10;
    }
        return quersumme;
    }


    public static void main(String[] args) {

        int zahl = -50;

        try {
            int quersumme = QuersummenBerrechnung(-50);
            System.out.println("Die Quersumme von " + zahl + " ist: " +quersumme);
        } catch (IllegalArgumentException e){
            System.err.println("Fehler: "+ e.getMessage());
        }



    }
}
