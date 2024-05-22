package Day12.Aufgabe4;


import Day9.Aufgabe3.Produkt;

public class Main {
    public static void main(String[] args) {

        //Prameterloser Ritter
        Ritter grafHolz = new Ritter();
        grafHolz.name = ("Graf von Holz");
        grafHolz.seinPferd.name = "Lucy";
        //Ritter mit Parametern
        Ritter prinzDoppel = new Ritter("Prinz von Doppelkeks", "Schoko");

        //Ritterliste
        System.out.println("Die Ritter: ");
        for (Ritter ritter : Ritter.ritterListe){
            System.out.println(ritter.name);
        }

        //Pferdeliste

        System.out.println("\nDie Pferde: ");
        for (Pferd pferd : Pferd.pferdeListe ){
            System.out.println(pferd.name);
        }

    }
}
