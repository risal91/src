package Day14.aufgaben.Aufgabe1;

public class Ritter extends Kreatur{


    public Ritter(String Name) {
        super(Name);
    }

    @Override
    public void angreifen() {
        System.out.println(getName() + " greift mit dem Schwert an!");

    }
}
