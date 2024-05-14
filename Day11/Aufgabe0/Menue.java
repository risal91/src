package Day11.Aufgabe0;

import java.util.Scanner;

public class Menue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Willst du mit mir gehen? (Ja, Nein, Vielleicht) ");

        String eingabe = sc.nextLine().toUpperCase();

        try {
            Auswahl auswahl = Auswahl.valueOf(eingabe);

            switch (auswahl){
                case JA -> System.out.println("Du hast Ja gewählt!");
                case NEIN -> System.out.println("Du hast Nein gewählt!");
                case VIELLEICHT -> System.out.println("Du hast Vielleicht gewählt!");
            }
        } catch (IllegalArgumentException e) {
            System.err.println("Ungültige Eingabe!");
        }
    }
}
