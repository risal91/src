package Day9.Aufgabe1;

import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.List;

public class Firma {
    private String name;
    private List<Double> konten;

    //Konstruktor
    public Firma(String name){
        this.name = name;
        this.konten = new ArrayList<>();
    }

    //Methode getSumme
    public double getSumme(){
        double summe = 0;
        for (double konto : konten){
            summe = summe+konto;
        }

        return summe;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Double> getKonten() {
        return konten;
    }

    public void setKonten(List<Double> konten) {
        this.konten = konten;
    }
}
