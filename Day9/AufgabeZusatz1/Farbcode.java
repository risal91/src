package Day9.AufgabeZusatz1;

public enum Farbcode {
    GRUEN("\033[32m"),
    LILA("\033[35m"),
    GOLD("\033[33m"),
    ROT("\033[31m"),
    DEFAULT("\033[0m");

    private final String farbe;

    Farbcode(String frabe){
        this.farbe = frabe;
    }

    public String getFarbe(){
        return farbe;
    }
}
