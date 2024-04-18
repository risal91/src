package Day15.Aufgabe3;
//Sie ein Interface "IAdresse" mit den Getter-
// *   und Setter-Methoden für Name und Anschrift (Anschrift ist vom Typ Adresse)
// *      und der Methode "printEtikett()"
public interface IAdresse {
    String getName();

    void setName(String name);

    Adresse getAnschrift();

    void setAnschrift(Adresse anschrift);

    void printEtikett();
}