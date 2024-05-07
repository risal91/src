package Day14.aufgaben.Aufgabe2;

/*
    Führen Sie bitte zunächst eine abstrakte Klasse 'GeräuscheMacher' ein.
    Diese besitzt nur eine abstrakte Methode 'macheGeräusch' (keine Über-, oder Rückgabewerte).
    Implementieren Sie bitte zusätzlich die Klassen Auto, Hund und Mensch, die von GeräuscheMacher erben.
        Keine dieser Klassen enthält weitere Member.
        Konsolenausgabe von macheGeräusch in Auto:   "Brummmmmm ..."
        Konsolenausgabe von macheGeräusch in Hund:   "Wau Wau Kläff Grrrrr ..."
        Konsolenausgabe von macheGeräusch in Mensch: "Java lernen ist toll!"

    Führen Sie eine Liste vom Typ GeräuscheMacher der Main()-Methode hinzu.
    Erstellen Sie von allen drei Subklassen ein Objekt und fügen diese der Liste hinzu.
    Rufen Sie bitte mittels einer foreach-Schleife, für alle Elemente der Liste, die Methode macheGeräusch auf.
*/


import java.util.ArrayList;
import java.util.List;

public class Aufgabe_2 {
    public static void main(String[] args) {
        List<GeräuscheMacher> geräuscheMacherList = new ArrayList<>();

        geräuscheMacherList.add(new Auto());
        geräuscheMacherList.add(new Hund());
        geräuscheMacherList.add(new Mensch());

        for (GeräuscheMacher geräuscheMacher : geräuscheMacherList){
            geräuscheMacher.macheGeräusch();
        }
    }

}
