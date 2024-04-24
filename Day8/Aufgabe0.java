package Day8;

/* Aufgabe 0 (Basics)
 * Eine Einkaufsliste:
 * Im Main erzeugen Sie eine Liste vom Typ String und fügen ihr fünf Dinge (Brot, Butter, Käse, Rasierschaum, Schokolade) hinzu.
 * Lassen Sie anschließend alle Strings der Liste über eine Foreach-Schleife ausgeben.
 */


import java.util.ArrayList;

public class Aufgabe0 {

    public static void main(String[] args) {
        //Erstellen eine Einkaufsliste als ArrayList
        ArrayList<String> einkaufsliste = new ArrayList<>();

        // Fülle einkaufsliste
        einkaufsliste.add("Brot");
        einkaufsliste.add("Butter");
        einkaufsliste.add("Käse");
        einkaufsliste.add("Rasierschaum");
        einkaufsliste.add("Schokolade");

        // Post einkaufsliste in konsole

        System.out.println("Einkaufsliste:");
        for (String posten : einkaufsliste){
            System.out.println("- " + posten);
        }


    }
}
