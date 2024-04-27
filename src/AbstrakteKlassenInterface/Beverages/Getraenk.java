package AbstrakteKlassenInterface.Beverages;

public abstract class Getraenk implements Brennbar{
    protected String name;

    public Getraenk(String name) {
        this.name = name;
    }

    public abstract int getAnzahlZutaten();
    public abstract boolean beinhaltetAlkohol();

    public  abstract double mengeInMl();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean brennt() {
        return false;
    }

    @Override
    public String toString() {
        return "Getraenk " + "name " + name ;
    }
}
