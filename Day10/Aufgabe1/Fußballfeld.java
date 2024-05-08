package Day10.Aufgabe1;

public class Fußballfeld {
    private int breite;
    private int länge;
    private boolean dfbTauglich;

    public Fußballfeld(int breite, int länge) {
        this.breite = breite;
        this.länge = länge;
        this.dfbTauglich = breite >= 45 && breite <= 55 && länge >= 90 && länge <= 110;

    }
    public void zeigeAlle(){
        System.out.println("Breite: " + breite);
        System.out.println("Länge: " + länge);
        System.out.println("DFB-Tauglich: " + dfbTauglich);
    }
}
