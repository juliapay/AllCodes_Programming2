package Vererbung.Beispiele.Land;

public class Land {

    private double bruttoSozialProdukt;

    public Land(double bruttoSozialProdukt) {
        this.bruttoSozialProdukt = bruttoSozialProdukt;
    }

    public Land() {
    }

    public double getBruttoSozialProdukt() {
        return bruttoSozialProdukt;
    }

    public void setBruttoSozialProdukt(double bruttoSozialProdukt) {
        this.bruttoSozialProdukt = bruttoSozialProdukt;
    }
}
