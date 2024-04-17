package Day14.aufgaben.Augabe3;

public class Getränk extends Ware {
    private double Füllmenge;

    public Getränk(String bezeichung, double preis, double Füllmenge) {
        super(bezeichung, preis);
        this.Füllmenge = Füllmenge;
    }

    @Override
    public String toString() {
        String ausgabe = "Getränk: "
                +getBezeichung() + "\nFüllmenge: "
                + Füllmenge + "ml" + "\nPreis: "
                +getPreis()+"€" +"\n\n";

        return ausgabe;
    }
}
