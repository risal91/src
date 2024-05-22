package Day12.Aufgabe4;

import java.util.ArrayList;
import java.util.List;

public class Ritter {
    String name;
    Pferd seinPferd;
    static List<Ritter> ritterListe = new ArrayList<>();

    public Ritter(){
        seinPferd = new Pferd();
        seinPferd.besitzer = this;
        ritterListe.add(this);
    }

    public Ritter( String name, String pferdName){
        this();
        this.name = name;
        seinPferd.name = pferdName;
    }

    public String getName() {
        return name;
    }

    public Pferd getSeinPferd() {
        return seinPferd;
    }

    public static List<Ritter> getRitterListe() {
        return ritterListe;
    }
}
