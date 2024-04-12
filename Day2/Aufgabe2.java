package Day2;

/*
Aufgabe 2
Schreiben Sie bitte ein Java-Programm, das
a) eine Integer-Variable g einführt, die für alle Funktionen in der Klasse gültig ist
b) eine Integer-Variable l einführt, die nur im Main gültig ist
c) eine Methode besitzt, die im Main aufgerufen werden kann und g-mal "Hallo" auf der Konsole ausgibt
d) im Main l-mal "Welt" auf der Konsole ausgibt
e) zur Kontrolle im Main die beiden Werte g und l auf der Konsole ausgibt


Hinweis:
Das Erlernen von ANSI C war nicht sinnlos ;-) ...
... for-Schleifen sehen bei Java genauso aus wie bei C
*/

public class Aufgabe2 {

    static int g = 42;

    public static void wurstwasser(int g){

        for (int i = 0; i < g; i++){
            System.out.println("Hallo");
        }

    }
    public static void main(String[] args) {
    int l = 69;

        wurstwasser(g);

        for (int i = 0; i < l; i++){
            System.out.println("Welt");
        }

        System.out.println("Wir hatten " + g + " mal Hallo und " + l + " mal Welt");
    }
}
