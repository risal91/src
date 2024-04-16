package Day6;

/*
 * Aufgabe 1
Schreiben Sie bitte ein Java-Programm, das
a) in einer Endlosschleife den User zu Beginn jeden Durchlaufs fragt, ob er eine  ...
	(1) Übersetzung, oder
	(2) Monatsnummer wünscht
	(3) Programm Beenden

b) bei Eingabe von (1) einen deutschen Monatsnamen abfragt und die englische Übersetzung ausgibt
c) bei Eingabe von (2) einen deutschen Monatsnamen abfragt und die Monatsnummer ausgibt (Januar=1, ...)
d) bei Fehleingaben (Auswahl ungleich 1 und 2 / nicht-existenter deutscher Monatsname) eine entsprechende Fehlermeldung ausgibt

Bemerkung:
Versuchen Sie die Aufgabe bitte zunächst durch zwei 1-dimensionale String-Arrays zu lösen.
*/


import java.util.Scanner;

public class Aufgabe1 {
    static Scanner sc = new Scanner(System.in);
    public static void uebersetzungAbfragen(String[] deutsch, String[] englischeMonate){
        System.out.println("Geben Sie einen Deutschen Monatsnamen ein: ");
        String monatEingabe = sc.nextLine();
        boolean index = false;
        for (int i = 0; i < deutsch.length; i++){
            deutsch[i].equalsIgnoreCase(monatEingabe);
            if (deutsch[i].equalsIgnoreCase(monatEingabe) == true){
                System.out.println("Der Englische Monat lautet: " + englischeMonate[i]);
                index = true;
            }

        }
        if(index == false){
            System.err.println("Kennst du die Monate nicht du Idiot!");
        }

    }

    public static void monatsNummer(String[] deutsch) {
        System.out.println("Geben Sie einen Deutschen Monatsnamen ein: ");
        String monatEingabe = sc.nextLine();
        boolean index = false;

        for (int i = 0; i < deutsch.length; i++){
            deutsch[i].equalsIgnoreCase(monatEingabe);
            if (deutsch[i].equalsIgnoreCase(monatEingabe) == true){
                System.out.println("Der Monat " + deutsch[i] + " ist der " + (i+1) + " Monat im Jahr." );
                index = true;
            }

        }
        if(index == false){
            System.err.println("Kennst du die Monate nicht du Idiot!");
        }
    }


    public static void main(String[] args) {
        boolean exit = true;

        String deutschMonate[] = {"Januar","Februar","März","April","Mai","Juni","July","August","September","Oktober","November","Dezember"};
        String englischeMonate[] = {"January","February","March","April","May","June","July","August","September","October","November","December"};

        do{
            System.out.println("\n Wählen Sie eine Option: \n(1) Übersetzung\n(2) Monatsnummer\n(3) Programm beenden");
            int wahl = sc.nextInt();
            sc.nextLine();

            switch (wahl){
                case 1:
                    uebersetzungAbfragen(deutschMonate,englischeMonate);
                    break;
                case 2:
                    monatsNummer(deutschMonate);
                    break;
                case 3:
                    System.out.println("Programm beendet.");
                    return;
                default:
                    System.out.println("Ungültige Eingabe. Bitte wählen Sie 1, 2 oder 3. ");
            }


        }while (exit == true);

    }


}
