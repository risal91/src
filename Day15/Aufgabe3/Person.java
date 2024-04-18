package Day15.Aufgabe3;
//Klasse Person, die nun das Interface IAdresse implementiert und über den Konstruktor
//Public Person(Sting name ....) verfügt
public class Person implements IAdresse {
    private String name;
    private Adresse anschrift;

    //Konstruktor
    public Person(String name, String strasse, String hausnr, int plz, String ort){
        this.name = name;
        Adressverwaltung.erfasse(this, name, strasse, hausnr, plz,ort);
    }
    //Getter und Setter Methoden für Name und Anschrift
    @Override
    public String getName(){
        return name;
    }
    @Override
    public void setName(String name){
        this.name = name;
    }
    @Override
    public Adresse getAnschrift(){
        return anschrift;
    }
    @Override
    public void setAnschrift(Adresse anschrift){
        this.anschrift = anschrift;
    }

    //Implementierung der printEtikett-Methode aus dem Interface
    @Override
    public void printEtikett(){
        Adressverwaltung.printEtikett(this);
    }
}
