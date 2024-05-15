package Day11.Aufgabe3;

import java.util.ArrayList;
import java.util.List;

public class Fahrzeug {
    private String kennzeichen;
    private String lackierung;
    private String marke;
    private FahrzeugTyp fahrzeugTyp;

    public static final List<Fahrzeug> fahrzeugliste = new ArrayList<>();

    public Fahrzeug(String kennzeichen, String lackierung, String marke, FahrzeugTyp fahrzeugTyp) {
        this.kennzeichen = kennzeichen;
        this.lackierung = lackierung;
        this.marke = marke;
        this.fahrzeugTyp = fahrzeugTyp;
        fahrzeugliste.add(this);
    }

    public String getKennzeichen() {
        return kennzeichen;
    }

    public String getLackierung() {
        return lackierung;
    }

    public String getMarke() {
        return marke;
    }

    public FahrzeugTyp getFahrzeugTyp() {
        return fahrzeugTyp;
    }

    public void setKennzeichen(String kennzeichen) {
        this.kennzeichen = kennzeichen;
    }

    public void setLackierung(String lackierung) {
        this.lackierung = lackierung;
    }

    public static List<Fahrzeug> getFahrzeugliste() {
        return fahrzeugliste;
    }

    public static void gibListe(){
        for (Fahrzeug fahrzeug : fahrzeugliste){
            System.out.println(fahrzeug);
        }
    }

    @Override
    public String toString() {
        return "Fahrzeug:\n" +
                "kennzeichen= " + kennzeichen + '\n' +
                "lackierung= " + lackierung + '\n' +
                "marke= " + marke + '\n' +
                "fahrzeugTyp= " + fahrzeugTyp +
                "\n_________________"+"\n";
    }
}
