package AbstrakteKlassenInterface.Enten;

public class FlugEnte extends Ente{
    protected int gewichtFedern;

    public FlugEnte(String name, int weight, int gewichtFedern) {
        super(name, weight);
        this.gewichtFedern = gewichtFedern;
    }

    @Override
    public int getFullWeight() {
        return weight+this.gewichtFedern;
    }

    @Override
    public String makeNoise() {
        return null;
    }

    @Override
    public String toString() {
        return "FlugEnte " + getFullWeight();
    }
}
