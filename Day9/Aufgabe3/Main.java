package Day9.Aufgabe3;

public class Main {

    public static void main(String[] args) {
        Produkt pro1 = new Produkt("Pullover", 200);

        //Funktionstest Name
        System.out.println("Name: " + pro1.getName());
        pro1.setName("Hose");
        System.out.println("Neuer Name: " + pro1.getName());

        //Funktionstest Mindestpreis
        pro1.setMindestpreis(100);

        //Funktionstest Verkaufspreis
        System.out.println("Preis: " +pro1.getVerkaufspreis());
        pro1.setVerkaufspreis(190);
        System.out.println("Neuer Preis: " +pro1.getVerkaufspreis());
        pro1.setVerkaufspreis(5);
    }
}
