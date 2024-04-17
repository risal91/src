package Day15.Aufgabe1;

public class Auto extends Fahrzeug implements IFahrbar {
    @Override
    public void zeigeDetails() {
        System.out.println("\n\nIch bin ein Auto; ");

    }

    @Override
    public void fahren() {
        System.out.println("Ich fahre auf der Straße. ");

    }
}
