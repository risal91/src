package Day11.Aufgabe1;

import java.util.Scanner;

public class IHKPruefung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int punkte = 0;
        do {
            System.out.println("Bitte Punktzahl eingeben: ");
            try {
                punkte = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e){
                punkte = -1;
            }

        } while (punkte < 0 || punkte > 100);
        IHKNote note = getNote(punkte);
        System.out.println("Ihre Note: " +note.name());

    }
    public static IHKNote getNote(int punkte){
        for (IHKNote note : IHKNote.values()){
            if (punkte >= note.punktegrenzwert){
                return note;
            }
        }

        return IHKNote.Ungenügend;
    }
}
