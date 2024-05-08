package Day10.Aufgabe2;

public class Schule {
    public static void main(String[] args) {
        Kurs.setMaxWert(10);

        for (int i = 0; i < Kurs.getMaxWert() ; i++) {
            new Kurs((int) (Math.random() * Kurs.getMaxWert() + 1));
        }
        Kurs.ausgabe();
    }
}
