package AbstrakteKlassenInterface.MitarbeiterInnen;

import java.util.Comparator;

public class GehaltComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        // Compare based on the int value
        int keyComparison = Double.compare(o1.getFullsalary(),o2.getFullsalary()); // the class being compared must have compareTo method.
        if (keyComparison != 0) {
            return keyComparison;
        }
        // If first values are the same, sort based on the 2nd value
        return o1.lastName.compareTo(o2.lastName);
    }
}
