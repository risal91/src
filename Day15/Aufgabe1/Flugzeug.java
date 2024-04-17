package Day15.Aufgabe1;


public class Flugzeug extends Fahrzeug implements IFlugfähig, IFahrbar {

    @Override
    public void zeigeDetails(){
        System.out.println("\n\nIch bin ein Flugzeug: ");
    }

    @Override
    public void fahren() {
        System.out.println("Ich rolle über das Rollfeld.");
    }

    @Override
    public void fliegen() {
        System.out.println("Ich Fliege durch die Luft!");
    }

}
