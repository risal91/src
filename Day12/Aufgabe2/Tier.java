package Day12.Aufgabe2;

import java.util.ArrayList;
import java.util.List;

public class Tier {
    public static List<Tier> alleTiere = new ArrayList<>();
    private int id;
    private String namen;
    private Tierart art;

    public Tier(int id, String namen, Tierart art) {
        this.id = id;
        this.namen = namen;
        this.art = art;
        alleTiere.add(this);
    }

    public static List<Tier> getAlleTiere() {
        return alleTiere;
    }

    public int getId() {
        return id;
    }

    public String getNamen() {
        return namen;
    }

    public Tierart getArt() {
        return art;
    }
}
