package Day8;

/*
 Schreiben Sie bitte ein Java Programm, in dem ...

 - innerhalb einer ersten Schleife pro Durchlauf ganze Zahlen abgefragt werden:
   + falls der User inkorrekte Eingaben tätigt (Text, Kommazahlen, zu große Zahlen ...) wird die Eingabe ignoriert
   + falls die Eingabe eine positive ganze Zahl ist, wird sie in eine Integer-Liste eingetragen
   + falls die Eingabe eine negative Ganzzahl oder 0 ist, endet diese erste Schleife

 - eine foreach-Schleife startet, die alle Elemente aus der Liste ausgibt

 - eine weitere Schleife startet, in der pro Durchlauf eine ganze Zahl abgefragt wird:
   + falls der User keine ganze Zahl eingibt, kommt es zum nächsten Schleifendurchlauf (Wiederholen der Abfrage)
   + falls der User eine ganze Zahl x eingibt, endet die Schleife


 - aus der Liste alle Elemente gelöscht werden, deren Wert x ist (siehe vorangegangene User-Eingabe)
 - zur Kontrolle die (verkürzte) Liste ausgegeben wird

 Zur Erläuterung ein Beispiel:
 Angenommen der User gibt der Reihe nach 1 2 2 3 a b c und -1 ein, dann ergibt die erste Ausgabe: 1 2 2 3
 (denn a b und c werden ignoriert und -1 beendete die Eingabe-Schleife)
 Nehmen wir ferner an, der User gibt anschließend der Reihe nach a b 2 ein, so werden alle 2en aus der Liste gelöscht
 (denn a und b wurden ignoriert und die erste zulässige Eingabe als Löschwert genutzt)
 => die abschließende Ausgabe lautet dann also: 1 3

 */


import java.util.*;

public class Aufgabe1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> zahlenListe = new ArrayList<>();

        //erste Schleife für befüllen der Liste

        while (true){
            System.out.println("Bitte gib ein Ganze zahl ein (Negative Ganze zahl oder 0 beenden die Schleife):  ");
            try {
                int zahl = sc.nextInt();
                if (zahl > 0){
                    zahlenListe.add(zahl);
                }else { //Beende die schleife
                    break;
                }
            }catch (InputMismatchException ex1){
                System.out.println("Ungültige Eingabe! Bitte nur ganze Zahlen.");
                sc.next(); // Eingabe leeren
            }
        }

        //Ausgabe der liste
        for ( Integer zahl : zahlenListe ){
            System.out.println("- "+ zahl);
        }

        // Abfrage der zu löschenden Zahlen
        int loescher;
        while (true){
            System.out.println("Bitte gib ein Ganze zahl ein (Negative Ganze zahl oder 0 beenden die Schleife):  ");
            try {
                loescher = sc.nextInt();
                if (loescher >= 0){
                    break;
                }
            }catch (InputMismatchException ex1){
                System.out.println("Ungültige Eingabe! Bitte nur ganze Zahlen.");
                sc.next(); // Eingabe leeren
            }
        }
        //Lösche das Element aus der liste
        zahlenListe.removeAll(Collections.singleton(loescher));

        //ausgabe Verkürzte Liste
        System.out.println("Die verkürzte Liste: ");
        for ( Integer zahl : zahlenListe ){
            System.out.println("- "+ zahl);
        }





    }
}
