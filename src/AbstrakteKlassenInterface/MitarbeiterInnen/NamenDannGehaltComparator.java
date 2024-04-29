package AbstrakteKlassenInterface.MitarbeiterInnen;

import java.util.Comparator;

public class NamenDannGehaltComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        int cmp=o1.lastName.compareTo(o2.lastName);
        if(cmp!=0){
            return cmp;
        }

        return Double.compare(o1.getFullsalary(),o2.getFullsalary());
    }
}
