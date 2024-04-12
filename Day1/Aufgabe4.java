package Day1;

/*
Zu Beginn des Programmes wird der Variable kantenlaengeKubus der Wert 3.75 zugewiesen.
Anschließend werden Oberfläche und Volumen des Kubus berechnet und in die Variablen oberflaeche und volumen abgespeichert.
Dann soll die folgende Ausgabe (entsprechend des dargestellten Layouts) ausgegeben werden:

*****************************************
*       Ergebnisse für Kantenlänge x    *
*****************************************

Oberfläche: oberflaeche
Volumen: volumen

(Alle Zahlenwerte auf 2 Nachkommastellen genau)
 */


public class Aufgabe4 {
    public static void main(String[] args) {
        float kantenlaengeKubus = 3.75F;
        float oberflaeche = kantenlaengeKubus*kantenlaengeKubus*6;
        float volumen = kantenlaengeKubus*kantenlaengeKubus*kantenlaengeKubus;


        System.out.println("*****************************************");
        System.out.println("*    Ergebnisse für Kantenlänge " + kantenlaengeKubus + "    *");
        System.out.println("*****************************************");
        System.out.println("");
        System.out.printf("Oberfläche: %.2f \n", oberflaeche);
        System.out.printf("Volumen: %.2f \n",  volumen);


    }
}
