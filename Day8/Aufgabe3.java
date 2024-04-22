package Day8;
/*
        VORBEMERKUNG:
        Das folgende Programm soll mit einer Liste von String-Arrays der Länge 2 arbeiten
        => Jedes Element der Liste ist also ein Array, in dem jeweils 2 Strings abgespeichert werden können.

        AUFGABENSTELLUNG:
        Schreiben Sie bitte ein Programm, in dem ...

        - zunächst eine Liste von String-Arrays der Länge 2 eingeführt wird

        - eine Endlos-Schleife startet, in der pro Durchlauf ...
          + vom User ein deutsches Wort und dessen englische übersetzung abgefragt wird
          + die beiden User-Eingaben in ein String-Array der Länge 2 abgespeichert werden
          + dieses Array in der Liste abgespeichert wird
          + anschließend alle Wortpaare der Liste ausgegeben werden
*/


import java.util.ArrayList;
import java.util.Scanner;

public class Aufgabe3 {

    public static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        //Initalisierung der Liste
        ArrayList<String[]> doppelWums = new ArrayList<>();
        //endlosschleife
        while (true){
            //Gib deutsches Wort ein
            System.out.println("\nGeben Sie ein Deutsches Wort ein:  ");
            String deutschesWort = sc.nextLine();
            //Gib Englisches Wort ein
            System.out.println("\nGeben Sie ein Englisches Wort ein:  ");
            String englischesWort = sc.nextLine();

            //Deutsches und Englisches wort werden in String Array gespeichert
            String[] wortpaar = {deutschesWort, englischesWort};
            //String Array wird in ArrayList Gespeichert
            doppelWums.add(wortpaar);

            //Ausgabe der Wortpaare
            System.out.println("\n Alle Wortpaare: ");
            for (String[] worpaar : doppelWums){
                System.out.println(worpaar[0]+ " - " + worpaar[1]);
            }
        }


    }
}
