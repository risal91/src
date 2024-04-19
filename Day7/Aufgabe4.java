package Day7;

/*
    Ein Ladenbesitzer hat in 3 Städten Filialen und er möchte für jeden Mitarbeiter das Gehalt abspeichern.

        In Stadt 0 gibt es 2 Läden
        In Stadt 1 gibt es 4 Läden
        In Stadt 2 gibt es 3 Läden

        In Stadt 0, Laden 0 arbeiten 5 Mitarbeiter
        In Stadt 0, Laden 1 arbeiten 2 Mitarbeiter

        In Stadt 1, Laden 0 arbeiten 3 Mitarbeiter
        In Stadt 1, Laden 1 arbeiten 2 Mitarbeiter
        In Stadt 1, Laden 2 arbeiten 1 Mitarbeiter
        In Stadt 1, Laden 3 arbeiten 4 Mitarbeiter

        In Stadt 2, Laden 0 arbeiten 2 Mitarbeiter
        In Stadt 2, Laden 1 arbeiten 2 Mitarbeiter
        In Stadt 2, Laden 2 arbeiten 3 Mitarbeiter

  Aufgabe:
  Schreiben Sie bitte ein Java-Programm, in dem ein entsprechendes jagged Array eingeführt wird.
  Füllen Sie bitte mittels verschachtelter Schleifen alle Felder mit dem Wert -1 (jedem Mitarbeiter wird -1 zugewiesen)
  Geben Sie bitte pro Füllvorgang an, welche Mitarbeiternummer, Ladennummer und Stadtnummer aktuell befüllt wird
*/



public class Aufgabe4 {


    public static void main(String[] args) {

        double[][][] gehalt = new double[3][][]; // 3 Städte


        gehalt[0] = new double[2][]; // In Stadt 0 gibt es 2 Läden
        gehalt[0][0] = new double[5]; //in Stadt 0 Laden 0 gibt es 5 Mitartberit
        gehalt[0][1] = new double[2]; //in Stadt 0 Laden 0 gibt es 5 Mitartberit

        gehalt[1] = new double[4][]; // In Stadt 1 gibt es 4 Läden
        gehalt[1][0] = new double[3]; //in Stadt 1 Laden 0 gibt es 3 Mitartberit
        gehalt[1][1] = new double[2]; //in Stadt 1 Laden 1 gibt es 2 Mitartberit
        gehalt[1][2] = new double[1]; //in Stadt 1 Laden 2 gibt es 1 Mitartberit
        gehalt[1][3] = new double[4]; //in Stadt 1 Laden 3 gibt es 4 Mitartberit

        gehalt[2] = new double[3][]; // In Stadt 2 gibt es 3 Läden
        gehalt[2][0] = new double[2]; //in Stadt 2 Laden 0 gibt es 2 Mitartberit
        gehalt[2][1] = new double[2]; //in Stadt 2 Laden 1 gibt es 2 Mitartberit
        gehalt[2][2] = new double[3]; //in Stadt 2 Laden 2 gibt es 3 Mitartberit


        for (int stadt = 0; stadt < gehalt.length; stadt++) {
            for (int laden = 0; laden < gehalt[stadt].length; laden++) {
                for (int mitarbeiter = 0; mitarbeiter < gehalt[stadt][laden].length; mitarbeiter++) {
                    gehalt[stadt][laden][mitarbeiter] = -1;
                    System.out.println("\nDer Mitarbeiter: " +(mitarbeiter + 1) + "\nin der Stadt: "+ (stadt+1) + "\ndes Ladens: " + (laden+1) + "\nhat gehalt erhalten.");
                }

            }

        }






    }
}
