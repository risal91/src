package Day12.Aufgabe6;/*
    Führen Sie bitte zunächst die drei folgenden Klassen ein:

        a) Klasse Land
            Member:
                Länderliste (statisch, öffentlich) [Liste aller instanziierten Objekte vom Typ Land]
                Firmenliste (privat) [Liste aller Firmen, die im jeweiligen Land vertreten sind]
                Name des Landes (privat)
                Methode:
                    Name: zeigeAlleFirmen
                    Übergabewerte: keine
                    Funktion: - Ausgabe der Überschrift: "Alle Firmen in" + Ländername
                              - Alle Namen der Firmen aus Firmenliste
                    Rückgabewert: keiner
                Konstruktor:
                    Übergabewert: Name des Landes
                    Funktion: - Füllt das private Feld (Name des Landes)
                              - Fügt das Land zur Länderliste

        b) Klasse Firma
            Member:
                Firmaliste (statisch, öffentlich) [Liste aller instanziierten Objekte vom Typ Firma]
                Länderliste (privat) [Liste aller Länder, in denen die Firma vertreten ist]
                Mitarbeiterliste (privat) [Liste aller Mitarbeiter, die in der Firma arbeiten]
                Name der Firma (privat)
                2 Methoden:
                    1.) Name: zeigeAlleLänder
                    Übergabewerte: keine
                    Funktion: - Ausgabe der Überschrift: Alle Länder in denen " + Name der Firma + " vertreten ist:"
                              - Alle Namen der Länder aus Länderliste
                    Rückgabewert: keiner
                    2.) Name: zeigeAlleMitarbeiter
                    Übergabewerte: keine
                    Funktion: - Ausgabe der Überschrift: Alle Mitarbeiter die in" + Name der Firma + " arbeiten:"
                              - Alle Namen der Mitarbeiter aus Mitarbeiterliste
                    Rückgabewert: keiner
                Konstruktor:
                    Übergabewert: Name der Firma
                    Funktion: - Füllt das private Feld (Name der Firma)
                              - Fügt die Firma zur Firmenliste

        c) Klasse Mitarbeiter
            Member:
                Mitarbeiterliste (statisch, öffentlich) [Liste aller instanziierten Objekte vom Typ Mitarbeiter]
                Name des Mitarbeiters (privat)
                Firma (privat) [in der Mitarbeiter arbeitet]
                Konstruktor:
                    Übergabewert: Name des Mitarbeiters, Firma
                    Funktion: - Füllt das private Feld (Name des Mitarbeiters)
                              - Fügt den Mitarbeiter zur Mitarbeiterliste

     Im Main
        a) Instanziierung:
            Firmen: Microsoft, Apple, Volkswagen und Porsche
            Länder: Deutschland, USA, Dänemark
            Mitarbeiter:
            Mike, Marcy,
            Andrew, Amy,
            Volker, Verena,
            Paul und Petra
        b) Listen auffüllen:
            Microsoft und Volkswagen sind in allen drei Ländern vertreten.
            Apple und Porsche nur in Deutschland und USA.
            Jeder Mitarbeiter arbeitet in einer Firma, bei denen die Anfangsbuchstaben übereinstimmen.
        c) Navigierbarkeit (als Ergebnis der Klassenmember): Land<->Firma und Firma<->Mitarbeiter (alle Assoziationen sind bidirektional)

        Kontrollausgabe:
            1) Alle Firmen pro Land
            2) Alle Länder pro Firma
            3) Alle Mitarbeiter pro Firma
            4) Firma jedes Mitarbeiters

*/
