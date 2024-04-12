package Day4;
/*
    Schauen Sie sich, um diese Aufgabe zu lösen, das Thema DatumsFormat aus den Codebeispielen an.

    Führen Sie bitte zunächst die folgende Methode ein:
    Methodenname: tryStringZuDatum
    Übergabewerte: String s
    Funktion: - Versucht s in LocalDate zu konvertieren
              - Fängt bei DateTimeParseException die Fehlermeldung ab

    Rückgabewert: das LocalDate Objekt, FALLS Konvertierung klappte, sonst null

    Testen Sie diese Funktion.
*/

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

public class Aufgabe3 {

    public static LocalDate tryStringZuDatum(String s){
        try {
            return LocalDate.parse(s);
        } catch (DateTimeParseException e){
            System.err.println("Fehler beim Parsen von String zu Datum " + e.getMessage());
            return null;
        }


    }

    public static void main(String[] args) {
        String datumString = "2024.04.12";

        LocalDate datum = tryStringZuDatum(datumString);

        if (datum != null){
            System.out.println("Datum: " + datum);
        } else {
            System.err.println("Konvertierung fehlgeschlagen!");
        }

    }
}
