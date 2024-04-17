/* Erstellen Sie folgende Interfaces:
 * "IFlugfähig" mit einer void Methode "fliegen()".
 * "IFahrbar" mit einer void Methode "fahren()".
 * "ISchwimmfähig" mit einer void Methode "schwimmen()".
 *
 * Erstellen Sie weiterhin fünf Klassen:
 * - abstrakte Klasse "Fahrzeug" mit einer statischen Liste vom Typ "Fahrzeug"
 *  und einem parameterlosen Konstruktor, der das aktuelle Objekt der Liste hinzufügt.
 * - "Flugzeug", welche von "Fahrzeug" erbt und die Interfaces
 * "IFlugfähig" und "IFahrbar" implementiert.
 * - "Auto", erbt von "Fahrzeug" und implementiert das Interface "IFahrbar".
 * - "Bagger", erbt von "Fahrzeug" und implementiert "IFahrbar" und "ISchwimmfähig".
 * - "Boot", erbt von "Fahrzeug" und implementiert "ISchwimmfähig".
 * Die implementierten Methoden sollen einen passenden Text auf der Konsole ausgeben.
 *
 * Erstellen Sie in der Main je ein Objekt der nicht-abstrakten Klassen.
 * Über eine Schleife iterieren Sie durch die statische Liste in Fahrzeug,
 * ermitteln, welches Interface die Objekte implementieren und
 * rufen dann für jedes Objekt die verfügbaren Methoden auf.
 * Erstellen Sie ein UML Klassendiagramm.
 */


package Day15.Aufgabe1;

import static Day15.Aufgabe1.Fahrzeug.fahrzeugList;

public class aufgabe1 {
    public static void main(String[] args) {
        Fahrzeug flugzeug1 = new Flugzeug();
        Fahrzeug auto1 = new Auto();
        Fahrzeug bagger1 = new Bagger();
        Fahrzeug boot1 = new Boot();

        for (Fahrzeug fahrzeug : fahrzeugList){
            fahrzeug.zeigeDetails();
            if (fahrzeug instanceof IFlugfähig){
                ((IFlugfähig) fahrzeug).fliegen();
            }
            if (fahrzeug instanceof IFahrbar){
                ((IFahrbar) fahrzeug).fahren();
            }
            if (fahrzeug instanceof ISchwimmfähig){
                ((ISchwimmfähig) fahrzeug).schwimmen();
            }
        }

    }
}
