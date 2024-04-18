package Day15.Aufgabe3;

import Day15.Aufgabe3.IAdresse;

public class Firma implements IAdresse {
    private String name;
    private Adresse anschrift;

    public Firma (String name, String strasse, String hausnr, int plz, String ort){
        this.name = name;
        Adressverwaltung.erfasse(this, name, strasse, hausnr, plz, ort);
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name =name;

    }

    @Override
    public Adresse getAnschrift() {
        return anschrift;
    }

    @Override
    public void setAnschrift(Adresse anschrift) {
        this.anschrift = anschrift;

    }

    @Override
    public void printEtikett() {
        Adressverwaltung.printEtikett(this);

    }
}
