package Day12.Aufgabe5;

public class Main {
    public static void main(String[] args) {
        Tier blacky = new Tier("Pferd", "Blacky");
        Tier lassie = new Tier("Hund", "Lassie");

        Futter trockenfutter = new Futter("Trockenfutter", 300);
        Futter heu = new Futter("Heu", 150);
        Futter fleisch = new Futter("Fleisch",450);

        new Fütterung(2.0,blacky,trockenfutter);
        new Fütterung(1.5, lassie,trockenfutter);
        new Fütterung(0.5, blacky,heu);
        new Fütterung(0.25, lassie,fleisch);


        System.out.println("\nAlle Futtersorten von Blacky: ");
        Fütterung.printFuttervonTier(blacky);
        System.out.println("\nAlle Futtersorten von Lassie: ");
        Fütterung.printFuttervonTier(lassie);

        System.out.println("\nAlle Tiere, die Trockenfutter erhalten:");
        Fütterung.printFuttertiere(trockenfutter);
    }
}
