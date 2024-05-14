package Day11.Aufgabe2;

import java.util.Scanner;

public class jpMartialArts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("\n Wähle eine Aktion: \n" +
                    "1. Kyu-Grad nach Gürtelfarbe bestimmen\n" +
                    "2. Gürtfelfarbe nach Kyu-Grad bestimmen\n" +
                    "3. Nächste Gürtelfarbe bestimmen\n" +
                    "4. Exit");
            int wahl = sc.nextInt();
            sc.nextLine();

            switch (wahl) {
                case 1:
                    guertelfarbenachkyu(sc);
                    break;
                case 2:
                    kyuGradnnachfarbe(sc);
                    break;
                case 3:
                    naechsterguertel(sc);
                    break;
                case 4:
                    System.out.println("The Cake is a Lie");
                    return;

                default:
                    System.out.println("Ungültige Eingabe. Try Again");
            }
        }

    }

    private static void guertelfarbenachkyu(Scanner sc){
        System.out.println("Bitte gib deinen Kyu-Grad ein (1 bis 9): ");
        int kyuGrad = sc.nextInt();
        sc.nextLine();

        if (kyuGrad < 1 || kyuGrad > 9){
            System.out.println("Ungültiger Kyu-Grad. Try Again");
            return;
        }
        Kyu kyu = Kyu.values()[kyuGrad - 1];
        System.out.println("Die Gürtelfarbe für " +kyuGrad+ ". Kyu ist " + kyu);
    }
    private  static  void kyuGradnnachfarbe(Scanner sc){
        System.out.println("Wähle eine Gürtfelfarbe:");
        for (Kyu kyu : Kyu.values()){
            System.out.println(kyu + " (" +kyu.getKyuGrad() + ")");
        }

        String guertelfrabe = sc.nextLine();

        try {
            Kyu kyu = Kyu.valueOf(guertelfrabe.toUpperCase());
            System.out.println("Der Kyu-Grad für die Farbe " + guertelfrabe + " ist: " +kyu.getKyuGrad());
        }catch (IllegalArgumentException e){
            System.out.println("Ungültige Eingabe! Try again");
        }
    }

    private static void naechsterguertel(Scanner sc){
        System.out.println("Wähle deine aktuelle Gürtelfarbe; ");
        for (Kyu kyu : Kyu.values()){
            System.out.println(kyu + " (" +kyu.getKyuGrad() + ")");
        }

        String guertelfrabe = sc.nextLine();

        try {
            Kyu kyu = Kyu.valueOf(guertelfrabe.toUpperCase());
            if (kyu == Kyu.BRAUN){
                System.out.println("Du hast schon den Höchsten Grad!");
            }else {
                Kyu naechsterKyu = Kyu.values()[kyu.ordinal() - 1];
                System.out.println("Die nächste Gürtelfarbe ist: " + naechsterKyu);
            }

        }catch (IllegalArgumentException e){
            System.out.println("Ungültige Eingabe! Try again");
        }
    }


}
