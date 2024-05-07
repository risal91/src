package Day9.Aufgabe3;

public class Produkt {
    private String name;
    private int mindestpreis;
    private int verkaufspreis;

    public Produkt(String name, int mindestpreis) {
        this.name = name;
        this.mindestpreis = mindestpreis;
        this.verkaufspreis = mindestpreis;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVerkaufspreis() {
        return verkaufspreis;
    }

    public void setVerkaufspreis(int neuerVerkaufspreis) {
        if(neuerVerkaufspreis >= mindestpreis){
            this.verkaufspreis = neuerVerkaufspreis;
        }else{
            System.out.println("Fehler:  Verkaufpreis darf nicht unter Min Verkaufpreis Liegen.");
        }
    }

    public void setMindestpreis(int mindestpreis) {
        this.mindestpreis = mindestpreis;
    }
}
