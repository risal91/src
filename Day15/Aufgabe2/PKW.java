package Day15.Aufgabe2;

public class PKW {
    public TankfüllstandLeuchte tankfüllstandLeuchte = TankfüllstandLeuchte.ROT;
    public TankfüllstandBeobachter beobachter;
    private int tankfüllstand;

    public PKW( int tankfüllstand) {
        addtankfüllstand(tankfüllstand);
    }

    public void addTankfüllstandBeobachter(TankfüllstandBeobachter beobachter){
        this.beobachter = beobachter;
    }

    public TankfüllstandLeuchte getTankfüllstandLeuchte() {
        return tankfüllstandLeuchte;
    }

    public void addtankfüllstand(int benzin){
        this.tankfüllstand += benzin;

        if (tankfüllstand >= 15){
            tankfüllstandLeuchte = TankfüllstandLeuchte.GRÜN;
        }
    }
    public void fahren()  {
        while (tankfüllstand > 0){
            System.out.println("\nBrumm...");
            tankfüllstand--;
            try {
                Thread.sleep(500);
            }catch (InterruptedException e){
            }
            if (tankfüllstand < 10){
                tankfüllstandLeuchte = TankfüllstandLeuchte.ROT;
                beobachter.onTankfüllstandNiedrig(this);
                try {
                    Thread.sleep(500);
                }catch (InterruptedException e){
                }

            }else if (tankfüllstand < 15){
                tankfüllstandLeuchte = TankfüllstandLeuchte.GELB;
                beobachter.onTankfüllstandNiedrig(this);
                try {
                    Thread.sleep(500);
                }catch (InterruptedException e){
                }
            }
        }
        }
    }
