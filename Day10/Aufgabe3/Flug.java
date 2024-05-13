package Day10.Aufgabe3;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Flug {
    private String id;
    private LocalDateTime abflugZeit;
    private LocalDateTime ankunftZeit;
    private int preis;
    private int freiPlaetze;
    public static Flug[] flüge = new Flug[0];

    /**
     *
     * @param id = Die ID des Fluges.
     * @param abflugZeit = Der Zeitpunkt des Abflugs.
     * @param ankunftZeit = Der Zeipunkt der Ankunft
     * @param preis = Der Preis des Flugtickets.
     * @param freiPlaetze = Anzahl der freien Plätze
     */
    public Flug(String id, LocalDateTime abflugZeit, LocalDateTime ankunftZeit, int preis, int freiPlaetze) {
        this.id = id;
        this.abflugZeit = abflugZeit;
        this.ankunftZeit = ankunftZeit;
        this.preis = preis;
        this.freiPlaetze = freiPlaetze;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getAbflugZeit() {
        return abflugZeit;
    }

    public void setAbflugZeit(LocalDateTime abflugZeit) {
        this.abflugZeit = abflugZeit;
    }

    public LocalDateTime getAnkunftZeit() {
        return ankunftZeit;
    }

    public void setAnkunftZeit(LocalDateTime ankunftZeit) {
        this.ankunftZeit = ankunftZeit;
    }

    public int getPreis() {
        return preis;
    }

    public void setPreis(int preis) {
        this.preis = preis;
    }

    public int getFreiPlaetze() {
        return freiPlaetze;
    }

    public void setFreiPlaetze(int freiPlaetze) {
        this.freiPlaetze = freiPlaetze;
    }

    /**
     * @neu = Gibt eine String-Repräsentation des Fluges zurück
     * @return = neu
     */
    @Override
    public String toString(){
        String neu = "Flug {" + "id='" +id +
                '\'' + ", abflugZeit= " +abflugZeit+
                ", ankunftZeit=" +ankunftZeit+
                ", preis=" +preis +
                ", freiePlaetze=" +freiPlaetze +
                '}';
        return neu;
    }
}
