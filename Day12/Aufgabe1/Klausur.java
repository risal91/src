package Day12.Aufgabe1;

public class Klausur {

    private final int id;
    private final int note;
    private Fach fach;

    public Klausur(int id, int note) {
        this.id = id;
        this.note = note;
    }

    public int getId() {
        return id;
    }

    public int getNote() {
        return note;
    }

    public Fach getFach() {
        return fach;
    }

    public void setFach(Fach fach) {
        this.fach = fach;
    }

}
