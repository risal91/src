//package Day7;
//
//import java.util.Arrays;
//import java.util.Random;
//import java.util.Scanner;
//
//public class Aufgabe2 {
//    static Random rnd = new Random();
//    static Scanner sc = new Scanner(System.in);
//
////    Schreiben Sie bitte zunächst die beiden folgenden Methoden:
////    a) Funktionsname: fülleLottoArray
////    Übergabewerte: 1 Integer-Array
////    Funktion:      Füllt in das Array mit 6 Lottozahlen (Zahlen zwischen 1 und 49, KEINE Zahl darf mehrfach auftreten)
////    Rückgabewert:  Keiner
//
//    public static void fülleLottoArray(int[] arr){
//
//            //Wir machen gehen in eine for schleife und füllen 6 stellen i in das Array arr
//            // mit zahlen von 1-49
//            for (int i = 0; i < 6; i++) {
//                arr[i] = rnd.nextInt(48)+1;
//                //wir machen eine for schleife zu überprüfung ob Zahlen auf der aktuellen i stelle schon
//                //einmal vorhanden sind dafür gehen wir mit j einmal durch das array und prüfen ob I = J irgendwo ist
//                for (int j = 0; j < i; j++) {
//                    if (arr[i] == arr[j]){
//                        i--;
//                    }
//                }
//        }
//        Arrays.sort(arr);
//        }
//
////    b) Funktionsname: zähleTreffer
////    Übergabewerte: 2 Integer-Array a und b
////    Funktion:      Zählt die Anzahl der "Treffer" (= Anzahl der Zahlen, die in a und b gemeinsam auftreten)
////    Rückgabewert:  Anzahl der Treffer
//
//    public static int zähleTreffer(int[] arr, int[] brr) {
//
//        int treffer = 0;
//        for (int zahl : arr){
//            for (int zahl2 : brr)
//                if (zahl == zahl2){
//                    treffer++;
//                    break;
//                }
//        }
//    return treffer;
//    }
//
//
//    public static void main(String[] args) {
//
//        int[] tipp = new int[6];
//        int[] fülleLottoArray = new int[6];
//        int[] übertragung = new int[6];
//        int durchlauf = 0;
//        int treffer = 0;
//        boolean winner = false;
//        int[][] auslosung = new int[99999][6];
//        int wahl;
//        int höchsteZahl = 0;
//        int einser = 0;
//        int zweier = 0;
//        int dreier = 0;
//        int vierer = 0;
//        int fünfer = 0;
//        int sexser = 0;
//
//        System.out.println("Sollen deine Lotto zahlen zufällig generiert werden: \n 1 Ja\n 2 Nein");
//        wahl = Integer.parseInt(sc.nextLine());
//
////        Verwenden Sie obige Funktionen bitte in folgendem Java-Programm, in dem ...
////        - zunächst ein Lottotipp ausgelost wird (Random oder vom Benutzer eingeben lassen)
////        und in einem Array 'tipp' abgespeichert wird
//        switch (wahl){
//            case 2:
//                //user soll eine zahl von 1-49 eingeben
//                for (int i = 0; i < 6; i++) {
//                    System.out.println("Bitte geben Sie Ihren " + (i+1) + ". Tipp ein (1-49):" );
//                    tipp[i] = Integer.parseInt(sc.nextLine());
//                    System.out.println();
//
//
//                    //wir überprüfen ob die zahl doppelt vorkommt oder ob sie einzigartig ist
//                    //sollte die zahl doppelt sein wird i um 1 reduziert und er muss die stelle erneut eingeben
//                    for (int j = 0; j < i; j++) {
//                        if (tipp[i] == tipp[j]) {
//                            i--;
//                            System.err.println("Du hast eine Doppelte Zahl eingegeben versuch es erneut! ");
//                            System.out.println();
//                            //Fürs auge kurz warten das Fehler meldung auch an der richtigen stelle steht
//                            try {
//                                Thread.sleep(250);
//                            } catch (InterruptedException e) {
//                            }
//                        }
//                    }
//
//
//                    //Überprüfen ob die zahl zwischen 1 und 49 liegt wenn das nicht der fall ist wird i um 1 reduziert
//                    //und er muss die selbe stelle erneut eingeben
//                    if(tipp[i] <= 1 || tipp[i] >= 49){
//                        System.err.println("Die eingegebene Zahl ist nicht zwischen 1 und 49 versuch es erneut! ");
//                        System.out.println();
//                        i--;
//                        //Fürs auge kurz warten das Fehler meldung auch an der richtigen stelle steht
//                        try{
//                            Thread.sleep(250);
//                        }catch (InterruptedException e){
//                        }
//                    }
//                }
//                Arrays.sort(tipp);
//                break;
//            default:
//                for (int i = 0; i < 6; i++) {
//                    tipp[i] = rnd.nextInt(48)+1;
//                    //wir machen eine for schleife zu überprüfung ob Zahlen auf der aktuellen i stelle schon
//                    //einmal vorhanden sind dafür gehen wir mit j einmal durch das array und prüfen ob I = J irgendwo ist
//                    for (int j = 0; j < i; j++) {
//                        if (tipp[i] == tipp[j]){
//                            i--;
//                        }
//                    }
//                }
//                Arrays.sort(tipp);
//        }
//
////        - anschließend eine do-while-Schleife startet, die pro Durchlauf ...
////        + eine Lotto-Auslosung (6 Zahlen, also ohne Zusatzzahl) in ein Array 'auslosung' abspeichert
////
//
//        do {
//
//
////            + die Auslosung in einem 2-dimensionalen Array abspeichert
//            for (int i = 0; i < auslosung.length; i++) {
//                fülleLottoArray(fülleLottoArray);
//
//                for (int k = 0; k < fülleLottoArray.length; k++) {
//                    übertragung[k] =  fülleLottoArray[k];
//                }
//                for (int j = 0; j < auslosung[i].length; j++){
//                    auslosung[i][j] = übertragung[j];
//                }
//            }
//            treffer = zähleTreffer(tipp,auslosung[durchlauf]);
////             + Lottotipp und (aktuelle) Auslosung auf der Konsole ausgibt
////            + aktuelle Anzahl der Treffer (wie viele Richtige wurden erzielt?) ermittelt und auf der Konsole ausgibt
////                System.out.println("Die " +(durchlauf+1) + "." + "\nDie Lotto Zahlen Lauten: "
////                        + Arrays.toString(auslosung[durchlauf])+
////                        "\nDeine Glückszahlen sind: " + Arrays.toString(tipp) +
////                        "\nsomit hast du " + treffer + " treffer\n\n");
////            - die Schleife endet, wenn (mindestens) 3 Treffer erreicht wurden, oder 10 Durchläufe / Auslosungen stattfanden.
//                if (treffer >= 6){
//                    winner = true;
//                }
//                if (treffer > höchsteZahl){
//                    höchsteZahl = treffer;
//                }
//                if (treffer == 1){
//                    einser++;
//                }
//                if (treffer == 2){
//                    zweier++;
//                }
//                if (treffer == 3){
//                    dreier++;
//                }
//                if (treffer == 4){
//                    vierer++;
//                }
//                if (treffer == 5){
//                    fünfer++;
//                }
//                if (treffer == 6){
//                    sexser++;
//                }
//
//            durchlauf++;
//            System.out.println(durchlauf);
//
//        }while (durchlauf < 99999 && !winner);
////        - nach der Schleife zur Kontrolle die Auslosungen des 2-dimensionalen Arrays auf der Konsole ausgegeben werden
//
//        for (int i = 0; i < 10; i++) {
//            System.out.println("Die " + (i+1) + ". Ziehung war: " +Arrays.toString(auslosung[i]));
//        }
//        System.out.println("Dein Tipp zahlen waren: " + Arrays.toString(tipp));
//
//        System.out.println("\n\n Das Höchsteergebniss war: " +höchsteZahl+" \nEs gab: " + einser +" \nEs gab: " + zweier +" \nEs gab: " + dreier +" \nEs gab: " + vierer +" \nEs gab: " + fünfer +" \nEs gab: " + sexser);
//
//
//
//    }
//}
//
//
//

package Day7;

import java.util.*;

public class Aufgabe2 {
    static Random rnd = new Random();
    static Scanner sc = new Scanner(System.in);



    public static void fülleLottoArray(int[] arr){

        for (int i = 0; i < 6; i++) {
            arr[i] = rnd.nextInt(48)+1;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]){
                    i--;
                }
            }
        }
        Arrays.sort(arr);
    }

//    public static void fülleLottoArray(int[] arr) {
//        List<Integer> numbers = new ArrayList<>();
//        for (int i = 1; i <= 49; i++) {
//            numbers.add(i);
//        }
//        Collections.shuffle(numbers);
//        for (int i = 0; i < 6; i++) {
//            arr[i] = numbers.get(i);
//        }
//        Arrays.sort(arr);
//    }




    public static int zähleTreffer(int[] arr, int[] brr) {

        int treffer = 0;
        if (arr != null){
        for (int zahl : arr){
            for (int zahl2 : brr)
                if (zahl == zahl2){
                    treffer++;
                    break;
                }
        }        }

        return treffer;
    }

//    public static int zähleTreffer(int[] player, int[] draw) {
//        Set<Integer> drawNumbers = new HashSet<>();
//        for (int number : draw) {
//            drawNumbers.add(number);
//        }
//        int hits = 0;
//        for (int number : player) {
//            if (drawNumbers.contains(number)) {
//                hits++;
//            }
//        }
//        return hits;
//    }


    public static void main(String[] args) {

        int[] tipp = new int[6];
        int[] fülleLottoArray = new int[6];
        int[] übertragung = new int[6];
        int durchlauf = 0;
        int treffer = 0;
        boolean winner = false;
        int[][] auslosung = new int[140000000][6];
        int wahl;
        int höchsteZahl = 0;
        int einser = 0;
        int zweier = 0;
        int dreier = 0;
        int vierer = 0;
        int fünfer = 0;
        int sexser = 0;

        System.out.println("Sollen deine Lotto zahlen zufällig generiert werden: \n 1 Ja\n 2 Nein");
        wahl = Integer.parseInt(sc.nextLine());

        long startTime = System.currentTimeMillis(); // Startzeit erfassen


        switch (wahl){
            case 2:

                for (int i = 0; i < 6; i++) {
                    System.out.println("Bitte geben Sie Ihren " + (i+1) + ". Tipp ein (1-49):" );
                    tipp[i] = Integer.parseInt(sc.nextLine());
                    System.out.println();



                    for (int j = 0; j < i; j++) {
                        if (tipp[i] == tipp[j]) {
                            i--;
                            System.err.println("Du hast eine Doppelte Zahl eingegeben versuch es erneut! ");
                            System.out.println();
                            try {
                                Thread.sleep(250);
                            } catch (InterruptedException e) {
                            }
                        }
                    }



                    if(tipp[i] <= 1 || tipp[i] >= 49){
                        System.err.println("Die eingegebene Zahl ist nicht zwischen 1 und 49 versuch es erneut! ");
                        System.out.println();
                        i--;

                        try{
                            Thread.sleep(250);
                        }catch (InterruptedException e){
                        }
                    }
                }
                Arrays.sort(tipp);
                break;
            default:
                for (int i = 0; i < 6; i++) {
                    tipp[i] = rnd.nextInt(48)+1;
                    for (int j = 0; j < i; j++) {
                        if (tipp[i] == tipp[j]){
                            i--;
                        }
                    }
                }
                Arrays.sort(tipp);
        }


        do {

            for (int i = durchlauf; i == durchlauf; i++) {
//            + die Auslosung in einem 2-dimensionalen Array abspeichert
                fülleLottoArray(fülleLottoArray);

                for (int k = 0; k < fülleLottoArray.length; k++) {
                    übertragung[k] =  fülleLottoArray[k];
                }
                for (int j = 0; j < auslosung[i].length; j++){
                    auslosung[i][j] = übertragung[j];
                }
            }
            treffer = zähleTreffer(tipp,auslosung[durchlauf]);

            if (treffer >= 6){
                winner = true;
            }
            if (treffer > höchsteZahl){
                höchsteZahl = treffer;
            }
            if (treffer == 1){
                einser++;
            }
            if (treffer == 2){
                zweier++;
            }
            if (treffer == 3){
                dreier++;
            }
            if (treffer == 4){
                vierer++;
            }
            if (treffer == 5){
                fünfer++;
            }
            if (treffer == 6){
                sexser++;
            }

            durchlauf++;

        }while (durchlauf < 140000000 && !winner);

        for (int i = 0; i < 200; i++) {
            System.out.println("Die " + (i+1) + ". Ziehung war: " +Arrays.toString(auslosung[i]));
        }
        System.out.println("Dein Tipp zahlen waren: " + Arrays.toString(tipp));

        System.out.println("\n\n Das Höchsteergebniss war: " +höchsteZahl+" \nEs gab: " + einser +" \nEs gab: " + zweier +" \nEs gab: " + dreier +" \nEs gab: " + vierer +" \nEs gab: " + fünfer +" \nEs gab: " + sexser);
        System.out.println(durchlauf);
        long endTime = System.currentTimeMillis(); // Endzeit erfassen

        long duration = endTime - startTime; // Differenz berechnen
        System.out.println("Laufzeit des Programms: " + (duration / (1000 * 60))+":" + (duration / 1000) + " Minuten");

    }
}
