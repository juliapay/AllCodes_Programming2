package AbstrakteKlassenInterface.Enten;

public abstract class Ente implements Comparable {
    protected String name;
    protected int gewicht;

    public Ente(String name, int gewicht) {
        this.name = name;
        this.gewicht = gewicht;
    }


    public int compareTo(Ente e) {
        if(this.gewicht < e.gewicht){
            return -1;
        }
        if (this.gewicht > e.gewicht) {
            return 1;
        }
        return 0;
    }

    public abstract int getfullWeight();
    public abstract String makeNoise();
    public String getName() {
        return name;
    }

    public int getGewicht() {
        return gewicht;
    }
}
