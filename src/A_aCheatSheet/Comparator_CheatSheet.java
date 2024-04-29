package A_aCheatSheet;

//DONT FORGET TO IMPORT NECESSARY LIBRARY

import java.util.Comparator;

//FOR COMPARATOR, YOU HAVE TO MAKE A SEPARATE COMPARATOR CLASS UNLIKE COMPARABLE
//DONT FORGET THE KEYWORD "IMPLEMENTS" COMPARATOR<CLASS/OBJECT NAME> and import utility!!!!
public class Comparator_CheatSheet implements Comparator<Comparable_CheatSheet> { //!!!!!!! <MyObjectClass>

    //--------------1 INTEGER  2  STRING--------------------
    @Override
    public int compare(Comparable_CheatSheet o1, Comparable_CheatSheet o2) { //method name is compare!
        // Compare based on the int value
        int cmp= Integer.compare(o1.getoKey2(),o2.getoKey2());
        if (cmp!=0) {
            //die zu vergleichenden key sind schon unterschiedlich
            //MÜSSEN nächsten Vergleich NICHT MEHR BERÜCKSICHTIGEN
            return cmp;
        }
        // ween der erste Vergleich gleiche Werte ergibt
        return o1.getoValue2().compareTo(o2.getoValue2());
    }


    /* -----------1. STRING 2.STRING-----------------------------------
        @Override
        public int compare(Rabbit o1, Rabbit o2) {

        // if first criteria is the same and you have to sort further

        if (o1.name.compareTo(o2.name) == 0) {
                return o1.name.compareTo(o2.name);
        } else {
            return o1.name.compareTo(o2.name);
        }
    }

// ---------1 INTEGER 2 INTEGER-----------
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
    */
/*
//-------------------IN DER MANAGERKLASSE

    public void sortAlphabetical(){
        AlphabeticalComparator alphabeticalComparator= new AlphabeticalComparator();
        Collections.sort(kinder, alphabeticalComparator);
        System.out.println("Getränke sortiert nach Anzahl der Zutaten");
        for(Kind g:kinder){
            System.out.println(g);
        }
    }
        public void printGetraenkesortiertNachAnzahlZutaten(){
        AnzahlZutatenComparator anzahlZutatenComparator=new AnzahlZutatenComparator();
        Collections.sort(getraenke,anzahlZutatenComparator);
        System.out.println(getraenke);
    }

     */

}
