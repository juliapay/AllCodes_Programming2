package AbstrakteKlassenInterface.Beverages;

public class Fluessigkeit {
    private String name;
    private  double menge;
    private  double prozentAlkohol;

    public Fluessigkeit(String name, double menge, double prozentAlkohol) {
        this.name = name;
        this.menge = menge;
        this.prozentAlkohol = prozentAlkohol;
    }

    public String getName() {
        return name;
    }

    public double getMenge() {
        return menge;
    }

    public double getProzentAlkohol() {
        return prozentAlkohol;
    }
}
