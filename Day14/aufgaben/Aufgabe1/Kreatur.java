package Day14.aufgaben.Aufgabe1;

abstract class Kreatur {
    private String name;

    public Kreatur (String Name){
        this.name = Name;
    }

    public abstract void angreifen();

    public String getName() {
        return name;
    }
}
