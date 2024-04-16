package Day6;

/*
    Schreiben Sie bitte ein Java-Programm, in dem ...
    - in einer Schleife 6 Lottozahlen abgefragt werden
        + Die Abfrage einer Zahl wird wiederholt, wenn ...
              a) Das Eingabeformat keiner ganzen Zahl entspricht
              b) Die eingegebene Zahl bereits zuvor ausgewählt wurde
              c) Die eingegebene Zahl nicht zwischen 1 und 49 liegt
        + Falls weder a), b) noch c) zutrifft, wird die eingegebene Zahl in das Integer-Array 'tipp' abgespeichert.
    - nach der Schleife das Array tipp sortiert wird
    - anschließend das Array auf der Konsole ausgegeben wird
*/



import java.util.Arrays;
import java.util.Scanner;


public class Aufgabe2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lottoZahlen[] = new int[6];
        String lottoAusgabe = "";
        int userZahl;

        for (int i = 0; i < 6; i++) {
            System.out.println("Gib deine " + (i+1) +"." + " Lottozahl ein: ");

            try{
            userZahl = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                userZahl = 50;
            };

            for (int j = 0; j < 6; j++) {
                if (userZahl == lottoZahlen[j]){
                    userZahl = 50;
                    System.err.println("Es sind keine Doppelten Zahlen erlaubt.");
                }
            }

            if(userZahl >= 1 && userZahl <= 49){
                lottoZahlen[i] = userZahl;
            }else {
                System.err.println("Du hast eine fehlerhafte eingabe getätigt.");
                i--;
            }

        }

        for (int j = 0; j < 6; j++) {
            lottoAusgabe = lottoAusgabe + lottoZahlen[j] + " ";
        }


        System.out.println("Deine Lottozahlen Lauten: " + lottoAusgabe);

        Arrays.sort(lottoZahlen);

        lottoAusgabe = "";

        for (int h = 0; h < 6; h++) {
            lottoAusgabe = lottoAusgabe + lottoZahlen[h] + " ";
        }

        System.out.println("Lottozahlen göhren nicht sortiert aber hier : " + lottoAusgabe);


    }
}
