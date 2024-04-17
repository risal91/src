package Day14.aufgaben.Augabe3;

import java.util.ArrayList;
import java.util.List;

abstract class Ware {
    private String bezeichung;
    private double preis;
    public static List<Ware> warenListe = new ArrayList<>();

    public Ware(String bezeichung, double preis) {
        this.bezeichung = bezeichung;
        this.preis = preis;
        warenListe.add(this);
    }

    public String getBezeichung() {
        return bezeichung;
    }

    public double getPreis() {
        return preis;
    }

}
