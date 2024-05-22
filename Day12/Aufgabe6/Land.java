package Day12.Aufgabe6;

import java.util.ArrayList;
import java.util.List;

public class Land {
    public static List<Land> laenderListe = new ArrayList<>();
    private List<Firma> firmenListe = new ArrayList<>();
    private String landName;

    public Land( String landName) {
        this.landName = landName;
        laenderListe.add(this);
    }
    public void zeigeAlleFirmen(){
        System.out.println("\nAlle Firmen in " +landName + ":" );
        for (Firma firma : Firma.firmenListe){
            System.out.println(". "+ firma.getFirmaName());
        }
    }
    public void addFirma(Firma firma){
        firmenListe.add(firma);
    }

    public String getLandName() {
        return landName;
    }
}
