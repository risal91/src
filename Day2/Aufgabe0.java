package Day2;

/*
 * Schreiben Sie ein Java-Programm das kontrolliert, ob eine Zahl gerade oder ungerade ist und dann einen String ausgibt der sagt "Die Zahl ist ungerade" oder
 * "Die Zahl ist gerade".
 * Hinweis: Zur Vergleichsberechnung bietet sich der Modulo-Operator % an.
 */

public class Aufgabe0 {

    public static void main(String[] args) {
        int zahl = 69;

        if (zahl % 2 == 0){
            System.out.println("Die Zahl ist gerade!");
        }else {
            System.out.println("Die Zahl ist ungerade!");
        }
    }
}
