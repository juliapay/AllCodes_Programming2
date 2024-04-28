package AbstrakteKlassenInterface.Enten;

public class BadeEnte extends Ente{
    protected int gewichtWasser;

    public BadeEnte(String name, int weight, int gewichtWasser) {
        super(name, weight);
        this.gewichtWasser = gewichtWasser;
    }

    @Override
    public int getFullWeight() {
        return weight+this.gewichtWasser;
    }

    @Override
    public String makeNoise() {
        return null;
    }

    @Override
    public String toString() {
        return "BadeEnte " +
                getFullWeight();
    }
}
