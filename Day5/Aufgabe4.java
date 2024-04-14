package Day5;

/* Schreiben Sie ein Programm, das...
 * eine Zufallszahl von 1 bis inklusive 99 auswürfelt
 * und den Benutzer in einer Schleife über eine Eingabe die Zahl erraten lässt.
 * Dabei wird die eingegebene Zahl in einen Integer geparst. Bei falscher Eingabe soll wiederholt werden.
 * Das Programm teilt nun dem Benutzer mit, ob die Schätzung kleiner oder größer als die gewürfelte Zahl war.
 * Die Schleife endet, wenn die gewürfelte Zahl getroffen wurde.
 * Dem Benutzer wird die Anzahl der Versuche ausgegeben.

 * Recherchieren Sie die Klasse "Random".
 */


import java.util.Random;
import java.util.Scanner;

public class Aufgabe4 {

static Scanner sc = new Scanner(System.in);
static Random r = new Random();

public static int zufall = r.nextInt(98)+1;

    public static void main(String[] args) {
        int user;
        int counter = 1;
        do {
            System.out.println("Rate eine zahl die es sein könnte(1-99): ");
            user = Integer.parseInt(sc.nextLine());

            if (user > zufall){
                System.out.println("tut mir leid deine zahl war zu groß " );
                System.out.println();
                counter++;
            }else if(user < zufall){
                System.out.println("tut mir leid deine zahl war zu klein ");
                System.out.println();
                counter++;
            }

        }while (user != zufall);

        System.out.println("Gut gemacht die Zahl war " + user + " und du hast " + counter + " versuche dafür benötigt!");

    }
}
