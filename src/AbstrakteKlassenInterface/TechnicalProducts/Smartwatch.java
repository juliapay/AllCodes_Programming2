package AbstrakteKlassenInterface.TechnicalProducts;

public class Smartwatch extends Device{

    protected int nrWristsize;

    public Smartwatch(String name, Processor processor, int releaseYear, int nrProduced, int nrWristsize) {
        super(name, processor, releaseYear, nrProduced);
        this.nrWristsize = nrWristsize;
    }

    @Override
    public double calculateProductionCost() {
        double productionCosts=100;
        return nrProduced*(productionCosts+((nrWristsize*10)-10));
    }

    @Override
    public double calculateSupportCostForAYear(int Year) {

        return (10*processor.getNrCores())*nrProduced;
    }

    public int getNrWristsize() {
        return nrWristsize;
    }

    public void setNrWristsize(int nrWristsize) {
        this.nrWristsize = nrWristsize;
    }

    @Override
    public String toString() {
        return "Smartwatch " + name + ":" +nrProduced;
    }

}