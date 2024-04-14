import java.util.ArrayList;
import java.util.List;

public class Fach {
    private int id;
    private String bezeichnung;
    private List<Klausur> klausuren; // bidirektionale Beziehung zu Klausur

    public Fach(int id, String bezeichnung) {this.id = id; this.bezeichnung = bezeichnung; this.klausuren = new ArrayList<>();}
    public int getId() {return id;}
    public String getBezeichnung() {return bezeichnung;}
    public List<Klausur> getKlausuren() {return klausuren;}
    public void addKlausur(Klausur klausur) {
        klausur.setFach(this); // bidirektionale Verknüpfung herstellen
        klausuren.add(klausur); // Klausur zur Liste hinzufügen
    }


}
