package Day14.unterricht;

import java.util.ArrayList;

public abstract class Krokodil {

    public static final ArrayList<Krokodil> krokodilListe = new ArrayList<>();

    private String farbe;

    public String getFarbe() {
        return this.farbe;
    }

    public void schwimmen() {
        System.out.println("Ich schwimme im Wasser.");
    }

    public abstract void zeigeInfoZumLebensraum();

    protected Krokodil(String farbe) {
        this.farbe = farbe;

        krokodilListe.add(this);
    }
}
