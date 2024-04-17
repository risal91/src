package Day14.aufgaben.Aufgabe1;

public class Drache extends Kreatur {

    public Drache(String Name) {
        super(Name);
    }

    @Override
    public void angreifen() {
        System.out.println(getName() + " spuckt Feuer!");

    }
}
