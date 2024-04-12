package Day3;

/*
 * Aufgabe 0
 * If-Anweisung und Funktionen
 * Sie bauen einen Roboter. In diesen ist eine Batterie eingebaut.
 * Erzeugen Sie eine Integer-Variable "batterieLaufzeit" mit dem Wert 5.
 * Anschließend implementieren Sie eine Methode "istBatterieLaufzeitNiedrig"
 * Diese Methode soll true zurückgeben, wenn die Laufzeit kleiner 2 ist, sonst false.
 *
 * Erstellen Sie eine String-Variable "aufgabe" und weisen Sie ihr "Ich reiche Butter." zu.
 * Implementieren Sie eine Methode "führeAufgabeAus", die auf dem Bildschirm die Variable "aufgabe" ausgibt,
 * wenn "istBatterieLaufzeitNiedrig" false liefert und dann die Batterie Laufzeit um 1 reduziert,
 * sonst soll "Ich muss aufgeladen werden" in der Konsole erscheinen.
 *
 * Lassen Sie in der Main den Roboter fünfmal die Aufgabe ausführen.
 */

public class Aufgabe0 {

    public static boolean istBatterieLaufzeitNiedrig(int batterie){
        boolean akkuLeer = false;
        if(batterie <= 2){
            akkuLeer = true;
        }
        return akkuLeer;

    }

    public static void führeAufgabeAus (String aufgabe){
        System.out.println(aufgabe);

    }

    public static void main(String[] args) {
        int batterieLaufzeit = 5;
        String aufgabe = "Ich reiche Butter.";
        boolean aktiv = istBatterieLaufzeitNiedrig(batterieLaufzeit);

    for (int i = 0; i < 5 ; i++){

        if (aktiv == false){
            führeAufgabeAus(aufgabe);
            batterieLaufzeit--;
            aktiv = istBatterieLaufzeitNiedrig(batterieLaufzeit);
        }else {
            System.out.println("Ich muss aufgeladen werden");
        }
    }


    }
}
