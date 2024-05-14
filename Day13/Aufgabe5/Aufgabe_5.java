package Day13.Aufgabe5;/* Schreiben Sie ein Programm, das
 * - die Klassen Computer, Desktop, Notebook und Server einführt.
 * - Jeder Computer hat einen Zustand (Ein/Aus)
 * - Einen Hersteller, der nur ein mal über den Konstruktor gesetzt werden darf
 * - Eine Statische Liste, die die aktuelle Instanz speichert
 * (die Klasse Computer besitzt eine Liste vom Typ Computer, in die im Konstruktor das Objekt hinzugefügt wird)
 * - Und eine Methode zum Ein- und Ausschalten (Eine Methode, die beides erledigt)
 * (Diese Methode gibt den Typ des Computers und den neuen Zustand aus, siehe Screenshot)
 * (Versuchen Sie diese Ausgabe abhängig vom Zustand in nur einer Zeile zu implementieren)
 * - Überlegen Sie sich eine geeignete Vererbungsstruktur.
 * - Verwenden Sie in den Subklassen die Konstruktor-Verkettung zur Initialisierung des Herstellers in der Basisklasse
 * - Geben Sie im Main für jeden Computer in der Liste den Hersteller aus und rufen Sie die Methode zum Ein- und Ausschalten auf
 * (Siehe Screenshot)
 *
 * Beachten Sie, dass der Zustand nur über die Methode zum Ein- und Ausschalten geändert werden darf!
 *
 * Erweitern Sie anschließend das Programm durch die Klasse Büro
 * - Jedes Büro hat eine Nummer, die nur ein mal durch den Konstruktor gesetzt werden darf
 * - eine Liste mit den sich im Büro befindenden Computern
 * - und eine Statische Liste mit allen Büros
 * - Erweitern Sie die Main so, dass nun anstatt der Computerliste die Büroliste durchlaufen wird
 * (erzeugen Sie dazu zwei Büros mit je zwei Computern)
 * - und rufen Sie für jedes Büro die Nummer und für jeden Computer in jedem Büro den Hersteller und die Methode zum Ein- und Ausschalten auf
 */
