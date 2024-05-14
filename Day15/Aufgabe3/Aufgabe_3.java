package Day15.Aufgabe3;/*
 *  - Erstellen Sie eine Klasse "Adresse" mit Straße, Hausnummer, PLZ und Ort
 *  - Erstellen Sie ein Interface "IAdresse" mit den Getter- und Setter-Methoden für Name und Anschrift (Anschrift ist vom Typ Adresse)
 *      und der Methode "printEtikett()"
 *  - Erstellen Sie die Klasse "Adressverwaltung" mit den Static Methoden "printEtikett(IAdresse obj)""
 *      und "erfasse(IAdresse obj, String name, String straße, int hausnr, String plz, String ort)""
 *      (Die Klasse Adressverwaltung wird das Interface nicht implementieren, aber wir werden die Klasse verwenden,
 *      um Adressen auszugeben und zu erfassen)
 *  - Die Methode "printEtikett" soll alle Informationen von IAdresse ausgeben (also Name und die Werte in Anschrift)
 *  - Die Methode "erfasse" soll dem übergebenen IAdresse-Objekt die neuen Werte zuweisen
 *  - Erstellen Sie eine Klasse "Person", die nun das Interface IAdresse implementiert und über den Konstruktor
 *      public Person(String name, String straße, int hausnr, String plz, String ort) verfügt
 *      Im Konstruktor sollen die Adress-Werte über die Adressverwaltung erfasst werden
 *  - In der Implementierung der printEtikett-Methode des Interfaces soll die printEtikett-Methode der Adressverwaltung
 *      aufgerufen werden
 *  - Testen Sie die Funktionalitäten in der Main-Methode, indem Sie dort eine Liste oder ein Array mit mehreren Personen anlegen und für jede
 *      Person die Etikett-Methode aufrufen.
 *  - Erweitern Sie das Programm durch Erstellen einer Klasse Firma, die ebenfalls IAdresse implementiert.
 *  - Fügen Sie zu Ihrer Liste im Main nun zusätzlich Objekte der Klasse Firma hinzu. Bewerkstelligen Sie dies ohne
 *      Generalisierung der Klassen.
 */
