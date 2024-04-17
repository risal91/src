package Day14.aufgaben.Augabe3;

abstract class Ware {
    private String bezeichung;
    private double preis;

    public Ware(String bezeichung, double preis) {
        this.bezeichung = bezeichung;
        this.preis = preis;
    }

    public String getBezeichung() {
        return bezeichung;
    }

    public void setBezeichung(String bezeichung) {
        this.bezeichung = bezeichung;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    @Override
    public abstract String toString();
}
