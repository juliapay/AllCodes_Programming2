package Vererbung.Beispiele.Land;

public class Bundesland extends Land{
    public Bundesland(double bruttoSozialProdukt) {
        super(bruttoSozialProdukt);
    }

    @Override
    public double getBruttoSozialProdukt() {
        return super.getBruttoSozialProdukt();
    }
}
