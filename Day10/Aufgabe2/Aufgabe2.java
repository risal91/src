package Day10.Aufgabe2;

/*
Schreiben Sie bitte ein Java-Programm, in dem ...
- eine Klasse 'Kurs' definiert wird.
  + folgende Member besitzt diese Klasse:
    - privater Integer "kursnummer"
    - privater statischer Instanzen-Zähler "zähler"
    - private statische Variable maxWert (maximale Anzahl der zulässigen Instanzen vom Typ Kurs)
        + im Setter darf maxWert nur gesetzt werden, wenn der Wert vorher noch nicht gesetzt ist.
    - privates statischen Array vom Typ Kurs.
    - öffentlicher Konstruktor 'Kurs(x)'
      Übergabewert: eine Kursnummer x
        Funktion: speichert x in kursnummer ab ...
                    FALLS diese Kursnummer nicht bereits bei zuvor instanziierten Objekten vergeben wurde.
                    SONST wird kursnummer=-1 gesetzt und es erscheint ein Warnhinweis.
                    Der Kurs wird im Array abgelegt
        Rückgabewert: Keiner.
    - öffentliche statische Methode 'ausgabe()'
        Übergabewerte: Keine
        Funktion: Gibt alle Kursnummern der instanziierten Objekte vom Typ Kurs auf der Konsole aus
                  (Falls Kursnummer==-1 erscheint eine Fehlermeldung)
        Rückgabewert: Keiner
- im Main eine for-Schleife gestartet wird (Anzahl der Durchläufe: maxWert)
  + pro Durchlauf wird ein neues Objekt vom Typ Kurs instanziiert (Übergabewert ist eine Zufallszahl zwischen 1 und maxWert)
- im Main abschließend zur Kontrolle die Funktion zeigeAlle() aufgerufen wird
*/

public class Aufgabe2 {

}
