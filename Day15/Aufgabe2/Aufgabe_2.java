package Day15.Aufgabe2;/*
 *  Interface TankfüllstandBeobachter mit void-Methode onTankfüllstandNiedrig, welche als Parameter ein PKW erhält.

 *  Klasse TankfüllstandLeuchte mit der Farbe der Leuchte als Attribut, dem passenden Getter und Setter und einem Konstruktor. (alternativ mit Enum lösen)

 *  Klasse PKW
 *      mit einer TankfüllstandLeuchte, die auf "Rot" gesetzt wird,
 *      einem öffentlichen Attribut vom Typ TankfüllstandBeobachter,
 *      einem privaten tankfüllstand und einer öffentlichen addTankfüllstand-Methode,
 *          die den Tankfüllstand erhöhen kann und, wenn der Tankfüllstand größer gleich 15 ist, die Farbe der Leuchte auf Grün setzt.
 *      einen Konstruktor, der den Tankfüllstand initialisiert,
 *      eine void-Methode fahren(), die in einer Schleife "Brumm..." ausgibt und den Tankfüllstand um 1 reduziert, solange der Tankfüllstand größer 0 ist
 *          und weiterhin, wenn der Tankfüllstand kleiner 15 ist, die Leuchte auf Gelb stellt und für das TankfüllstandBeobachter-Objekt die Methode onTankfüllstandNiedrig aufruft,
 *          und wenn der Tankfüllstand kleiner 10 ist, die Leuchte auf Rot stellt und für das TankfüllstandBeobachter-Objekt die Methode onTankfüllstandNiedrig aufruft.

 *  Klasse Fahrer, implementiert das Interface,
 *      mit einer Methode tanken, die den Tankfüllstand eines übergebenen PKW-Objektes erhöhen kann.
 *      Die implementierte Interface-Methode fragt aus dem übergebenen PKW die Farbe der TankfüllstandLeuchte ab
 *          und ist sie Gelb, sagt der Fahrer "Ach, hat noch Zeit...",
 *          ist sie Rot, sagt der Fahrer "Jetzt aber dringend tanken..." und tankt anschließend den PKW.
 *
 *
 *  In der Main-Methode:
 *      Einen PKW und einen Fahrer erstellen, den Fahrer als TankfüllstandBeobachter eintragen und den PKW fahren lassen.
 *
 */
