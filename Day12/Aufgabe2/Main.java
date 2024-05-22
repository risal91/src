package Day12.Aufgabe2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Tierarten erstellen
        Tierart jaguar = new Tierart("jaguar", 3.75);
        Tierart leopard = new Tierart("Leopard", 3.10);
        Tierart schaf = new Tierart("Schaf", 4.50);

        //Tiere erstellen
        Tier shira = new Tier(1, "Shira", jaguar);
        Tier shari = new Tier(2, "Shari", jaguar);
        Tier lopa = new Tier(3, "Lopa", leopard);
        Tier shaun = new Tier(4, "Shuan", leopard);

        // Gehege erstellen
        Gehege klein1 = new Gehege(2);
        klein1.setErlaubteTierarten(jaguar);
        klein1.setErlaubteTierarten(leopard);

        //Tiere ins Gehege stopfen
        klein1.addTier(shari);
        klein1.addTier(shaun);
        klein1.addTier(lopa);
        klein1.addTier(shira);

        klein1.zeigeTierListe();

        System.out.printf("Gesamtmenge Futter: %.2f kg\n", klein1.futtermengeGesamt());
    }
}
