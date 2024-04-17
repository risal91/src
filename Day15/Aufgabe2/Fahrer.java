package Day15.Aufgabe2;

public class Fahrer implements TankfüllstandBeobachter{

    public void tanken(PKW pkw){
        if(pkw.tankfüllstandLeuchte.equals(TankfüllstandLeuchte.GELB)){
            System.out.println("Ach, hat noch Zeit...");
        }else if (pkw.tankfüllstandLeuchte.equals(TankfüllstandLeuchte.ROT)){
            System.out.println("Jetzt aber dringend tanken...");
            pkw.addtankfüllstand(50); //WIR TANKEN FÜR 50 Units wir sind arm
        }
    }


    @Override
    public void onTankfüllstandNiedrig(PKW pkw) {
        System.err.println("ACHTUNG! Tankfüllstand von "
                + pkw.tankfüllstand + " erreicht!");

    }
}
