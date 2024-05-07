package Day9.AufgabeZusatz1;

//Aufgabe: Erweiterung des Programmes Roboter
//
//        Entwickeln Sie ein Java-Programm, das das Ihnen bekannte
//        “Butter-reichende Roboter”-Programm überarbeitet.

//        Klasse: Aufgaben
//        Erstellen Sie eine Klasse namens “Aufgaben”,
//        die eine variable Anzahl von Aufgaben für den Roboter bereitstellen kann.
//        Diese Klasse sollte zwei private Attribute haben: String name und int kostenBatterie.
//        Der Zugriff auf diese Attribute sollte durch geeignete Methoden ermöglicht werden.

//        Klasse: Roboter
//        Erstellen Sie eine weitere Klasse namens “Roboter”.
//        Diese Klasse sollte ein privates Attribut int batterieLaufzeit haben.
//        Der schreibende Zugriff auf dieses Attribut sollte durch die Methode ladeRoboter() ermöglicht werden,
//        die den Roboter immer auf eine batterieLaufzeit von 100 auflädt und dann “Roboter wurde geladen” auf der Konsole ausgibt.
//        Der lesende Zugriff sollte ebenfalls durch eine geeignete Methode ermöglicht werden.
//        Die Ihnen bekannten Methoden istBatterieLaufzeitNiedrig() und fuehreAufgabeAus() sollten angepasst werden.
//        Die Methode istBatterieLaufzeitNiedrig() sollte nun einen Wahrheitswert zurückgeben,
//        wenn die batterieLaufzeit kleiner als 10 ist.
//        Die Methode fuehreAufgabeAus() sollte eine Aufgabe entgegennehmen und diese verarbeiten.
//        Wenn die batterieLaufzeit ausreichend ist, sollte sie die Aufgabe, die der Roboter ausführt,
//        und die verbleibende batterieLaufzeit ausgeben. Wenn die batterieLaufzeit nicht ausreicht,
//        sollte eine Meldung erscheinen, die den Benutzer auffordert, den Roboter bei Bedarf wieder aufzuladen.
//        Wenn die batterieLaufzeit unter 10 sinkt, sollte eine Warnung ausgegeben werden und der Benutzer aufgefordert werden,
//        den Roboter wieder aufzuladen.

//        Klasse: Programm
//        In der Main() Methode der Klasse Programm sollen Sie nun mehrere Aufgaben erstellen.
//        Verwenden Sie die schreibenden Methoden, um jeder Aufgabe einen Namen und Batteriekosten zuzuweisen.
//        Anschließend erstellen Sie einen Roboter und weisen ihm Aufgaben über die Methode fuehreAufgabeAus() zu.
//        Überprüfen Sie abschließend alle Funktionen und gewünschten Kriterien.
//
//
//        Ausgabe Beispiele:
//        Roboter geladen und führt Aufgaben aus:
//         ---------------------
//         Roboter wurde geladen
//         ---------------------
//
//         Der Roboter reicht Butter / BatterieLaufzeit beträgt jetzt 90%
//         Der Roboter geht Einkaufen / BatterieLaufzeit beträgt jetzt 40%
//         Der Roboter holt ein Getränk / BatterieLaufzeit beträgt jetzt 15%
//
//        Die Aufgabenkosten überschreiten die Batterielaufzeit:
//
//        Der Roboter holt ein Getränk / BatterieLaufzeit beträgt jetzt 15%
//        Kann Aufgabe nicht mehr ausführen!!! Batterie Laufzeit nur noch 15% / Roboter bei Bedarf laden!
//
//        Die Batterielaufzeit unterschreitet die Schwelle von 10:
//          Der Roboter holt ein Getränk / Batterie Laufzeit beträgt jetzt 15%
//          Der Roboter reicht Butter / Batterie Laufzeit beträgt jetzt 5%
//          Akkuzustand unter 10% Kritisch !!! Bitte aufladen.
//

public class AufgabeZusatz1 {

}
