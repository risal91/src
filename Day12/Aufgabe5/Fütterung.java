package Day12.Aufgabe5;

import java.util.ArrayList;
import java.util.List;

public class Fütterung {
    static List<Fütterung> fütterrungsListe =new ArrayList<>();

    double mengeInKg;
    Tier tier;
    Futter futter;

    public Fütterung(double mengeInKg, Tier tier, Futter futter) {
        this.mengeInKg = mengeInKg;
        this.tier = tier;
        this.futter = futter;
        fütterrungsListe.add(this);
    }

    public static List<Fütterung> getFütterrungsListe() {
        return fütterrungsListe;
    }

    public double getMengeInKg() {
        return mengeInKg;
    }

    public Tier getTier() {
        return tier;
    }

    public Futter getFutter() {
        return futter;
    }
    public static void printFuttertiere(Futter futter){
        for( Fütterung fütterung : fütterrungsListe){
            if(fütterung.futter == futter){
                System.out.println(fütterung.tier.getNamen());
            }
        }
    }

    public static void printFuttervonTier(Tier tier){
        for(Fütterung fütterung : fütterrungsListe){
            if(fütterung.tier == tier){
                System.out.println(fütterung.futter.getBezeichnung());
            }
        }
    }

}
