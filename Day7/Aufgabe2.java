package Day7;

import java.util.*;

public class Aufgabe2 {
    static Random rnd = new Random();
    static Scanner sc = new Scanner(System.in);



    public static void fülleLottoArray(int[] arr){
        Random(arr);
        Arrays.sort(arr);
    }


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
                        }catch (InterruptedException ignored){
                        }
                    }
                }
                Arrays.sort(tipp);
                break;
            default:
                Random(tipp);
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
                //winner = true;
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

    private static void Random(int[] tipp) {
        for (int i = 0; i < 6; i++) {
            tipp[i] = rnd.nextInt(48)+1;
            for (int j = 0; j < i; j++) {
                if (tipp[i] == tipp[j]){
                    i--;
                }
            }
        }
    }
}
