package Day15.Aufgabe3;

//Erstellen Sie die Klasse "Adressverwaltung" mit den Static Methoden "printEtikett(IAdresse obj)""
// * und "erfasse(IAdresse obj, String name, String straße, int hausnr, String plz, String ort)""
// * (Die Klasse Adressverwaltung wird das Interface nicht implementieren, aber wir werden die Klasse verwenden,
// * um Adressen auszugeben und zu erfassen)

public class Adressverwaltung {
    //Static Methoden "printEtikett(IAdresse obj)
    public static void printEtikett(IAdresse obj){
        System.out.println("Name: " + obj.getName());
        System.out.println("Anschrift:");
        System.out.println("  Straße: " + obj.getAnschrift().getStrasse());
        System.out.println("  Hausnummer: " + obj.getAnschrift().getHausnr());
        System.out.println("  PLZ: " + obj.getAnschrift().getPlz());
        System.out.println("  Ort: " + obj.getAnschrift().getOrt());
    }

    //Methode "erfasse" soll dem übergebenen IAdresse-Objekt die neuen Werte zuweisen
    public static void erfasse(IAdresse obj,String name,String strasse, String hausnr, int plz, String ort){
        obj.setName(name);
        Adresse anschrift = new Adresse(strasse, hausnr, plz, ort);
        obj.setAnschrift(anschrift);
    }


}
