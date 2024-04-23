package AbstrakteKlassenInterface.TechnicalProducts;

public class Tablet extends Device {

    protected int arCameras;

    public Tablet(String name, Processor processor, int releaseYear, int nrProduced, int arCameras) {
        super(name, processor, releaseYear, nrProduced);
        this.arCameras = arCameras;
    }

    @Override
    public double calculateProductionCost() {

        double productionCosts=0+(arCameras*50);

        if (getProcessor().getGeneration() == 1) {
            if (getProcessor().getNrCores() == 1) {
                productionCosts = 150;
            } else if (getProcessor().getNrCores() >= 2) {
                productionCosts = 200;
            }
        } else if (getProcessor().getGeneration() == 2) {
            if (getProcessor().getNrCores() <=3) {
                productionCosts = 350;
            } else if (getProcessor().getNrCores() >3||getProcessor().getNrCores() <8) {
                productionCosts = 400;
            } else if (getProcessor().getNrCores() >=8) {
                productionCosts = 450;
            }
        } else if (getProcessor().getGeneration() >=3) {
            productionCosts = 700;
        }
        return productionCosts;
    }

    @Override
    public double calculateSupportCostForAYear(int Year) {
        if (releaseYear==Year){
            return 50*nrProduced;
        }else if(Year>releaseYear||Year<releaseYear+10){
            return (50-((Year-releaseYear)*0.1))*nrProduced;
        }else {
            return 0;
        }
    }

    public int getArCameras() {
        return arCameras;
    }

    public void setArCameras(int arCameras) {
        this.arCameras = arCameras;
    }

    @Override
    public String toString() {
        return "Tablet" + name + ":" + nrProduced;
    }

}