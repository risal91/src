package Day9.Aufgabe1;

public class Main {

    public static void main(String[] args) {
        //Firma WBS
        Firma wbs = new Firma("WBS");
        wbs.getKonten().add(50000.00);
        wbs.getKonten().add(-49000.25);
        wbs.getKonten().add(-800000.00);

        //Firma geile Umschüler
        Firma gu = new Firma("Geile Umschüler");
        gu.getKonten().add(00.00);
        gu.getKonten().add(5000.00);
        gu.getKonten().add(800000.00);

        // Werte Ausgabe

        System.out.println("Firma 1:\n" +
                "Name: " + wbs.getName() +"\n"+
                "Konten: " + wbs.getKonten() +"\n"+
                "Gesamtbetrag: "+ wbs.getSumme());

        System.out.println("");

        System.out.println("Firma 2:\n" +
                "Name: " + gu.getName() +"\n"+
                "Konten: " + gu.getKonten() +"\n"+
                "Gesamtbetrag: "+ gu.getSumme());

    }


}
