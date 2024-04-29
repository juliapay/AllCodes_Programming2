package A_aCheatSheet;

import AbstrakteKlassenInterface.Enten.Ente;
import AbstrakteKlassenInterface.Kintergarten.Kind;
import AbstrakteKlassenInterface.Konzert.NFCTicket;

import java.util.*;

public class HashMap_CheatSheet {

    // CREATION: Declaration in a class (didn't initialize it but it works)---------------------------
    HashMap<Integer, String> newHashMap; // <String, Integer>, <String, String>, etc
List<MyObject>arrayList=new ArrayList<>();
    //DUMMY CONSTRUCTOR
    public HashMap_CheatSheet() {

        this.newHashMap = new HashMap<>();
    }

    // REMOVING AN ENTRY FROM HASHMAP WITHOUT USING ITERATOR
    public void removeEntry(HashMap<Integer, String> hashMap, Integer keyToRemove) { //2 parameters: map and key
        hashMap.remove(keyToRemove);
    }

    // ADDING KEY-VALUE PAIRS TO HASHMAP------------------------------------------
    public void addKeyValuePair(Integer key, String value) { //ex. (String name, Integer number)
        newHashMap.put(key, value);
    }

    // PRINTING THE CONTENTS OF A HASHMAP--------------------------------
    public static void printHashmap2(HashMap<Integer, Integer> map) {
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    // FINDING THE ENTRY IN A HASHMAP WITH THE LOWEST KEY-------
    public Map.Entry<Integer, String> findEntryWithLowestKey(HashMap<Integer, String> newHashMap) {
        Map.Entry<Integer, String> entryWithLowestKey = null;
        Integer lowestKey = null;
        Integer tempKey = 0;

        for (Map.Entry<Integer, String> entry : newHashMap.entrySet()) {
            tempKey = entry.getKey();
            if (lowestKey == null || tempKey < lowestKey) {
                lowestKey = tempKey;
                entryWithLowestKey = entry;
            }
        }
        return entryWithLowestKey;
    }

    // FINDING THE ENTRY IN A HASHMAP WITH THE HIGHEST KEY-------
    public Map.Entry<Integer, String> findEntryWithHighestKey(HashMap<Integer, String> newHashMap) {
        Map.Entry<Integer, String> entryWithHighestKey = null;
        Integer highestKey = null;
        Integer tempKey = null;
        for (Map.Entry<Integer, String> entry : newHashMap.entrySet()) {
            tempKey = entry.getKey();
            if (highestKey == null || tempKey > highestKey) {
                highestKey = tempKey;
                entryWithHighestKey = entry;
            }
        }
        return entryWithHighestKey;
    }

    //CREATE A HASHMAP FROM AN ARRAYLIST---------------------
    //Objects in the list must follow <Integer, String> attributes
    public HashMap<Integer, String> createdHashMapFromAnArrayList(ArrayList<MyObject> arrayList) {
        HashMap<Integer, String> createdHashMap = new HashMap<>();
        for (MyObject item : arrayList) {
            Integer key = item.getoKey(); //retrieve/extract the Integer value
            String value = item.getoValue(); //retrieve/extract the String value
            createdHashMap.put(key, value); //save the retrieved values to a Hashmap entry
        }
        return createdHashMap;
    }

    // PRINTING A HASHMAP USING ITERATOR
    public void printHashMapUsingIterator(HashMap<Integer, String> hashMap) {
        Iterator<Map.Entry<Integer, String>> iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }

    // USING ITERATOR: FIND A HASHMAP ENTRY WITH THE HIGHEST KEY
    public Map.Entry<Integer, String> findEntryWithHighestKeyUsingIterator(HashMap<Integer, String> hashMap) {
        Iterator<Map.Entry<Integer, String>> iterator = hashMap.entrySet().iterator();
        Map.Entry<Integer, String> entryWithHighestKey = null;
        Integer highestKey = null;

        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            Integer key = entry.getKey();

            if (highestKey == null || key > highestKey) {
                highestKey = key;
                entryWithHighestKey = entry;
            }
        }
        return entryWithHighestKey;
    }

    // REMOVING AN ENTRY FROM HASHMAP USING ITERATOR
    public void removeEntryUsingIterator(HashMap<Integer, String> hashMap, Integer keyToRemove) {
        Iterator<Map.Entry<Integer, String>> iterator = hashMap.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            Integer key = entry.getKey();

            if (key.equals(keyToRemove)) {
                iterator.remove();
                break; // Stop iterating after the first matching key is removed
            }
        }
    }

    // -----HASHMAP STRING DOUBLE  STRING GETVALUE   DOUBE SUMME ALLER VALUES
    HashMap<String, Double> getSumPriceEventsByOrt(ArrayList<MyObject> arrayList) { //Get the sum cost of all items with the same name
        HashMap<String, Double> newHashmapCreated = new HashMap<>(); //The hashmap should contain "name" + totalSum
        String name;
        double cost;
        double currentSum;

        for (MyObject item : arrayList) {
            name = item.getoValue();
            cost = item.getoKey();

            if (newHashmapCreated.containsKey(name)) {
                currentSum = newHashmapCreated.get(name);
                newHashmapCreated.put(name, currentSum + cost);
            } else {
                newHashmapCreated.put(name, cost);
            }
        }
        return newHashmapCreated;
    }
// ---------HASHMAP INTEGER INTEGER -----VALUE IST DIE ANZAHL ALLER VALUES!-------
    public HashMap<Integer, Integer> getAnzahlMusikantenMitBeinAnzahl(ArrayList<MyObject> arrayList) {
        HashMap<Integer, Integer> beineAnzahl = new HashMap<>();
        if (arrayList != null) {
            for (MyObject m : arrayList) {
                if (beineAnzahl.containsKey(m.valueYouAreSearchingFor())) {
                    beineAnzahl.put(m.valueYouAreSearchingFor(), beineAnzahl.get(m.valueYouAreSearchingFor()) + 1);
                } else {
                    beineAnzahl.put(m.valueYouAreSearchingFor(), 1);
                }
            }
        }
        Set<Integer> keyset = beineAnzahl.keySet();
        for (Integer s : keyset) {
            System.out.println(beineAnzahl.get(s) + " Tiere haben " + s + " Beine");
        }
        return beineAnzahl;
    }
    //-------------HASHMAP INTEGER DOUBLE    VALUE = SUMME DER ADDIERTEN VALUES MIT PROZENTRECHNUNG INKLUDIERT!

  /*  public  HashMap<Integer,Double> dontionKategory(){
        HashMap<Integer,Double> donationsPerCategory=new HashMap<>();

        if (besucher!=null){
            for (NFCTicket t:besucher) {
            //hier casting erforderlich!!! da sonst 0!!!
                double sum=(double)(4-t.getCategory())/10;

                if(donationsPerCategory.containsKey(t.getCategory())){
                    double currentDonation = donationsPerCategory.get(t.getCategory());
                    donationsPerCategory.put(t.getCategory(),currentDonation+(t.getProfit()*sum));
                }else {
                    donationsPerCategory.put(t.getCategory(),(t.getProfit()*sum));
                }
            }
        }
        Set<Integer> keyset= donationsPerCategory.keySet();
        for (Integer s:keyset) {
            System.out.println("durch die Kategorie "+s+" wurden "+donationsPerCategory.get(s)+" gespendet.");
        }


        return donationsPerCategory;
    }

   */
    //---------HASHMAP INTEGER DOUBLE  WIE OBEN NUR HARDGECODET!

    public HashMap<String, Double> getAreaBySizeCategories() {
        HashMap<String, Double> sizeByCategories = new HashMap<>();

        for (MyObject f : arrayList) {
            if (f.valueYouAreSearchingFor() < 1000) {
                Double currentArea = sizeByCategories.getOrDefault("Klein", 0.0);
                sizeByCategories.put("Klein",currentArea+f.valueYouAreSearchingFor());
            }
            else  if (f.valueYouAreSearchingFor() >= 1000 && f.valueYouAreSearchingFor() < 4999) {
                Double currentArea = sizeByCategories.getOrDefault("Mittel", 0.0);
                sizeByCategories.put("Mittel",currentArea+f.valueYouAreSearchingFor());
            }
            else if (f.valueYouAreSearchingFor() > 5000) {
                Double currentArea = sizeByCategories.getOrDefault("Groß", 0.0);
                sizeByCategories.put("Groß",currentArea+f.valueYouAreSearchingFor());
            }
        }

        Set<String> keyset = sizeByCategories.keySet();
        for (String s : keyset) {
            System.out.println("Die Summe der Kategorie "+s + " beträgt " +sizeByCategories.get(s));
        }

        return sizeByCategories;
    }

    //----HASHMAP INTEGER ARRAYLIST ---

    public HashMap<Integer, ArrayList<MyObject>> getGetraenkeAufgeteiltNachZutaten() {
        HashMap<Integer, ArrayList<MyObject>> getraenkeListesortiertNachAnzahlDerZutaten= new HashMap<>();
        if(arrayList!=null){
            for (MyObject g:arrayList) {
                if (getraenkeListesortiertNachAnzahlDerZutaten.containsKey(g.valueYouAreSearchingFor())) {
                    //hier wird in die vorhandene liste gespeichert
                    ArrayList<MyObject>gesamt=getraenkeListesortiertNachAnzahlDerZutaten.get(g.valueYouAreSearchingFor());
                    gesamt.add(g);
                }else{
                    //hier wird die Liste für den key deklariert und initialisiert
                    ArrayList<MyObject>gesamt=new ArrayList<>();
                    gesamt.add(g);
                    //und der Hashmap dem entsprechenden Key zugeordnet
                    getraenkeListesortiertNachAnzahlDerZutaten.put(g.valueYouAreSearchingFor(),gesamt);
                }
            }
        }
        Set<Integer> keyset = getraenkeListesortiertNachAnzahlDerZutaten.keySet();
        for (Integer s : keyset) {
            System.out.println(s + " Zutaten haben diese Getränke: " + getraenkeListesortiertNachAnzahlDerZutaten.get(s));
        }

        return getraenkeListesortiertNachAnzahlDerZutaten;
    }

    //--------HASHMAP INTEGER LIST------INTEGER GETVALUE

    public HashMap<Integer,List<MyObject>> sortiertKinderNachAlterInListen(){
        HashMap<Integer,List<MyObject>>  sortierNachAlterInListen=new HashMap<>();

        if(arrayList!=null){
            for (MyObject k:arrayList) {
                if(sortierNachAlterInListen.containsKey(k.valueYouAreSearchingFor())){
                    List<MyObject>gesamt= sortierNachAlterInListen.get(k.valueYouAreSearchingFor());
                    gesamt.add(k);
                }else{
                    List<MyObject>gesamt= new ArrayList<>();
                    gesamt.add(k);
                    sortierNachAlterInListen.put(k.valueYouAreSearchingFor(),gesamt);
                }
            }
        }

        Set<Integer> keyset=sortierNachAlterInListen.keySet();
        for (Integer s:keyset) {
            System.out.println("Kinder mit "+s+" Jahre: "+sortierNachAlterInListen.get(s));
        }
        return sortierNachAlterInListen;
    }
    //----------HASHMAP INTEGER LIST ----INTEGER HARCODE
 /*
        public Map<Integer, List<Ente>> getGruppierteEnten() {

        HashMap<Integer, List<Ente>> entenNachGewicht = new HashMap<>();
        List<Ente> tiny = new ArrayList<>();
        List<Ente> medium = new ArrayList<>();
        List<Ente> big = new ArrayList<>();
//        hier wird nur eine referenze auf die liste inder hashmap ertstellt
//        deswegen kann das hashmap.put auch vor der befüllung passieren
        entenNachGewicht.put(100,tiny);
        entenNachGewicht.put(200,medium);
        entenNachGewicht.put(200,big);


        for (Ente f : enten) {
            if (f.getfullWeight() < 100) {

                entenNachGewicht.put(100, tiny);
                tiny.add(f);
            } else {
                if (f.getfullWeight() <= 200) {
                    entenNachGewicht.put(200, medium);
                    medium.add(f);
                } else if (f.getfullWeight() <= 300) {
                    entenNachGewicht.put(300, big);
                    big.add(f);
                }
            }
        }

        return entenNachGewicht;
    }
*/

// HASHMAP AUSGABE KONSOLE

    //       Set<Integer> keyset = beineAnzahl.keySet();
    //       for (Integer s : keyset) {
    //           System.out.println(beineAnzahl.get(s) + " Tiere haben " + s + " Beine");
    //      }


}