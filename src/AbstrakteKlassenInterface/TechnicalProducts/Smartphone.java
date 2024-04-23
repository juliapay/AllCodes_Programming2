package AbstrakteKlassenInterface.TechnicalProducts;

public class Smartphone extends Device {

    protected int nrCameras;

    public Smartphone(String name, Processor processor, int releaseYear, int nrProduced, int nrCameras) {
        super(name, processor, releaseYear, nrProduced);
        this.nrCameras = nrCameras;
    }

    @Override
    public double calculateProductionCost() {
       double sum= (processor.getGeneration() * 100 + 20);
        if (nrProduced > 100000 && nrProduced < 10000000) {
            return nrProduced*(sum * 0.1);
        }
        if (nrProduced > 10000000) {
            return nrProduced*(sum* 0.2);
        }
        return nrProduced*sum;
    }

    @Override
    public double calculateSupportCostForAYear(int Year) {
        if (Year==releaseYear||Year==releaseYear+1){
            return 0;
        }
        else{
           return nrProduced*(processor.getGeneration()*40);
        }
    }

    public int getNrCameras() {
        return nrCameras;
    }

    public void setNrCameras(int nrCameras) {
        this.nrCameras = nrCameras;
    }

    @Override
    public String toString() {
        return "Smartphone " + name + ":" + nrProduced;
    }
}