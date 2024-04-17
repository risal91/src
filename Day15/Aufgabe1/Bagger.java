package Day15.Aufgabe1;

public class Bagger extends Fahrzeug implements IFahrbar, ISchwimmfähig {
    @Override
    public void zeigeDetails() {
        System.out.println("\n\nIch bin ein Geiler Bagger. ");
    }

    @Override
    public void fahren() {
        System.out.println("Ich Ratter über Berg und Tal. ");

    }

    @Override
    public void schwimmen() {
        System.out.println("Ich habe auch die möglichkeit im Wasser zu Schwimmen laut Chris.");

    }
}
