package Day14.aufgaben.Augabe3;

import java.util.List;

public class Speise extends Ware{
    private List<String> zutaten;


    public Speise(String bezeichung, double preis, List<String> zutaten) {
        super(bezeichung, preis);
        this.zutaten = zutaten;
    }

    @Override
    public String toString() {
        String ausgabe = "Speise: " +getBezeichung() +
                "\nZutaten: " + zutaten + "\nPreis: "
                +getPreis()+"€" +"\n\n";

        return ausgabe;
    }
}
