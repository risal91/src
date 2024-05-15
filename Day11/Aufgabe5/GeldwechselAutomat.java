package Day11.Aufgabe5;

import java.util.ArrayList;

public class GeldwechselAutomat {
    public static void main(String[] args) {
        int centBetrag = 323;

        ArrayList<Muenzen> wechselGeld = Muenzen.berechneWechselgeld(centBetrag);

        System.out.println("Ich habe: " + centBetrag + " cent erhalten!");
        for (Muenzen muenze : wechselGeld){
            System.out.println( muenze );
        }
    }
}
