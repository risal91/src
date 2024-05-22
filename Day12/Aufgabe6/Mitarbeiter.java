package Day12.Aufgabe6;

import java.util.ArrayList;
import java.util.List;

public class Mitarbeiter {
    public static List<Mitarbeiter> mitarbeiterListe =new ArrayList<>();
    private String mitarbeiterName;
    private Firma firma;

    public Mitarbeiter(String mitarbeiterName, Firma firma) {
        this.mitarbeiterName = mitarbeiterName;
        this.firma = firma;
        mitarbeiterListe.add(this);
        firma.addMitarbeiter(this);
    }

    public String getMitarbeiterName() {
        return mitarbeiterName;
    }

    public Firma getFirma() {
        return firma;
    }

    public void zeigeAlleMitarbeiter(){
        System.out.println("\nMitarbeiter :" );
            System.out.println(getMitarbeiterName() + " arbeitet bei " + getFirma().getFirmaName());
    }
}
