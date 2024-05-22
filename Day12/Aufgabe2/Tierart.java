package Day12.Aufgabe2;

import java.util.ArrayList;
import java.util.List;

public class Tierart {
    public static List<Tierart> alleTierarten = new ArrayList<>();
    private String bezeichnung;
    private double futtermenge;

    public Tierart(String bezeichnung, double futtermenge){
        this.bezeichnung = bezeichnung;
        this.futtermenge =  futtermenge;
        alleTierarten.add(this);
    }

    public static List<Tierart> getAlleTierarten() {
        return alleTierarten;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public double getFuttermenge() {
        return futtermenge;
    }
}
