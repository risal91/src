package Day6;

//       Übungsaufgabe zu Strings, Arrays und Konvertierung
//        ==================================================
//        1.  Der User soll einen Text über die Tastatur eingeben
//        2.  Der Text wird nach der Eingabe codiert
//        Die Codierung soll den Text als BinärCode erzeugen
//        Verwendet dafür eine eigene Methode
//        In dieser Methode wird jedes Zeichen des Textes in den
//        entsprechenden Binärcode umgewandelt und in einen String geschrieben
//        2a. BONUS-AUFGABE: Normiert den Binärcode für jedes Zeichen auf 8bit Länge
//        Aus "1001011" wird dann "01001011" usw...
//        3.  Gebt den codierten Text in der Console aus
//
//        Zur Lösung dieser Aufgabe muss nicht viel SELBST programmiert werden.
//        Sie lässt sich mit den Board-Mitteln einfach lösen.
//
//        Ihr braucht nur:
//        - StringBuilder
//        - StringBuilder.append()
//        - String
//        - String.format()
//        - String.replaceAll() (für die BONUS-AUFGABE)
//        - Integer
//        - Integer.toBinaryString()
//
//        Beispiel: "Hallo Welt!" wird zu
//        01001000 01100001 01101100 01101100 01101111 00100000 01010111 01100101 01101100 01110100 00100001
//        01001000 01100001 01101100 01101100 01101111 00100000 01010111 01100101 01101100 01110100 00100001


import java.util.Scanner;

public class Aufgabe4 {

    private static String textToBinary(String text) {
        //einführung StringBuilder
        StringBuilder binaryString = new StringBuilder();

        int counter = 0;
        // einfe for schleife für jedes zeichen innerhalb des Arrays
        for (char c : text.toCharArray()){
            // Speichere jeden buchstaben/Zeichen im String als Binärzahl ab mit hilfe von String.format
            // und der funktion Integer.toBinaryString wird für c jeweils ein int in binär zahl erstellt
            // und durch %8s wird drauf geachtet das er 8bit lang ist diese werden mit leerstellen angepasst
            // mit .replace ersetzen wird die Leerzeichen durch 0
            String binaryZeichen =  String.format("%8s", Integer.toBinaryString((int) c)).replace(" ", "0");
            // in binaryString wird mit jedem durchlauf der binaryString um eine 8bit Binary erweitert
            binaryString.append(binaryZeichen);
            //hier wird nach jedem 9bit Binary erweiterung ein leerzeichen angestellt
            binaryString.append(" ");
            //mit Hilfe eines Counter sagen wir nach jedem 4ten zeichen soll ein zeilenumbruch in den String
            //eingefügt werden und der counter wieder auf 0 gesetzt werden.
            counter++;
            if (counter == 4){
                binaryString.append("\n");
                counter = 0;
            }

        }
    return binaryString.toString();
    }

    public static void main(String[] args) {
        //Einführung eines Scanners
        Scanner sc = new Scanner(System.in);

        //User eingabe
        System.out.println("Bitte gebn Sie einen Text ein: ");
        String text = sc.nextLine();

        //Die Codierung soll den Text als BinärCode erzeugen Verwendet dafür eine eigene Methode
        String binaryText = textToBinary(text);

        //Ausgabe des Binärcodes
        System.out.println("Der Binärcode deines Textes lautet: \n" + binaryText);




    }

}
