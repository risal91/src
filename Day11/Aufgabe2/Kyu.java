package Day11.Aufgabe2;

public enum Kyu {
    BRAUN(1),
    BLAU(2),
    GRÜN(3),
    GROANGEGRÜN(4),
    ORGANGE(5),
    GELBORGANE(6),
    GELB(7),
    WEISGELB(8),
    WEIS(9);

    public final int kyuGrad;

    Kyu (int kyuGrad){
        this.kyuGrad = kyuGrad;
    }
    public int getKyuGrad(){
        return kyuGrad;
    }
}
