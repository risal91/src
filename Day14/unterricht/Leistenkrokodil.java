package Day14.unterricht;

public class Leistenkrokodil extends Krokodil{


    @Override
    public void zeigeInfoZumLebensraum() {
        System.out.println("Ich lebe in Ostindien, Südostasien und komme sogar bis nach Nordaustralien.");
    }

    public void imSchlammLiegen() {
        System.out.println("Ich liege im Schlamm. Hier mag ich es.");
    }

    public Leistenkrokodil(String farbe) {
        super(farbe);
    }
}
