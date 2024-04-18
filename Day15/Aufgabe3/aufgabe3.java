/*
 *  TODO-ERLEDIGT 1 Erstellen Sie eine Klasse "Adresse" mit Straße, Hausnummer, PLZ und Ort
 *
 *  TODO-ERLEDIGT 2 Erstellen Sie ein Interface "IAdresse" mit den Getter-
 *   und Setter-Methoden für Name und Anschrift (Anschrift ist vom Typ Adresse)
 *      und der Methode "printEtikett()"
 *
 *  TODO-ERLEDIGT 3 Erstellen Sie die Klasse "Adressverwaltung" mit den Static Methoden "printEtikett(IAdresse obj)""
 *      und "erfasse(IAdresse obj, String name, String straße, int hausnr, String plz, String ort)""
 *      (Die Klasse Adressverwaltung wird das Interface nicht implementieren, aber wir werden die Klasse verwenden,
 *      um Adressen auszugeben und zu erfassen)
 *
 *  TODO-ERLEDIGT 4 Die Methode "printEtikett" soll alle
 *   Informationen von IAdresse ausgeben (also Name und die Werte in Anschrift)
 *
 *  TODO-ERLEDIGT 5 Die Methode "erfasse" soll dem
 *   übergebenen IAdresse-Objekt die neuen Werte zuweisen
 *
 *  TODO-ERLEDIGT 6 Erstellen Sie eine Klasse "Person",
 *   die nun das Interface IAdresse implementiert und über den Konstruktor
 *      public Person(String name, String straße, int hausnr, String plz, String ort) verfügt
 *      Im Konstruktor sollen die Adress-Werte über die Adressverwaltung erfasst werden
 *
 *  TODO-ERLEDIGT 7 In der Implementierung der printEtikett-Methode des Interfaces
 *   soll die printEtikett-Methode der Adressverwaltung
 *      aufgerufen werden *
 *
 *  TODO-ERLEDIGT 8 Testen Sie die Funktionalitäten in der Main-Methode,
 *   indem Sie dort eine Liste oder ein Array mit mehreren Personen anlegen und für jede
 *      Person die Etikett-Methode aufrufen.
 *
 *  TODO-ERLEDIGT 9 Erweitern Sie das Programm durch Erstellen einer Klasse Firma,
 *   die ebenfalls IAdresse implementiert.
 *
 *  TODO-ERLEDIGT 10 Fügen Sie zu Ihrer Liste im Main nun zusätzlich Objekte der Klasse Firma hinzu.
 *   Bewerkstelligen Sie dies ohne
 *      Generalisierung der Klassen.
 */


package Day15.Aufgabe3;

import java.util.ArrayList;
import java.util.List;

public class aufgabe3 {
    public static void main(String[] args) {
        //Liste  für Personen
        List<IAdresse> adressen = new ArrayList<>();

        //Hinzufügen der Personen
        adressen.add(new Person("Max Mustermann", "Musterstraße", "12b", 12345, "Musterstadt"));
        adressen.add(new Person("Stefanie Müller", "Haupstraße", "42", 44125, "Musterdorf"));

        //Hinzufügen der Firmen
        adressen.add(new Firma("DollyBuster","Hintere Gasse", "69", 42069,"Anusthausen"));
        adressen.add(new Firma("Muster Firma GbmH & Co.Kg", "Hauptstraße", "1a",12345,"Musterdorf"));

        // Ausgabe der Etiketten für alle
        for(IAdresse adresse : adressen){
            adresse.printEtikett();
            System.out.println("----------------------------------");
            try {
                Thread.sleep(250);
            }catch (InterruptedException e){
            }
        }

    }
}
