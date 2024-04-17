package Day14.unterricht;

public class AbstrakteKlassen {

//    Krokodil kroko = new Krokodil("schwarz"); <--- Klappt nicht!

    public static void main(String[] args) {
//        Leistenkrokodil leisti = new Leistenkrokodil("Grau bis graubraun oder goldbraun");
//        System.out.println("Farbe des Krokodils: " + leisti.getFarbe());
//        leisti.zeigeInfoZumLebensraum();
//        leisti.imSchlammLiegen();

//        Nilkrokodil nili = new Nilkrokodil("Oberseits dunkel Olivfarben, der Bauch ist einheitlich porzellanfarben");
//        System.out.println("Farbe des Krokodils: " + nili.getFarbe());
//        nili.zeigeInfoZumLebensraum();
//        nili.imGrasLiegen();

//        for (Krokodil k : Krokodil.krokodilListe) {
//            System.out.println(k.getClass().getSimpleName());
//            System.out.println(k.getFarbe());
//
//            k.zeigeInfoZumLebensraum();
//
//            if(k instanceof Leistenkrokodil)
//                ((Leistenkrokodil) k).imSchlammLiegen();
//            if (k instanceof Nilkrokodil)
//                ((Nilkrokodil) k).imGrasLiegen();
//        }

        Krokodil kroko = new Nilkrokodil("Graubraun");
        kroko.zeigeInfoZumLebensraum();
        kroko = new Leistenkrokodil("Dunkel Olivfarben");
        kroko.zeigeInfoZumLebensraum();
    }
}
