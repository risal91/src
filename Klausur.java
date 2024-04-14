public class Klausur {

    private int id;
    private int note;
    private Fach fach; // bidirektionale Beziehung zu Fach

    public Klausur(int id, int note) {this.id = id; this.note = note; }
    public int getId() { return id;  }
    public int getNote() { return note; }
    public Fach getFach() { return fach; }
    public void setFach(Fach fach) {this.fach = fach;}

}
