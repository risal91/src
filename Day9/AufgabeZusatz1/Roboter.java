package Day9.AufgabeZusatz1;

public class Roboter {
    private int batterieLaufzeit = 100;

    public int getBatterieLaufzeit() {
        return batterieLaufzeit;
    }

    public void ladeRoboter(){
        batterieLaufzeit = 100;
        System.out.println(Farbcode.DEFAULT.getFarbe() + "---------------------");
        System.out.println(Farbcode.GRUEN.getFarbe() + "Roboter wurde geladen");
        System.out.println(Farbcode.DEFAULT.getFarbe() + "---------------------");

    }

    public boolean istBatterieLaufzeitNiedrig() {
        return batterieLaufzeit < 10;
    }

    public void fuehreAufgabeAus(Aufgaben aufgabe) {
        if (batterieLaufzeit >= aufgabe.getKostenBatterie()) {
            System.out.println(Farbcode.LILA.getFarbe() + "Der Roboter " + aufgabe.getName() + " / BatterieLaufzeit beträgt jetzt " + (batterieLaufzeit - aufgabe.getKostenBatterie()) + "%");
            batterieLaufzeit -= aufgabe.getKostenBatterie();
        } else {
            System.out.println(Farbcode.GOLD.getFarbe() + "Kann Aufgabe nicht mehr ausführen!!! Batterie Laufzeit nur noch " + batterieLaufzeit + "% / Roboter bei Bedarf laden!");
        }

        if (istBatterieLaufzeitNiedrig()) {
            System.out.println(Farbcode.ROT.getFarbe() + "Akkuzustand unter 10% Kritisch !!! Bitte aufladen.");
            ladeRoboter();
        }
    }
}
