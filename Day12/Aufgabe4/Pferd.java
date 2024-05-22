package Day12.Aufgabe4;

import java.util.ArrayList;
import java.util.List;

public class Pferd {
    String name;
    Ritter besitzer;
    static List<Pferd> pferdeListe = new ArrayList<>();

    public Pferd() {
        pferdeListe.add(this);
    }

    public String getNamen() {
        return name;
    }

    public Ritter getBesitzer() {
        return besitzer;
    }
}
