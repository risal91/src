package Day2;

/*
Aufgabe 3
Schreiben Sie bitte ein Java-Programm, das
a) eine Integer-Variable i einführt (deren Wert sie selbst bestimmen können)
b) eine Float-Variable f einführt (deren Wert sie selbst bestimmen können)
c) eine Char-Variable c einführt (deren Wert sie selbst bestimmen können)
d) einen String s einführt, der durch eine for-Schleife wie folgt initialisiert werden soll:
	- die Schleife soll i-mal durchlaufen werden
	- bei jedem Durchlauf soll s um c und f verlängert werden
e) eine for-Schleife startet, die 3-mal durchlaufen wird und pro Durchlauf s (mit Umbruch) ausgibt


Beispiel
i=5, f=1.1, c=x, dann ergibt sich die folgende Ausgabe:
x1.1x1.1x1.1x1.1x1.1
x1.1x1.1x1.1x1.1x1.1
x1.1x1.1x1.1x1.1x1.1
*/

public class Aufgabe3 {

    public static void main(String[] args) {
        int i = 5;
        float f = 5.5f;
        char c = 'x';
        String s = "";

        for (;i > 0; i--){
            s +=  c + Float.toString(f); // Alternativ String.valueOf(f);
        }

        for(int k = 0; k < 3; k++){
            System.out.println(s);
        }
    }
}
