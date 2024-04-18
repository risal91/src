package Day7;

/*
    Schreiben Sie bitte zunächst die beiden folgenden Methoden:
    a) Funktionsname: fülleLottoArray
       Übergabewerte: 1 Integer-Array
       Funktion:      Füllt in das Array mit 6 Lottozahlen (Zahlen zwischen 1 und 49, KEINE Zahl darf mehrfach auftreten)
       Rückgabewert:  Keiner

    b) Funktionsname: zähleTreffer
       Übergabewerte: 2 Integer-Array a und b
       Funktion:      Zählt die Anzahl der "Treffer" (= Anzahl der Zahlen, die in a und b gemeinsam auftreten)
       Rückgabewert:  Anzahl der Treffer

    Verwenden Sie obige Funktionen bitte in folgendem Java-Programm, in dem ...
    - zunächst ein Lottotipp ausgelost wird (Random oder vom Benutzer eingeben lassen)
		und in einem Array 'tipp' abgespeichert wird
    - anschließend eine do-while-Schleife startet, die pro Durchlauf ...
      + eine Lotto-Auslosung (6 Zahlen, also ohne Zusatzzahl) in ein Array 'auslosung' abspeichert
      + Lottotipp und (aktuelle) Auslosung auf der Konsole ausgibt
      + aktuelle Anzahl der Treffer (wie viele Richtige wurden erzielt?) ermittelt und auf der Konsole ausgibt
	  + die Auslosung in einem 2-dimensionalen Array abspeichert
    - die Schleife endet, wenn (mindestens) 3 Treffer erreicht wurden, oder 10 Durchläufe / Auslosungen stattfanden.
    - nach der Schleife zur Kontrolle die Auslosungen des 2-dimensionalen Arrays auf der Konsole ausgegeben werden
 */


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Aufgabe2 {
    static Random rnd = new Random();
    static Scanner sc = new Scanner(System.in);


    public static void fülleLottoArray(int[] arr){

            //Wir machen gehen in eine for schleife und füllen 6 stellen i in das Array arr
            // mit zahlen von 1-49
            for (int i = 0; i < 6; i++) {
                arr[i] = rnd.nextInt(48)+1;
                //wir machen eine for schleife zu überprüfung ob Zahlen auf der aktuellen i stelle schon
                //einmal vorhanden sind dafür gehen wir mit j einmal durch das array und prüfen ob I = J irgendwo ist
                for (int j = 0; j < i; j++) {
                    if (arr[i] == arr[j]){
                        i--;
                    }
                }
        }
        Arrays.sort(arr);
        }


    public static int zähleTreffer(int[] arr, int[] brr) {
        int treffer = 0;
        for (int zahl : arr){
            for (int zahl2 : brr)
                if (zahl == zahl2){
                    treffer++;
                    break;
                }
        }
    return treffer;
    }


    public static void main(String[] args) {

        int[] tipp = new int[6];
        int[] fülleLottoArray = new int[6];
        int durchlauf = 0;
        int treffer = 0;
        boolean winner = false;
        int[][] auslosung = new int[10][6];

        for (int i = 0; i < auslosung.length; i++) {
            for (int j = 0; j < auslosung[i].length; j++){
                auslosung[i][j] = fülleLottoArray(fülleLottoArray);;

            }

        }


        for (int i = 0; i < 6; i++) {
            System.out.println(tipp[i]);

        }

        //user soll eine zahl von 1-49 eingeben
        for (int i = 0; i < 6; i++) {
            System.out.println("Bitte geben Sie Ihren " + (i+1) + ". Tipp ein (1-49):" );
            tipp[i] = Integer.parseInt(sc.nextLine());
            System.out.println();

            //wir überprüfen ob die zahl doppelt vorkommt oder ob sie einzigartig ist
            //sollte die zahl doppelt sein wird i um 1 reduziert und er muss die stelle erneut eingeben
            for (int j = 0; j < i; j++) {
                if (tipp[i] == tipp[j]) {
                    i--;
                    System.err.println("Du hast eine Doppelte Zahl eingegeben versuch es erneut! ");
                    System.out.println();
                    //Fürs auge kurz warten das Fehler meldung auch an der richtigen stelle steht
                    try {
                        Thread.sleep(250);
                    } catch (InterruptedException e) {
                    }
                }
            }

            //Überprüfen ob die zahl zwischen 1 und 49 liegt wenn das nicht der fall ist wird i um 1 reduziert
            //und er muss die selbe stelle erneut eingeben
            if(tipp[i] <= 1 || tipp[i] >= 49){
                System.err.println("Die eingegebene Zahl ist nicht zwischen 1 und 49 versuch es erneut! ");
                System.out.println();
                i--;
                //Fürs auge kurz warten das Fehler meldung auch an der richtigen stelle steht
                try{
                    Thread.sleep(250);
                }catch (InterruptedException e){
                }
            }
        }





    }
}



