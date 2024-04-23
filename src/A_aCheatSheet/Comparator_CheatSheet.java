package A_aCheatSheet;

//DONT FORGET TO IMPORT NECESSARY LIBRARY

import java.util.Comparator;

//FOR COMPARATOR, YOU HAVE TO MAKE A SEPARATE COMPARATOR CLASS UNLIKE COMPARABLE
//DONT FORGET THE KEYWORD "IMPLEMENTS" COMPARATOR<CLASS/OBJECT NAME> and import utility!!!!
public class Comparator_CheatSheet implements Comparator<Comparable_CheatSheet> { //!!!!!!! <MyObjectClass>

    @Override
    public int compare(Comparable_CheatSheet o1, Comparable_CheatSheet o2) { //method name is compare!
        // Compare based on the int value
        int keyComparison = o1.getoKey2().compareTo(o2.getoKey2()); // the class being compared must have compareTo method.
        if (keyComparison != 0) {
            return keyComparison;
        }

        // If first values are the same, sort based on the 2nd value
        return o1.getoValue2().compareTo(o2.getoValue2());
    }


    /* ------------ANOTHER SAMPLE OF THE COMPARE METHOD FOR COMPARATOR------------------------------------
        @Override
        public int compare(Rabbit o1, Rabbit o2) {

        // if first criteria is the same and you have to sort further

        if (o1.name.compareTo(o2.name) == 0) {
                return o1.name.compareTo(o2.name);
        } else {
            return o1.name.compareTo(o2.name);
        }
    }


      public int compare(Rabbit o1, Rabbit o2) {
        int cmp= Integer.compare(o1.getAge(),o2.getAge());
        if (cmp!=0) {
            //ALTER IST SCHON UNTERSCHIEDLICH
            //MÜSSEN NAMEN NICHT MEHR BERÜCKSICHTIGEN
            return cmp;
        }
        //FALLS ALTER GLEICH IST
        return Integer.compare(o1.getNrCarrots(),o2.getNrCarrots()) ;
        //AUFSTEIGEND SORTIEREN
        //FALLS ABSTEIGEND SORTIERT ZB CMP*-1
    }
        -------------------in der managerklasse:

    public void sortAlphabetical(){
        AlphabeticalComparator alphabeticalComparator= new AlphabeticalComparator();
        Collections.sort(kinder, alphabeticalComparator);
        System.out.println("Getränke sortiert nach Anzahl der Zutaten");
        for(Kind g:kinder){
            System.out.println(g);
        }/

    }

     */

}
