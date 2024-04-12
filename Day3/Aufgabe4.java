package Day3;

/*
 * Aufgabe 4
 * Erweitern Sie die Aufgabe 3 mit der Angabe einer Integer-Variable "jahr" um ein bestimmtes Jahr einzuführen.
 * Danach führen sie eine Kontrollmethode istSchaltjahr ein, die das Jahr kontrolliert, ob es ein Schaltjahr ist.
 * Wenn ja soll anstatt 28 im Februar 29 Tage ausgegeben werden.
 * Die neue Konsolenausgabe soll dann lauten: "Der "+monat+" hat im Jahr "+jahr"+" : "+tage+" Tage.
 */

import java.util.Scanner;


public class Aufgabe4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String monat;
        String userMonat;
        String monat2;
        String upLetter;
        boolean schaltjahr;


        System.out.println("Geben Sie ein Jahr ein :");
        System.out.println("");
        int jahr = Integer.parseInt(sc.nextLine());
        System.out.println("");


        if (jahr % 400 == 0){
            schaltjahr = true;
        } else if (jahr % 100 == 0) {
            schaltjahr = false;
        } else if (jahr % 4 == 0){
            schaltjahr = true;
        } else {
            schaltjahr = false;
        }

        System.out.println("Gib einen Monat ein:");
        System.out.println("");
        userMonat = sc.nextLine();
        monat = userMonat.toLowerCase();
        System.out.println("");

        if (monat.equals("maerz")){
            monat = "märz";
        }

        upLetter = String.valueOf(monat.charAt(0)).toUpperCase();
        monat2 = upLetter + monat.substring(1,monat.length());


        switch (monat2) {
            case "Januar", "März", "Mai", "Juli", "August","Oktober", "Dezember":
                System.out.println("Der Monat " + monat2 +" hat 31 Tage.");
                break;
            case "April", "Juni", "September", "November":
                System.out.println("Der Monat " + monat2 +" hat 30 Tage.");
                break;

            case "Februar":
                if (schaltjahr != true){
                    System.out.println("Der Monat Februar hat 28 Tage.");
                } else {
                    System.out.println("Der Monat Februar hat 29 Tage.");
                }
                break;
            default:
                System.out.println("Deine eingabe " +userMonat+ " ist keine uns bekannter Monat.");
                break;
        }

    }
}
