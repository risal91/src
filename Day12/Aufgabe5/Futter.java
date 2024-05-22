package Day12.Aufgabe5;

public class Futter {
    String bezeichnung;
    int kalorien;

    public Futter(String bezeichnung, int kalorien) {
        this.bezeichnung = bezeichnung;
        this.kalorien = kalorien;
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public int getKalorien() {
        return kalorien;
    }
}
