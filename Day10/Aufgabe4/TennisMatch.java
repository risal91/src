package Day10.Aufgabe4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class TennisMatch {
    /**
     * Initialisierung der Basis Variablen
     */
    private static ArrayList<String> team1 = new ArrayList<>();
    private static ArrayList<String> team2 = new ArrayList<>();
    private static int team1Score = 0;
    private static int team2Score = 0;


    /**
     * eiführung des Zufallsgenerators
     */
    private  static Random rnd = new Random();

    public static void main(String[] args) {
        /**
         * Methoden aufrufe für Initialsierung der Teams und des Spiel Starts
         */
        initialisiereTeams();

        spielePartie();
    }

    /**
     * Initialsierung der Teams in die Arrays
     */
    private static void initialisiereTeams(){
        team1.add("Hugo Meier");
        team1.add("Susi Sorglos");
        team1.add("Fred Feuerstein");
        team1.add("Marie Müller");

        team2.add("Fritz Meier");
        team2.add("Walter Sorglos");
        team2.add("Sigrid Feuerstein");
        team2.add("Annemarie Müller");
    }

    /**
     * Start der Spiele partie so lange bis 1 Team keine Spieler mehr hat nach dem KO system
     */
    private static void spielePartie(){
    while ( team1.size() >= 1 && team2.size() >= 1){
        /**
         * es wird ein Zufälliger Spieler Festgelegt mit der Mthode gtRNDPlayer
         */
        int index1 = getRNDPlayer(team1);
        int index2 = getRNDPlayer(team2);
        String player1 = team1.get(index1);
        String player2 = team2.get(index2);

        /**
         * wir lassen 2 Zufällige Spieler in der methode Spiele Runde gegeneinander antreten
         * und uns bekommen zurück ob Player1 Gewonnen oder verloren hat
         * 0 = er hat verloren
         * 1=  er hat gewonnen
         */
        int player1Score = spieleRunde(player1, player2);


        /**
         * hier wird dem Gewinner Team ein Punkt gegeben für den Sieg und der Spieler der verloren hat wird aus seinem Team Entfernet
         */
        if (player1Score > 0){
            team1Score++;
            System.out.println("Da "+ player2 + " verloren hat wird er entfernt");
            team2.remove(index2);
            System.out.println("Team 2 hat noch folgende Spieler " + team2);
            System.out.println();

        }else {
            team2Score++;
            System.out.println("Da "+ player1 + " verloren hat wird er entfernt");
            team1.remove(index1);
            System.out.println("Team 1 hat noch folgende Spieler " + team1);
            System.out.println();
        }
        /**
         * Ausgabe Aktueller Punktestand
         */
        System.out.println("Spielstand : Team 1 - Team 2 " +team1Score +"-"+team2Score);
    }
        /**
         * ermittelung Gesamt  Sieger + Ausgabe
         */
    String gesamtSieger = team1Score > team2Score ? "Team 1" : "Team 2";
    System.out.println("And the Winnder is: (Trommel wirbel) " +gesamtSieger);
    }

    /**
     *
     * @param team hier werden die team Arrays übergeben
     * @return und es wird eine index nummer 0- max teamlänge zurück gegeben
     */
    private static int getRNDPlayer(ArrayList<String> team){
        int index =  rnd.nextInt(team.size());
        return index;
    }

    /**
     * @param player1 der Spieler für Team 1
     * @param player2 der Spieler für Team 2
     * @return hier wird zurück gegeben ob spieler 1 Gewonnen oder verloren hat 0 = verloren || 1 = Gewonnen
     */
    private static int spieleRunde(String player1, String player2){
        int player1Punkte = 0;
        int player2Punkte = 0;


        /**
         * Gespielt wird bis einer spieler 6 Punkte hat
         * dazu wird ein zufälliger boolean ermittelt also True oder False
         */
        while (player1Punkte < 6 && player2Punkte < 6){
            if (rnd.nextBoolean()){
                player1Punkte++;
            } else {
                player2Punkte++;
            }
            /**
             * hier geben wir den Aktuellen punktestand aus
             */
            System.out.println("Punktestand: " + player1 +":" +player1Punkte + "  -  " +player2 + ":"+ player2Punkte);
        }
        System.out.println();

        /**
         * un hier wird zurück gegeben ob Player 1 Gewonnen hat
         */
        int winner;
        if (player1Punkte > player2Punkte){
            winner = 1;
        } else {
            winner = 0;
        }
        return winner;
    }
}
