package Day9.AufgabeZusatz1;

public class Programm {
    public static void main(String[] args) {
        // Aufgaben erstellen
        Aufgaben reichtButter = new Aufgaben("Butter reichen", 10);
        Aufgaben einkaufen = new Aufgaben("Einkaufen gehen", 50);
        Aufgaben getraenkHolen = new Aufgaben("Getränk holen", 25);
        Aufgaben sterben = new Aufgaben("wird nicht mehr Gebraucht", 0);

        // Roboter erstellen und laden
        Roboter robo = new Roboter();


        // Aufgaben dem Roboter zuweisen
        robo.fuehreAufgabeAus(reichtButter);
        robo.fuehreAufgabeAus(einkaufen);
        robo.fuehreAufgabeAus(einkaufen);
        robo.fuehreAufgabeAus(getraenkHolen);
        robo.fuehreAufgabeAus(reichtButter);
        robo.fuehreAufgabeAus(reichtButter);
        robo.fuehreAufgabeAus(einkaufen);
        robo.fuehreAufgabeAus(einkaufen);
        robo.fuehreAufgabeAus(getraenkHolen);
        robo.fuehreAufgabeAus(reichtButter);
        robo.fuehreAufgabeAus(sterben);

    }
}
