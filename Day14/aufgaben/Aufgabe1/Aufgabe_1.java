package Day14.aufgaben.Aufgabe1;

/* Erstellen Sie die abstrakte Klasse "Kreatur" mit einem privaten Attribut "name", einer abstrakten Methode "angreifen" und einem Konstruktor, der name initialisiert.
 * Erstellen Sie zwei weitere Klassen "Ritter" und "Drache", die beide von "Kreatur" erben.
 * Die beiden Subklassen implementieren die Methode der Basisklasse.
 * Der Ritter nutzt sein Schwert, der Drache spuckt Feuer.
 * In Main() erzeugen Sie je ein Objekt von Ritter und Drache.
 * Rufen Sie in der Main-Methode() für beide Objekte die überschriebene angreifen()-Methode auf.
 */


public class Aufgabe_1 {

    public static void main(String[] args) {
        Kreatur ritter1 = new Ritter("Lancelot");
        Kreatur drache1 = new Drache("Fafnir");

        ritter1.angreifen();
        drache1.angreifen();
    }
}
