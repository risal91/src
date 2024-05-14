package Day12.Aufgabe1Kompositionen;/*
    Führen Sie bitte die beiden folgenden Klassen ein:

        Klasse Kuchenstück
            Member:
                1 privater Integer gewicht
                1 Konstruktor:
                    Übergabewert: 1 Integer gewicht
                    Funktion: Weist dem Feld den Wert des Parameters zu

        Klasse Kuchen
            Member:
                private statische Liste vom Typen Kuchen
                private Liste aller Kuchenstücke
                private Methode
                    Name: gesamtGewicht
                    Übergabewerte: keine
                    Funktion: Ermittelt das Gesamtgewicht aller Kuchenstücke
                    Rückgabewert: Gesamtgewicht
                öffentliche statische Methode
                    Name: zeigeAlleKuchen
                    Übergabewerte: keine
                    Funktion: Gibt für alle Kuchen der Kuchenliste ...
                              - alle Stücke des Kuchens
                              - das Gewicht jedes seiner Kuchenstücke
                              - und das Gesamtgewicht des Kuchens
                              ... auf der Konsole aus
                Konstruktor:
                    Übergabewert: Integer-Liste
                    Funktion: (x = Anzahl der Elemente der Integer-Liste)
                              FALLS x > 0
                                    Kuchen wird zur Kuchenliste hinzugefügt
                                    Es werden x Kuchenstücke instanziiert
                                    Es werden die x Integerwerte der Reihe nach jedem Kuchenstück als Gewicht zugeordnet
			            Jedes Kuchenstück wird der Kuchenstückliste seines Kuchens hinzugefügt
                              SONST
                                    Der soeben instanziierte Kuchen wird der Kuchen-Liste NICHT zugeordnet
                                    (mit entsprechender Fehlermeldung)

    Im Main
       Zunächst wird ein Kuchen mit 0 Kuchenstücken instanziiert.
       Anschließend werden 3 weitere Kuchen mit jeweils 3, 4 und 5 Kuchenstücken instanziiert.
       Zum Schluss wird die Methode ZeigeAlleKuchen() aufgerufen.
*/
