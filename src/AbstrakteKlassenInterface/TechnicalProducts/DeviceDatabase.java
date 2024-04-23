package AbstrakteKlassenInterface.TechnicalProducts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DeviceDatabase {
    private List<Device> devices;

    public DeviceDatabase() {
        this.devices = new ArrayList<>();
    }

    public void addDevice(Device device) {
        devices.add(device);
    }

    public double calculateSumOfProductionCosts() {
        double sum = 0;
        for (Device d : devices) {
            sum += d.calculateProductionCost();
        }
        return sum;
    }

    public Device findDeviceWithCheapestProductionCost() {
        Device lowest = null;
        double cheapestOrLowestX = 0;
        double temp = 0;
        for (Device item : devices) {
            temp = item.calculateProductionCost();
            if (lowest  == null || temp < cheapestOrLowestX ) {
                lowest  = item;
                cheapestOrLowestX  = temp;
            }
        }
        return lowest;
    }

    public double calculateSupportCostUntilYear(Device device, int year){
        if (device.releaseYear>year){
            return  0;
        }
        return device.calculateSupportCostForAYear(device.releaseYear-year);
    }
    public Device findDeviceWithHighestSupportCost(int year){
        Device highest = null;
        double highestX= 0;
        double temp = 0;
        for (Device item : devices) {
            if (item.releaseYear==year){
            temp = item.calculateProductionCost();
            if (temp > highestX ) {
                highest  = item;
                highestX = temp;
            }
        }
        }
        return highest;
    }

    public ArrayList<Device> findDevicesThatFullfillMinimumPerformance(HashMap<Integer,Integer>minimum){
        ArrayList<Device> erg = new ArrayList<>();

        for(Device d : devices){
            Integer cores = minimum.get(d.getProcessor().getGeneration());
            if(cores != null && d.getProcessor().getNrCores() >= cores){
                erg.add(d);
            }
        }

        return erg;
    }

    public HashMap<String,Integer> numberDevicesGroupedByConstructionCost(double lowBorder,double mediumBorder){
        HashMap<String, Integer> groupedByConstructionCosteCatagories = new HashMap<>();
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        for (Device f : devices) {
            if (f.calculateProductionCost() < lowBorder) {
                sum1 ++;
                groupedByConstructionCosteCatagories.put("low", sum1);
            }
            if (f.calculateProductionCost() >= lowBorder || f.calculateProductionCost() < mediumBorder) {
                sum2 ++;
                groupedByConstructionCosteCatagories.put("medium", sum2);
            }
            if (f.calculateProductionCost() > mediumBorder) {
                sum3 ++;
                groupedByConstructionCosteCatagories.put("high", sum3);
            }
        }
        return groupedByConstructionCosteCatagories;
    }
    public  void sortedPrint(){

    }
    public List<Device> getDevices() {
        return devices;
    }
}