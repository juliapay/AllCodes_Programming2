package AbstrakteKlassenInterface.Figures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class FigureManager {
    //CLASS FOR METHOD MANAGING
    //FIELD ARRAYLIST
    protected List<Figure> figures;

    //CONSTRUCTOR
    public FigureManager() {
        this.figures = new ArrayList<>();//INTIALISING FIGURES
    }

    //METHOD FOR ADDING FIGURE
    public void addfigures(Figure f) {
        if (!figures.contains(f)) {//CONDITION FOR EMPTY PLACE
            figures.add(f);
        }
    }

    // METHOD FOR MAX PERIMETER OF ALL FIGURES
    public double getMaxPerimeter() {
        double maxPerimeter = 0;
        for (Figure f : figures) {
            if (f.getPerimeter() > maxPerimeter) {
                maxPerimeter = f.getPerimeter();
            }
        }
        return maxPerimeter;
    }

    //METHOD FOR GETTING THE AVERAGE SIZE OF ALL FIGURES
    public double getAverageSize() {
        double counter = 0;
        double sum = 0;
        for (Figure f : figures) {
            sum += f.getArea();
            counter++;
        }
        return sum / counter;
    }

    //METHOD RETURNVALUE HASHMAP FOR CATEGORIZING THE AREAS
    public HashMap<String, Double> getAreaBySizeCatagories() {
        HashMap<String, Double> areaBySizeCatagories = new HashMap<>();
        double sum1 = 0;
        double sum2 = 0;
        double sum3 = 0;
        for (Figure f : figures) {
            if (f.getArea() < 1000) {
                sum1 += f.getArea();
                areaBySizeCatagories.put("Klein", sum1);
            }
            if (f.getArea() >= 1000 || f.getArea() < 4999) {
                sum2 += f.getArea();
                areaBySizeCatagories.put("Mittel", sum2);
            }
            if (f.getArea() > 5000) {
                sum3 += f.getArea();
                areaBySizeCatagories.put("Groß", sum3);
            }
        }
        return areaBySizeCatagories;
    }

    public void printHashMap() {
        Set<String> keySet = getAreaBySizeCatagories().keySet();
        for (String s : keySet) {
            System.out.println(s + " -> " + getAreaBySizeCatagories().get(s) + " sum of areas");
        }
    }
}
