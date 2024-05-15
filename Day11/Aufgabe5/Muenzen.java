package Day11.Aufgabe5;

import java.util.ArrayList;

public enum Muenzen {
    ZWEI_EURO(200),
    EIN_EURO(100),
    FUENFZIG_CENT(50),
    ZWANZIG_CENT(20),
    ZEHN_CENT(10),
    FUENF_CENT(5),
    ZWEI_CENT(2),
    EIN_CENT(1);

    private final int wert;

    Muenzen(int wert){
        this.wert = wert;
    }

    public int getWert(){
        return wert;
    }

    public static ArrayList<Muenzen> berechneWechselgeld(int centBetrag){
        ArrayList<Muenzen> muenzen = new ArrayList<>();

        for (Muenzen muenze : Muenzen.values()){
            while (centBetrag >= muenze.getWert()){
                muenzen.add(muenze);
                centBetrag -= muenze.getWert();
            }
        }
        return muenzen;
    }


}
