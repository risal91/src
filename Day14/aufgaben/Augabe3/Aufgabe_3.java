package Day14.aufgaben.Augabe3;

/* Sie betreiben einen Imbiss und möchten eine Verwaltungssoftware für die verkauften Waren erstellen.
 * Die Verkaufsware unterteilt sich in Speisen und Getränke.
 * Alle Waren werden in der Basisklasse, von der kein Objekt erstellt werden darf,
 * in einer Liste gespeichert.
 * Für alle Waren erfassen Sie die Bezeichnung und den Preis.
 * Speisen bestehen zudem aus einer Auflistung der Zutaten,
 * zu Getränken speichern Sie die Füllmenge in Milliliter.
 * Alle benötigten Daten werden über Konstruktoren erfasst.
 * Um alle Waren bequem ausgeben zu können, überschreiben Sie die toString-Methode der Klassen.
 * Dabei vermeiden Sie doppelten Code und beachten die Abkapselung und T
 * rennung von Darstellung und Programmlogik.
 * Zum Testen erstellen Sie ein Getränk, eine Speise und geben alle Informationen auf
 * dem Bildschirm aus.
 *
 * Erstellen Sie dazu ein UML Klassendiagramm.
 */


import java.util.Arrays;
import java.util.List;

import static Day14.aufgaben.Augabe3.Ware.warenListe;

public class Aufgabe_3 {
    public static void main(String[] args) {
    Speise Burger = new Speise("Burger",3.50, Arrays.asList("Brötchen", "Frikadelle", "Gurke", "Sauce", "Käse"));
    Speise Schnitzel = new Speise("Schnitzel Wiener Art",11.95, Arrays.asList("Paniertes Schweine Schnitzel", "Petersilien Kartoffeln", "Spargel", "Sauce Hollandaise"));
    Getränk Cola = new Getränk("Cola", 3.50,250);
    Getränk Saft = new Getränk("Saft", 2.50,250);
    Getränk Wasser = new Getränk("Wasser", 2.00,250);

        System.out.println("\nUnsere Speise Karte: ");
        for (Ware ware : warenListe) {
            System.out.println(ware);
        }
    }
}
