import java.util.*;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static List<Klausur> alleKlausuren = new ArrayList<>();
    public static List<Fach> alleFaecher = new ArrayList<>();



    public static void main(String[] args) {
        // Erzeugen von Beispiel-Fächern und -Klausuren
        Fach javaGrundlagen = new Fach(1, "Java-Grundlagen");
        Fach dbmSql = new Fach(2, "Datenbankmodellierung und SQL");

        Klausur klausurJava1 = new Klausur(1, 1);
        Klausur klausurJava2 = new Klausur(2, 2);
        Klausur klausurDbmSql = new Klausur(3, 3);

        // Hinzufügen der Fächer zur Liste
        alleFaecher.add(javaGrundlagen);
        alleFaecher.add(dbmSql);

        // Hinzufügen der Klausuren zur Liste
        alleKlausuren.add(klausurJava1);
        alleKlausuren.add(klausurJava2);
        alleKlausuren.add(klausurDbmSql);

        javaGrundlagen.addKlausur(klausurJava1);
        javaGrundlagen.addKlausur(klausurJava2);
        dbmSql.addKlausur(klausurDbmSql);


        while (true) {
            // Auswahl der Navigationsrichtung
            int auswahl = 0;
            while (auswahl != 1 && auswahl != 2) {
                System.out.println("Wählen Sie die Navigationsrichtung:");
                System.out.println("1: Von Klausur zu Fach");
                System.out.println("2: Von Fach zu Klausur");
                try {
                    Scanner scanner = new Scanner(System.in);
                    auswahl = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Du hast nichtmal eine Zahl eingegeben");
                    System.out.println("Ungültige Eingabe. Bitte wählen Sie 1 oder 2.");
                }
            }

            // Navigation von Klausur zu Fach
            if (auswahl == 1) {
                int klausurId = 0;
                while (klausurId <= 0) {
                    System.out.println("Geben Sie die ID der Klausur ein:");
                    try {
                        Scanner scanner = new Scanner(System.in);
                        klausurId = Integer.parseInt(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Ungültige Klausur-ID. Bitte geben Sie eine positive Zahl ein.");
                    }
                }
                Klausur klausur = findKlausurById(klausurId);
                if (klausur == null) {
                    System.out.println("Es gibt keine Klausur mit der ID " + klausurId);
                } else {
                    System.out.println("Die Klausur gehört zum Fach " + klausur.getFach().getBezeichnung());
                }

            }

            // Navigation von Fach zu Klausur
            if (auswahl == 2) {
                int fachId = 0;
                while (fachId <= 0) {
                    System.out.println("Geben Sie die ID des Fachs ein:");
                    try {
                        Scanner scanner = new Scanner(System.in);
                        fachId = Integer.parseInt(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Ungültige Fach-ID. Bitte geben Sie eine positive Zahl ein.");
                    }
                }
                Fach fach = findFachById(fachId);
                if (fach == null) {
                    System.out.println("Es gibt kein Fach mit der ID " + fachId);
                } else {
                    for (Klausur klausur : fach.getKlausuren()) {
                        System.out.println("Klausur-ID: " + klausur.getId() + ", Note: " + klausur.getNote());
                    }
                }
            }
        }
    }

    private static Fach findFachById(int id) {
        for (Fach fach : alleFaecher) {
            if (fach.getId() == id) {
                return fach;
            }
        }
        return null;
    }

    private static Klausur findKlausurById(int id) {
        for (Klausur klausur : alleKlausuren) {
            if (klausur.getId() == id) {
                return klausur;
            }
        }
        return null;
    }

}
