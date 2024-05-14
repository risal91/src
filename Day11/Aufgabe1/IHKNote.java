package Day11.Aufgabe1;

public enum IHKNote {
    SehrGut(92),
    Gut(81),
    Befriedigend(67),
    Ausreichend(50),
    Mangelhaft(30),
    Ungenügend(0);

    public final int punktegrenzwert;

    IHKNote(int punktegrenzwert){
        this.punktegrenzwert = punktegrenzwert;
    }

}
