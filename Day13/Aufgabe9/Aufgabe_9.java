package Day13.Aufgabe9;/*
 * Sie betreiben eine altmodische Videothek und möchten ein Programm zur Verwaltung der Videos schreiben.
 * In Ihrem Klassenentwurf entscheiden Sie sich für drei Klassen.
 * Ausleihe - Dort wird abgespeichert, welches Video von welchem Kunden an welchem Datum ausgeliehen und wann das Video zurückgebracht wurde.
 * Video - Sie werden erstmal nur mit Titel gespeichert, weitere Informationen werden in dieser Phase des Projektes nicht benötigt.
 * Kunde - Werden zu diesem Zeitpunkt auch nur mit Name gespeichert.
 * Um alle Kunden, Videos und Ausleih-Vorgänge zu speichern, bekommt jede Klasse eine statische Liste, die ihre eigenen Objekt-Referenzen beinhalten.
 * Um ein Video ausleihen und zurückbringen zu können, implementieren Sie entsprechende Methoden in die Klasse Ausleihe. Dabei beachten Sie, dass jedes Video nur ein mal zu einem bestimmten Zeitpunkt ausgeliehen sein kann, denn jedes Video existiert physisch nur ein mal in Ihrem Bestand. Wird versucht, einen ungültigen Vorgang durchzuführen, wirft die Methode eine Exception.
 * Erstellen Sie dafür eine eigene Exception-Klasse, die von Exception erbt.
 * Um die Informationen zu der Ausleihe bequem ausgeben zu können, überschreiben Sie die toString-Methoden.
 * Sie beachten bei der Entwicklung die Abkapselung und Trennung von Darstellung und Programmlogik.
 * In der Main testen Sie alle Funktionalitäten.
 *
 * Zeichen Sie dazu ein UML Klassendiagramm.
 */
