package Day7;
/*
Führen Sie im Main bitte zunächst das folgende 3-Dimensionale Array ein:

      String[][][] dim3 = new String[][][] {
            {
                {"Tabelle","Datenbank","Spalte","Beschränkung"},
                {"zuweisen","setzen","erhalten","Liste"},
                {"Puffer","Projekt","Organisation","Interessengruppe"}
            },
            {
                {"table","database","column","constraint"},
                {"assign","set","get","list"},
                {"buffer","project","organization","stakeholder"}
            }
        };

 HINWEISE:
 - Die dritte Dimension zählt die Sprache (0=Deutsch, 1=Englisch)
 - Die zweite Dimension zählt das Fach (0=SQL, 1=OOP, 2=PM)
 - Die erste Dimension zählt die Wortnummern [0 bis 3] (Für jede Sprache und jedes Fach jeweils 4 Wörter)

 Schreiben Sie bitte das folgende Programm, um den Umgang mit diesem 3-dimensionalen Array zu testen:
 - Das Programm besteht aus einer Endlos-Schleife, in der pro Durchlauf ...
   + Die Sprache abgefragt wird (Deutsch=1 / Englisch=2) - Wiederholung der Abfrage bei Fehleingabe
   + Das Fach abgefragt wird (SQL=1 / OOP=2 / PM=3) - Wiederholung der Abfrage bei Fehleingabe
   + Die Wortnummer abgefragt wird (ein Wert zwischen 1 und 4) - Wiederholung der Abfrage bei Fehleingabe
   + das gewählte Wort, des gewählten Fachs in der gewählten Sprache auf der Konsole ausgegeben wird

   Beispiel:
   Bei der Auswahl: 1 1 1 (Deutsch, SQL, 1.Wort) kommt es zur Ausgabe von dim3[0][0][0]="Tabelle"
*/


import java.util.Scanner;

public class Aufgabe3 {

    static Scanner sc = new Scanner(System.in);

    //Abfrage der Sprache Wir lassen ihn solange zahlen eingeben bis sie 1 oder 2 sind
    private static int getLanguage(Scanner sc){
        System.out.println("Sprache Wählen \nDeutsch=1 \nEnglisch=2");
        int language = Integer.parseInt(sc.nextLine());

        while (language < 1 || language > 2 ) {
            System.out.println("Bist du zu dumm 1 oder 2 einzugeben! Versuch es nochmal \nDeutsch=1 \nEnglisch=2");
            language = Integer.parseInt(sc.nextLine());
        }

        return language;
    }

    //Abfrage des fachs wir lassen ihn solange zahlen eingeben bis er es schafft 1, 2 oder 3 einzugeben
    private static int getFach(Scanner sc){
        System.out.println("Fach wählen \nSQL=1\nOOP=2\nPM=3");
        int fach = Integer.parseInt(sc.nextLine());

        while (fach < 1 || fach > 3){
            System.out.println("Bist du zu dumm 1,2 oder 3 einzugeben! Versuch es nochmal \nSQL=1\nOOP=2\nPM=3");
            fach = Integer.parseInt(sc.nextLine());
        }

        return fach;
    }

    //Abfrage der Wortnummer wir lassen ihn solange zahlen eingeben bis er es schafft 1, 2, 3 oder 4 einzugeben
    private static int getwortNummer(Scanner sc){
        System.out.println("Wählen sie die Wortnummer (1 bis 4): ");
        int wortNummer = Integer.parseInt(sc.nextLine());

        while (wortNummer < 1 || wortNummer > 4){
            System.out.println("Bist du zu dumm 1, 2, 3 oder 4 einzugeben! Versuch es nochmal: ");
            wortNummer = Integer.parseInt(sc.nextLine());
        }

        return wortNummer;
    }



    public static void main(String[] args) {
    //Führen Sie im Main bitte zunächst das folgende 3-Dimensionale Array ein:
        String[][][] dim3 = new String[][][] {
                {
                        {"Tabelle","Datenbank","Spalte","Beschränkung"},
                        {"zuweisen","setzen","erhalten","Liste"},
                        {"Puffer","Projekt","Organisation","Interessengruppe"}
                },
                {
                        {"table","database","column","constraint"},
                        {"assign","set","get","list"},
                        {"buffer","project","organization","stakeholder"}
                }
        };

        //Endlossschleife
        while (true){
            //Abfrage der Sprach
            int language = getLanguage(sc);

            //Abfrage des Fachs
            int fach = getFach(sc);

            //Abfrage der Wortnummer
            int wortNummer = getwortNummer(sc);

            //Ausgabe des gewählten Wortes
            System.out.println(dim3[language - 1][fach - 1][ wortNummer - 1]);
        }

    }
}
