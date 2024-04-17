package Day15.Aufgabe1;

public class Boot extends Fahrzeug implements ISchwimmfähig {
    @Override
    public void zeigeDetails() {
        System.out.println("\n\nIch bin ein Boot.");
    }

    @Override
    public void schwimmen() {
        System.out.println("Ich schwimme auf dem Wasser.");

    }
}
