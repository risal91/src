package Day10.Aufgabe3;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class FlugSuche {

    /**
     *
     * @param datum hier wird Das Gewünsche Abreise Datum übergeben
     * @param freiePlaetze hier die benötigten freien Plätze Übergeben
     * @return wir erhalten eine Sortiertes Array mit verfügbaren Flügen zurück
     */
    public static Flug[] findeFluege(LocalDateTime datum, int freiePlaetze){

        /**
         * Wir erstellen eine neue ArrayListe um die Flüge nach dem Datum zu Filtern
         */
        ArrayList<Flug> gefilterteFluege = new ArrayList<>();
        for (Flug flug : Flug.flüge){
            if(flug.getAbflugZeit().toLocalDate().equals(datum.toLocalDate())){
                gefilterteFluege.add(flug);
            }
        }
        /**
         * hier werden alle Gefunden flüge nach preise sortiert
         */
        gefilterteFluege.sort((flug1, flug2) -> Integer.compare(flug1.getPreis(), flug2.getPreis()));
        /**
         * hier werden in ein neues Array verfügbareFlüge eingetragen
         * die auch die benötigte Sitzplatz anzahl haben
         * Es wird im anschluss keine Neue Sortierung benötigt
         */
        ArrayList<Flug> verfuegbareFluege = new ArrayList<>();
        for (Flug flug : gefilterteFluege){
            if (flug.getFreiPlaetze() >= freiePlaetze){
                verfuegbareFluege.add(flug);
            }
        }
        /**
         * Unser ergebniss wird hier zurück gegeben
         */
        Flug[] ergebnis = new Flug[verfuegbareFluege.size()];
        verfuegbareFluege.toArray(ergebnis);
        return ergebnis;
    }


    public static void main(String[] args) {
        /**
         * Array mit allen verfügbaren Flügen.
         */

        Scanner sc = new Scanner(System.in);

        Flug.flüge = new Flug[] {
               new Flug("101", LocalDateTime.of(2019, 6, 12, 12, 0, 0), LocalDateTime.of(2019, 6, 12, 18, 20, 0), 1500, 12),
               new Flug("102", LocalDateTime.of(2019, 6, 12, 18, 0, 0), LocalDateTime.of(2019, 6, 13, 0, 0, 0), 1450, 14),
               new Flug("111", LocalDateTime.of(2019, 6, 12, 22, 0, 0), LocalDateTime.of(2019, 6, 13, 4, 0, 0), 1600, 18),
               new Flug("141", LocalDateTime.of(2019, 6, 13, 8, 0, 0), LocalDateTime.of(2019, 6, 13, 14, 0, 0), 1700, 5),
               new Flug("251", LocalDateTime.of(2019, 6, 13, 12, 0, 0), LocalDateTime.of(2019, 6, 13, 18, 0, 0), 1000, 34),
               new Flug("607", LocalDateTime.of(2019, 6, 13, 18, 0, 0), LocalDateTime.of(2019, 6, 14, 0, 0, 0), 1100, 15),
               new Flug("638", LocalDateTime.of(2019, 6, 14, 8, 0, 0), LocalDateTime.of(2019, 6, 14, 14, 0, 0), 1650, 7),
               new Flug("703", LocalDateTime.of(2019, 6, 14, 12, 0, 0), LocalDateTime.of(2019, 6, 14, 18, 0, 0), 1450, 10),
               new Flug("784", LocalDateTime.of(2019, 6, 14, 18, 0, 0), LocalDateTime.of(2019, 6, 15, 0, 0, 0), 1800, 2),
               new Flug("788", LocalDateTime.of(2019, 6, 14, 22, 0, 0), LocalDateTime.of(2019, 6, 15, 4, 0, 0), 1200, 38)
           };


        /**
         * Div User Abfragen die benötigt werden zum Filtern des Fluges
         */
        System.out.println("\nBitte gib das jahr ein:");
        int jahr = sc.nextInt();

        System.out.println("\nBitte gib den Monat ein als Zahl:");
        int monat = sc.nextInt();

        System.out.println("\nBitte gib das Tag ein als Zahl:");
        int tag = sc.nextInt();

        System.out.println("\nWie viele Plätze benötigst du:");
        int platz = sc.nextInt();

        /**
         * Funktions aufruf mit Übergabe werden um den Flug zu finden
         */
        Flug[] gefundeneFluege = FlugSuche.findeFluege(LocalDateTime.of(jahr, monat, tag, 0,0 ,0), platz);

        /**
         * ausgabe der Gefunden Flüge
         */
        for (Flug flug : gefundeneFluege) {
            System.out.println(flug);
        }


    }
}
