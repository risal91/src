package Day12.Aufgabe6;

import java.util.ArrayList;
import java.util.List;

public class Firma {
public static List<Firma> firmenListe = new ArrayList<>();
private List<Land> laenderListe = new ArrayList<>();
private List<Mitarbeiter> mitarbeiterListe = new ArrayList<>();
private String firmaName;

    public String getFirmaName() {
        return firmaName;
    }

    public Firma(String firmaName) {
        this.firmaName = firmaName;
        firmenListe.add(this);
    }
    public void zeigeAlleLaender(){
        System.out.println("\nAlle Länder, in denen " + firmaName + " vertreten ist: ");
        for (Land land : laenderListe){
            System.out.println("- " + land.getLandName());
        }
    }
    public void zeigeAlleMitarbeiter(){
        System.out.println("\nAlle Mitarbeiter, die in " + firmaName + " Arbeiten: ");
        for (Mitarbeiter mitarbeiter : mitarbeiterListe){
            System.out.println("- "+mitarbeiter.getMitarbeiterName());
        }
    }

    public void addLand(Land land){
        laenderListe.add(land);
    }
    public void addMitarbeiter(Mitarbeiter mitarbeiter){
        mitarbeiterListe.add(mitarbeiter);
    }
}
