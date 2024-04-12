package Day1;

/*
Erstellen Sie eine Variable 'alter' mit dem Wert 10.
Daraufhin wird die String-Variable 'alterString' mit "jung" gefüllt und ausgegeben.

Danach wird 'alter' der Wert 80 zugewiesen und die 'alterString' mit "alt" gefüllt und ausgegeben.
 */

public class Aufgabe2 {
    public static void main(String[] args) {
        int alter = 10;
        String alterString = "Jung";

        System.out.println("alterString ist = "+ alterString);

        alter = 80;
        alterString = "alt";

        System.out.println("alterString ist = "+ alterString);

    }
}
