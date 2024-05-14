package Day13.Aufgabe7;/*

Führen Sie bitte die beiden folgenden Klassen ein:

Klasse Stadt
    Attribute: einwohnerzahl, name (alle private)
    Methoden: Get und Set für einwohnerzahl, Get für Name, istGroßstadt[String](Rückgabe: "Stimmt!", FALLS einwohnerzahl >= 100000, SONST "Nein!")
    Konstruktor:
        Übergabewerte: int e, String n
        Funktion:      setzt:
                       - einwohnerzahl=e
                       - name=n



Klasse Landeshauptstadt (SUBKLASSE von Stadt!)
    Attribute: adresse (des Landtages)
    Getter und Setter für adresse
    Konstruktor:
        Übergabewerte: String a UND die Attribute des Basis-Klassen-Konstruktors
        Funktion:      setzt adresse=a UND übergibt die entsprechenden Attribute an den Basis-Klassen-Konstruktor


Testen Sie bitte die obigen Definitionen an folgendem Programm im Main:
- Instanziierung der Städte Dinslaken(70000) und Wuppertal(350000)
- Instanziierung der Landeshauptstadt Düsseldorf(620000 / Platz des Landtags 1, 40221 Düsseldorf)
- Für alle drei Städte: Ausgabe von Name und Eigenschaft(Großstadt "Stimmt!" oder "Nein!")
- Für die Landeshauptstadt: Ausgabe der Adresse (des Landtages)
*/


