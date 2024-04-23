package AbstrakteKlassenInterface.Enten;

public class Flugente extends Ente{
    protected int gewichtFedern;

    public Flugente(String name, int gewicht, int gewichtFedern) {
        super(name, gewicht);
        this.gewichtFedern = gewichtFedern;
    }

    @Override
    public int getfullWeight() {
        return gewichtFedern+super.gewicht;
    }

    @Override
    public String toString() {
        return "Flugente " +
                "\n Name: " + name+
                "\nGesamtgewicht: " + getfullWeight();
    }

    @Override
    public String makeNoise() {
        return null;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
