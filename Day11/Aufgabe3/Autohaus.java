package Day11.Aufgabe3;




public class Autohaus {
    public static void main(String[] args) {
        Fahrzeug motorrad = new Fahrzeug("LR-TM-2","Rot","BMW",FahrzeugTyp.MOTORRAD);
        Fahrzeug pkw = new Fahrzeug("LR-TM-3","Blau","Opel",FahrzeugTyp.PKW);
        Fahrzeug lkw = new Fahrzeug("HAL-L-3","Schwarz","MAN",FahrzeugTyp.LKW);


    Fahrzeug.gibListe();

    motorrad.setLackierung("Grün");

    Fahrzeug.gibListe();

    }

}
