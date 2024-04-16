package Day6;
/*
 * Aufgabe 3
    AUFGABENSTELLUNG ("große Straße" beim Kniffel-Spiel)

        - Führen Sie bitte zunächst im Main ein Integer-Array der Länge 5 ein
        - Schreiben Sie anschließend bitte die beiden folgenden Methoden:
            a) Funktionsname: fülleWürfelArray
               Übergabewerte: 1 Integer-Array 'arr'
                              2 Integer 'min' und 'max'
               Funktion:      Die Methode füllt das Array arr mit Zufallszahlen zwischen (beiderseits einschließlich) min und max
                              (HINWEIS: Länge des Arrays = arr.Length)
               Rückgabewert:  Keiner

            b) Funktionsname: ausgabeWürfelArray
               Übergabewerte: 1 Integer-Array 'arr'
               Funktion:      Ausgabe aller Arrayfeld-Werte (also für alle Indices zwischen 0 und arr.Length) auf der Konsole
               Rückgabewert:  Keiner

       Verwenden Sie bitte die beiden obigen Methoden in folgendem Java-Programm - für dieses Programm soll gelten:
            - Das Programm startet eine Schleife, pro Durchlauf ...
                + wird ein Array der Länge 5 mit Zufalls-Würfelzahlen gefüllt
                + wird das gefüllte Array (numerisch) sortiert
                + wird überprüft, ob es sich um eine "große Straße" handelt (1,2,3,4,5) oder (2,3,4,5,6)
            - Die Schleife endet, falls eine "große Straße" gewürfelt wurde
            - Das Programm endet mit der Ausgabe der Anzahl der Schleifen-Durchläufe, die nötig waren, um die "große Straße" zu erreichen
*/


import java.util.Arrays;
import java.util.Random;

public class Aufgabe3 {

    public static void fülleWürfelArray(int[] arr, int min, int max) {
        int wurf;
        for (int i = 0; i < arr.length; i++) {
            Random rnd = new Random();
            wurf = rnd.nextInt(max) + min;
            arr[i] = wurf;
        }

    }

    public static void ausgabeWürfelArray(int[] arr) {
        String ausgabe = Arrays.toString(arr);
        System.out.println(ausgabe);
    }


    public static void main(String[] args) {

        int[] arr = new int[5];
        int min = 1;
        int max = 6;
        boolean großeStraße = false;
        String kontroll = "";
        int durchlaufnummer = 0;

        do {
            fülleWürfelArray(arr, min, max);

            Arrays.sort(arr);

            kontroll = Arrays.toString(arr);

            if(kontroll.equals("[1, 2, 3, 4, 5]")){
                großeStraße = true;
            } else if (kontroll.equals("[2, 3, 4, 5, 6]")) {
                großeStraße = true;
            }


            ausgabeWürfelArray(arr);
            durchlaufnummer++;
        }while (großeStraße == false);

        System.out.println("Die Große Straße wurde Gefunden das Programm wird beendet mit " + durchlaufnummer + " versuchen.");




    }


}
