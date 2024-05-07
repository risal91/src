package Day9.Aufgabe4;

public class Main {
    public static void main(String[] args) {

        Schachfeld feld = new Schachfeld();
        String zufallsfeld = feld.getZufallsfeld();
        System.out.println("Zufallsfeld: " +zufallsfeld);
    }
}
