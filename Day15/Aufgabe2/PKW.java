package Day15.Aufgabe2;

public class PKW {
    public TankfüllstandLeuchte tankfüllstandLeuchte;
    private TankfüllstandBeobachter beobachter;
    public int tankfüllstand;

    public PKW(TankfüllstandLeuchte tankfüllstandLeuchte, int tankfüllstand) {
        this.tankfüllstandLeuchte = tankfüllstandLeuchte;
        this.tankfüllstand = tankfüllstand;
    }
    public void addTankfüllstandBeobachter(TankfüllstandBeobachter beobachter){
        this.beobachter = beobachter;
    }

    public void addtankfüllstand(int benzin){
        this.tankfüllstand += benzin;

        if (tankfüllstand >= 15){
            tankfüllstandLeuchte = TankfüllstandLeuchte.GRÜN;
        }
    }
    public void fahren(){
        while (tankfüllstand > 0){
            System.out.println("\nBrumm...");
            tankfüllstand--;

            if (tankfüllstand < 15){
                tankfüllstandLeuchte = TankfüllstandLeuchte.GELB;
                if(beobachter !=null){
                    beobachter.onTankfüllstandNiedrig(this);
                }
            }
        }
            if (tankfüllstand < 10){
                tankfüllstandLeuchte = TankfüllstandLeuchte.ROT;
                if(beobachter !=null){
                    beobachter.onTankfüllstandNiedrig(this);
                }
            }
        }
    }
