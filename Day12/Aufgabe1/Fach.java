package Day12.Aufgabe1;

import java.util.ArrayList;
import java.util.List;

public class Fach {
    private int id;
    private final String bezeichnung;

    private List<Klausur> klausren = new ArrayList<>();

    public Fach(int id, String bezeichnung) {
        this.id = id;
        this.bezeichnung = bezeichnung;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }


    public void addKlausur(Klausur klausur){
            klausren.add(klausur);
            klausur.setFach(this);
    }

    public List<Klausur> getKlausren() {
        return klausren;
    }


}
