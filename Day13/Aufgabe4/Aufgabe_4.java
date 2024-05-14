package Day13.Aufgabe4;/* Drei Klassen: Held, Ritter und Magier.
 * Alle Helden haben einen Namen und sind einem Volk zugeordnet (Attribute)
 * Die Völker (Zwerg, Elf, Mensch) sind als Enum-Konstanten verfügbar.
 * Alle Helden werden in einer Liste (statisches Attribut der Klasse 'Held') abgespeichert.
 * Helden unterteilen sich in Ritter und Magier.
 * Alle Ritter haben einen Stärke-Wert, alle Magier einen Wissen-Wert.
 * Jede Klasse verfügt über einen Konstruktor, welcher nur die eigenen Attribute initialisiert. Der Konstruktor der Held-Klasse fügt das Objekt der Held-Liste hinzu. Damit wird doppelter Code vermieden.
 * In der main Methode werden ein Ritter und ein Magier erzeugt und über eine foreach-Schleife werden alle Attribute der Helden, und ob es sich dabei um einen Ritter oder einen Magier handelt, ausgegeben.
 * Bemerkung: Alle Elemente der Held-Liste sind Helden. Stärke und Wissen haben aber jeweils Ritter und Magier. Wie können diese Werte abgefragt werden? Etwas in der Art haben wir im Unterricht besprochen.
 */
