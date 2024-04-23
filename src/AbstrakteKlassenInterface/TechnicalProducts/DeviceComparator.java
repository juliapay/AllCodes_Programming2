package AbstrakteKlassenInterface.TechnicalProducts;

import java.util.Comparator;

public class DeviceComparator implements Comparator<Device>{


    @Override
    public int compare(Device o1, Device o2) {
        int keyComparison = Integer.compare(o1.getProcessor().getGeneration(),o2.getProcessor().getGeneration()); // the class being compared must have compareTo method.
        if (keyComparison != 0) {
            return keyComparison;
        }
        // If first values are the same, sort based on the 2nd value
        return Integer.compare(o1.getProcessor().getNrCores(),o2.getProcessor().getNrCores());
    }
}