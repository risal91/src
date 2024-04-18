package Day15.Aufgabe2;

import java.util.Scanner;

public class Fahrer implements TankfüllstandBeobachter{
    Scanner sc = new Scanner(System.in);
    int tankLadung;

    public void tanken(PKW pkw){
        try {
            Thread.sleep(500);
        }catch (InterruptedException e){
        }
        System.out.println("Wie viel einheiten willst du Tanken: ");
        tankLadung = Integer.parseInt(sc.nextLine());

            pkw.addtankfüllstand(tankLadung);

    }


    @Override
    public void onTankfüllstandNiedrig(PKW pkw) {
        System.err.println("Tankkontrollleuchte: " + pkw.getTankfüllstandLeuchte());

        try {
            Thread.sleep(250);
        }catch (InterruptedException e){
        }

        if(pkw.getTankfüllstandLeuchte() == TankfüllstandLeuchte.GELB){
            System.out.println("Ach, hat noch Zeit...");

        }else if (pkw.getTankfüllstandLeuchte() == TankfüllstandLeuchte.ROT) {
            System.out.println("Jetzt aber dringend tanken...");
            tanken(pkw);
        }

    }
}
