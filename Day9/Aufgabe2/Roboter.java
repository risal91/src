package Day9.Aufgabe2;

public class Roboter {
    private int batterieLaufzeit;
    private String aufgabe;

    public Roboter(int batterieLaufzeit, String aufgaben) {
        this.batterieLaufzeit = batterieLaufzeit;
        this.aufgabe = aufgaben;
    }

    public boolean istBatterieLaufzeitNiedrig(){
        return batterieLaufzeit < 2;
    }

    public void führeAufgabeAus(){
        if(!istBatterieLaufzeitNiedrig()){
            System.out.println(aufgabe);
            batterieLaufzeit--;
        }else {
            System.out.println("ich muss erst Aufgeladen werden.");
        }
    }

}
