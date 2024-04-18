package Day15.Aufgabe3;
// Erstellen Sie eine Klasse "Adresse" mit Straße, Hausnummer, PLZ und Ort
public class Adresse {
    private  String strasse;
    private String hausnr;
    private int plz;
    private String ort;

    public Adresse(String strasse, String hausnr, int plz, String ort) {
        this.strasse = strasse;
        this.hausnr = hausnr;
        this.plz = plz;
        this.ort = ort;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public String getHausnr() {
        return hausnr;
    }

    public void setHausnr(String hausnr) {
        this.hausnr = hausnr;
    }

    public int getPlz() {
        return plz;
    }

    public void setPlz(int plz) {
        this.plz = plz;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }
}
