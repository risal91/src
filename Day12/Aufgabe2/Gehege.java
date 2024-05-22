package Day12.Aufgabe2;

import java.util.ArrayList;
import java.util.List;

public class Gehege {
    private List<Tierart> erlaubteTierarten;
    private List<Tier> tiereImGehege;
    private int maxAnzahlDerTiere;

    public Gehege(int maxAnzahlDerTiere) {
        this.erlaubteTierarten = new ArrayList<>();
        this.tiereImGehege = new ArrayList<>();
        this.maxAnzahlDerTiere = maxAnzahlDerTiere;
    }
    public boolean addTier(Tier t){
        if (erlaubteTierarten.contains(t.getArt()) && tiereImGehege.size() < maxAnzahlDerTiere){
            tiereImGehege.add(t);
            return true;
        }else return false;
    }
    public void zeigeTierListe(){
        for (Tier tier : tiereImGehege){
            System.out.println(tier.getNamen() + " ("+ tier.getArt().getBezeichnung() + ")");
        }
    }
    public double futtermengeGesamt(){
        double gesamtmenge = 0.0;
        for (Tier tier : tiereImGehege){
            gesamtmenge += tier.getArt().getFuttermenge();
        }return gesamtmenge;
    }

    public List<Tierart> getErlaubteTierarten() {
        return erlaubteTierarten;
    }

    public void setErlaubteTierarten(Tierart erlaubteTierarten) {
        this.erlaubteTierarten.add(erlaubteTierarten);
    }

    public List<Tier> getTiereImGehege() {
        return tiereImGehege;
    }
}
