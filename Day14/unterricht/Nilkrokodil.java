package Day14.unterricht;

public class Nilkrokodil extends Krokodil{
    @Override
    public void zeigeInfoZumLebensraum() {
        System.out.println("Anders als mein Name vermuten lässt lebe ich nicht nur am Nil, sondern in fast ganz Afrika.");
    }

    public void imGrasLiegen(){
        System.out.println("Ich liege im Gras. Hier mag ich es.");
    }

    protected Nilkrokodil(String farbe) {
        super(farbe);
    }
}
