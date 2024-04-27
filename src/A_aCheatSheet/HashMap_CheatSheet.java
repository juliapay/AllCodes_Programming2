package A_aCheatSheet;

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

    // CREATING A HASHMAP FROM AN ARRAYLIST WITH PARTICULAR REQUIREMENT
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
    public HashMap<Integer, ArrayList<MyObject>> getGetraenkeaufgeteiltNachZutaten() {
        HashMap<Integer, ArrayList<MyObject>> getraenkListe = new HashMap<>();
        if (arrayList != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                MyObject g = arrayList.get(i);
                if (getraenkListe.containsKey(g.valueYouAreSearchingFor())) {
                    ArrayList<MyObject> gesamt = getraenkListe.get(g.valueYouAreSearchingFor());
                    gesamt.add(g); // Add directly to the retrieved ArrayList
                } else {
                    ArrayList<MyObject> gesamt = new ArrayList<>();
                    gesamt.add(g);
                    getraenkListe.put(g.valueYouAreSearchingFor(), gesamt);
                }
            }
        }
        Set<Integer> keyset = getraenkListe.keySet();
        for (Integer s : keyset) {
            System.out.println(s + " Zutaten haben diese Getränke " + getraenkListe.get(s));
        }

        return getraenkListe;
    }


// HASHMAP AUSGABE KONSOLE

    //       Set<Integer> keyset = beineAnzahl.keySet();
    //       for (Integer s : keyset) {
    //           System.out.println(beineAnzahl.get(s) + " Tiere haben " + s + " Beine");
    //      }


}