package Vererbung.Beispiele.Dogs;

public class Perser extends Cat {

    private  int haarLaenge;
    //falls es einen Defaultconstructor in der elternklasse OHNE PARAMETER gibt...
    // ..dann wird dieser automatisch zu Beginn des Konstruktors aufgerufen
    public Perser(String name) {
        //hier wird der Defaultconstructor aufgerufen falls dieser exestiert..
        //und kein explizites super(...) von uns hier deklariert wird
        super(name);
    }

    public Perser() {
    }
}
