package Day3;

/*
 * Aufgabe 3
 * Schreiben Sie ein Programm das Ihnen zu jedem Monat im Jahr, den Sie mit der String-Variable "monat" einführen, die Tage des Monats ausgibt.
 * Nutzen Sie für die Monats-Auswahl ein Switch-Case. Bei falscher Monatsangabe soll eine Fehlermeldung auf der Konsole erscheinen.
 * Für den Monat Februar sind 28 Tage anzugeben.
 * Ausgabe auf der Konsole soll wie folgt lauten: "Der "+monat+" hat "+tage+" Tage."
 */



import java.util.Scanner;

public class Aufgabe3 {
    public static void main(String[] args) {
    String monat;
    String userMonat;

    //Variante Kurz (Variante 2)
    String monat2;
    String upLetter;

        Scanner sc = new Scanner(System.in);
        System.out.println("Gib einen Monat ein:");
        System.out.println("");
        userMonat = sc.nextLine();
        monat = userMonat.toLowerCase();
        System.out.println("");

        if (monat.equals("maerz")){
            monat = "märz";
        }

        //Variante Kurz (Variante 2)
        upLetter = String.valueOf(monat.charAt(0)).toUpperCase();
        monat2 = upLetter + monat.substring(1,monat.length());


        //Variante Kurz (Variante 2)
        switch (monat2) {
            case "Januar", "März", "Mai", "Juli", "August","Oktober", "Dezember":
                System.out.println("Der Monat " + monat2 +" hat 31 Tage.");
                break;
            case "April", "Juni", "September", "November":
                System.out.println("Der Monat " + monat2 +" hat 30 Tage.");
                break;
             case "Februar":
                System.out.println("Der Monat " + monat2 +" hat 28 Tage.");
                break;
            default:
                System.out.println("Deine eingabe " +userMonat+ " ist keine uns bekannter Monat.");
        }

        // Variant Lang (Variante 1)
        switch (monat) {
            case "januar":
                System.out.println("Der Monat Januar hat 31 Tage.");
                break;
            case "februar":
                System.out.println("Der Monat Februar hat 28 Tage.");
                break;
            case "märz":
                System.out.println("Der Monat März hat 31 Tage.");
                break;
            case "april":
                System.out.println("Der Monat April hat 30 Tage.");
                break;
            case "mai":
                System.out.println("Der Monat Mai hat 31 Tage.");
                break;
            case "juni":
                System.out.println("Der Monat Juni hat 30 Tage.");
                break;
            case "juli":
                System.out.println("Der Monat Juli hat 31 Tage.");
                break;
            case "august":
                System.out.println("Der Monat August hat 31 Tage.");
                break;
            case "september":
                System.out.println("Der Monat September hat 30 Tage.");
                break;
            case "oktober":
                System.out.println("Der Monat Oktober hat 31 Tage.");
                break;
            case "november":
                System.out.println("Der Monat November hat 30 Tage.");
                break;
            case "dezember":
                System.out.println("Der Monat Dezember hat 31 Tage.");
                break;

            default:
                System.out.println("Deine eingabe " +userMonat+ " ist keine uns bekannter Monat.");
        }

    }

}
