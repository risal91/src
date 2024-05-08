package Day10.Aufgabe1;

public class Felderbauer {
    public static void main(String[] args) {
        Fußballfeld feld1 = new Fußballfeld(50, 100);
        Fußballfeld feld2 = new Fußballfeld(30, 200);
        Fußballfeld feld3 = new Fußballfeld(60, 90);

        feld1.zeigeAlle();
        feld2.zeigeAlle();
        feld3.zeigeAlle();
    }
}
