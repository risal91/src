package Day12.Aufgabe0Kompositionen;

import java.util.ArrayList;
import java.util.List;

public class Gruppe {

    private static class Abenteurer {
    private final String namen;

        public Abenteurer(String namen) {
            this.namen = namen;
        }

    }

        private final List<Abenteurer> abenteurerInderGruppe =  new ArrayList<>();


        public void addAbenteurer(String Name){
            abenteurerInderGruppe.add(new Abenteurer(Name));
        }

        public void printAbenteurer(){
            for (Abenteurer abenteurer : abenteurerInderGruppe){
                System.out.println(abenteurer.namen);
            }
        }

}
