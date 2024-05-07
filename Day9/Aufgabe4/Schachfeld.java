package Day9.Aufgabe4;

import java.util.Random;

public class Schachfeld {
    private Random rnd = new Random();
    private String linie(){
        int zahl = rnd.nextInt(8);
        return String.valueOf((char) ('A' +zahl));
    };
    private  String reihe(){
        int zahl = rnd.nextInt(8)+1;
        return String.valueOf(zahl);
    }
    public String getZufallsfeld(){
        return linie() + reihe();
    }
}
