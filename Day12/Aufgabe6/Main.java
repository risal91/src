package Day12.Aufgabe6;

public class Main {
    public static void main(String[] args) {

        //Länder
        Land deutschland = new Land("Deutschland");
        Land usa = new Land("USA");
        Land daenemark = new Land("Dänemark");

        //Firma
        Firma microsoft = new Firma("Microsoft");
        Firma apple = new Firma("Apple");
        Firma vw = new Firma("Volkswagen");
        Firma porsche = new Firma("Porsche");

        //Firmen in länder Errichten
        microsoft.addLand(deutschland);
        microsoft.addLand(usa);
        microsoft.addLand(daenemark);

        apple.addLand(deutschland);
        apple.addLand(usa);

        vw.addLand(deutschland);
        vw.addLand(daenemark);
        vw.addLand(usa);

        porsche.addLand(deutschland);
        porsche.addLand(usa);

        Mitarbeiter mike = new Mitarbeiter("Mike",microsoft);
        Mitarbeiter marcy = new Mitarbeiter("Marcy", microsoft);
        Mitarbeiter andrew = new Mitarbeiter("Andrew", apple);
        Mitarbeiter amy = new Mitarbeiter("Amy",apple);
        Mitarbeiter volker = new Mitarbeiter("Volker",vw);
        Mitarbeiter verena = new Mitarbeiter("Verena",vw);
        Mitarbeiter paul = new Mitarbeiter("Paul", porsche);
        Mitarbeiter petra = new Mitarbeiter("Petra",porsche);

        System.out.println("\n\n(1) Alle Firmen pro Land: ");
        for (Land land : Land.laenderListe){
            land.zeigeAlleFirmen();
        }

        System.out.println("\n\n(2) Alle Länder pro Firma: ");
        for (Firma firma : Firma.firmenListe){
            firma.zeigeAlleLaender();
        }

        System.out.println("\n\n(3) Alle Mittarbeiter pro Firma: ");
        for (Firma firma : Firma.firmenListe){
            firma.zeigeAlleMitarbeiter();
        }

        System.out.println("\n\n(4) Alle Firma jedes Mitarbeiters: ");
        for (Mitarbeiter mitarbeiter : Mitarbeiter.mitarbeiterListe){
            mitarbeiter.zeigeAlleMitarbeiter();
        }

    }
}
