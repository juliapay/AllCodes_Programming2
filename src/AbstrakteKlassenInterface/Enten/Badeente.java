package AbstrakteKlassenInterface.Enten;

public class Badeente extends Ente{

    protected int gewichtWasser;

    public Badeente(String name, int gewicht, int gewichtWasser) {
        super(name, gewicht);
        this.gewichtWasser = gewichtWasser;
    }

    @Override
    public int getfullWeight() {

        return super.gewicht+gewichtWasser;
    }

    @Override
    public String makeNoise() {
        return null;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
    public String toString() {
        return "Badeente " +
                "\n Name: " + name+
                "\nGesamtgewicht: " + getfullWeight();
    }
}
