package Day10.Aufgabe2;

public class Kurs {
    private int kursnummer;
    private static int zähler = 0;
    private static int maxWert;
    private static Kurs[] kursListe = new Kurs[maxWert];

    public Kurs(int x){
        System.out.println("Erstellen: ");
        boolean vergeben = false;
        for (int i = 0; i < zähler; i++) {
            if (kursListe[i].kursnummer == x){
                vergeben = true;
                break;
            }
        }
        if (!vergeben) {
            if (zähler < maxWert) {
                kursnummer = x;
                kursListe[zähler] = this;
                zähler++;
                System.out.println("Ich habe die neue Kursnummer Erstellt: " + kursnummer);
                System.out.println(" ");
            }
        }else {
            kursnummer = -1;
            System.out.println("Warning: Kursnummer " + x + " existiert bereits!");

        }
    }

   public static void ausgabe(){
       System.out.println("Ausgabe: ");
        for (Kurs kurs : kursListe){
            if(kurs != null && kurs.kursnummer != -1){
                System.out.println(kurs.kursnummer + " ");
            }else {
                System.out.println("Warning: Kursnummer nicht vorhanden!");
            }
        }
       System.out.println();
   }

   public static void setMaxWert(int maxWert){
       System.out.println("MaxWerter: ");
        if (Kurs.maxWert == 0){
            Kurs.maxWert = maxWert;
            kursListe = new Kurs[maxWert];
        } else {
            System.out.println("Warning: maxWert kann nur einmal gesetzt werden!");
        }
   }

    public static int getMaxWert() {
        return maxWert;
    }
}
