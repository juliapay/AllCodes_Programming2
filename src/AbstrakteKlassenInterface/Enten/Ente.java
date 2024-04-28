package AbstrakteKlassenInterface.Enten;

public abstract class Ente implements Comparable<Ente>{
    protected String name;
    protected  int weight;

    public Ente(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    public abstract int getFullWeight();
    public abstract String makeNoise();

    @Override
    public int compareTo(Ente o) {
        //hier die compare to methode
        return Integer.compare(this.getFullWeight(),o.getFullWeight());
    }
}

