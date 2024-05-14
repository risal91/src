package Day12.Aufgabe5;/*
    Führen Sie bitte zunächst die folgenden Klassen ein:
        Tier
            Attribute: art und name
        Futter
            Attribute: bezeichnung und kalorien
        Fütterung
            Attribute: static-Liste vom Typ Fütterung, in der alle Fütterungen gespeichert werden
            mengeInKg, tier und futter

    Führen Sie bitte die folgenden Objekte ein: (Attributwerte, die im folgenden nicht mitgeteilt werden, können von Ihnen frei gewählt werden)
        Tier
            Blacky
            Lassie
        Futter
            Trockenfutter
            Heu
            Fleisch

     Es gelten die folgenden Assoziationen:
        Trockenfutter darf an Blacky (Pferd) und Lassie (Hund) verfüttert werden
        Heu nur an das Pferd
        Fleisch nur an den Hund

    Für die Klasse Fütterung wird ferner verlangt:
        In Fütterung ist ein Konstruktor implementiert, für den gilt:
        1) alle Attributwerte werden durch die Übergabewerte des Konstruktors gefüllt
        2) die Fütterungsliste wird durch das neue (also gerade vom Konstruktor erzeugte) Objekt ergänzt [Listenname.Add(this)]

    Lassen Sie bitte anschließend im Main (mindestens) die beiden folgenden Kontrollausgaben ausführen:
        a) Alle Futtersorten von Blacky
        b) Alle Tiere an die Trockenfutter verfüttert wurde/wird
*/
