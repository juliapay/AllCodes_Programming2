package AbstrakteKlassenInterface.Kintergarten;

import A_aCheatSheet.Comparable_CheatSheet;

import java.util.Comparator;

public class AgeComparator implements Comparator<Kind> {

    public int compare(Kind o1, Kind o2) { //method name is compare!
        // Compare based on the int value
        int cmp = Integer.compare(o1.getAge(), o2.getAge());
        return cmp;

    }
}
