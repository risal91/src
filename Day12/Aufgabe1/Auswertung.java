package Day12.Aufgabe1;

import Day9.AufgabeZusatz1.Farbcode;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Auswertung {

    private static Klausur findKlausurenID(int id, List<Klausur> klausuren1, List<Klausur> klausuren2){
        for(Klausur klausur : klausuren1){
            if(klausur.getId() == id){
                return klausur;
            }
        }
        for (Klausur klausur : klausuren2){
            if(klausur.getId() == id){
                return klausur;
            }
        }
        return null;
    }

    private static Fach findFachnachBezeichnung(String bezeichnung, Fach java, Fach dbmsql){
        if(java.getBezeichnung().equalsIgnoreCase(bezeichnung)){
            return java;
        } else if (dbmsql.getBezeichnung().equalsIgnoreCase(bezeichnung)) {
            return dbmsql;
        } else return null;
    }

    public static void navigationKlausurzuFach(Scanner sc, Fach java, Fach dbmsql){
        System.out.println("\nGibt bitte deine Klausuren ID ein:");
        int klausurID;
        try {
            klausurID = sc.nextInt();
            sc.nextLine();
        } catch (InputMismatchException e){
            System.out.println("Du hast eine Fehlerhafte ID versucht einzugeben daher wurde sie auf 0 gesetzt. ");
            klausurID = 0;
        }
        Klausur klausur = findKlausurenID(klausurID, java.getKlausren(),dbmsql.getKlausren());

        if(klausur != null){
            System.out.println("\nZugeordnetes Fach: "+ klausur.getFach().getBezeichnung());
        } else {
            System.out.println("\nKlausur mit ID: " + klausurID + "konnte nicht gefunden werden!");
        }
    }

    public static void navigationFachzuKlausur(Scanner sc, Fach java, Fach dbmsql){
        System.out.println("\nGibt bitte deine Fach ein:");
        String bezeichnung;

        bezeichnung = sc.nextLine();

        Fach fach = findFachnachBezeichnung(bezeichnung, java, dbmsql);

        if(fach != null){
            System.out.println("\nZugeordnetes Klausur: ");
            for (Klausur klausur : fach.getKlausren()){
                System.out.println(" - ID " + klausur.getId() + " Note: " + klausur.getNote());
            }
        } else {
            System.out.println("\nFach mit Bezeichnung: " + bezeichnung + "konnte nicht gefunden werden!");
        }
    }


    public static void main(String[] args) {
        Fach java = new Fach(1, "Java-Grundlagen");
        Fach dbmsgl = new Fach(2 ,"Datenbankenmodelierung & SQL");

        Klausur javak1 = new Klausur(1, 4);
        Klausur javak2 = new Klausur(2, 2);
        Klausur dbmsql1 = new Klausur(3, 1);

        java.addKlausur(javak1);
        java.addKlausur(javak2);
        dbmsgl.addKlausur(dbmsql1);

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nWählen eine Aktion:\n1. Von Klausur zu Fach Navigieren\n2. Von Fach zu Klausur Navigieren\n0. Exit");
            int auswahl;
            try {
                auswahl = sc.nextInt();
            } catch (InputMismatchException e) {
                auswahl = 4;
            }
            sc.nextLine();

            switch (auswahl){
                case 1:
                    navigationKlausurzuFach(sc, java, dbmsgl);
                    break;
                case 2:
                    navigationFachzuKlausur(sc,java,dbmsgl);
                    break;
                default:
                    System.out.println("\n\n"+Farbcode.ROT.getFarbe()+"Ungültige Eingaben\n\n"+Farbcode.DEFAULT.getFarbe());
                    break;
            }

        }



    }

}

