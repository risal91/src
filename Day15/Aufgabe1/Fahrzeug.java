package Day15.Aufgabe1;

import java.util.ArrayList;
import java.util.List;

abstract class Fahrzeug {
    public static List<Fahrzeug> fahrzeugList = new ArrayList<>();

    public Fahrzeug(){
        fahrzeugList.add(this);
    }
    public abstract void zeigeDetails();
}
