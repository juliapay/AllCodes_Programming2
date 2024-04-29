package Vererbung.Beispiele.HashMaps;

import Vererbung.Beispiele.RabbitHole.ChristmasRabbit;
import Vererbung.Beispiele.RabbitHole.EasterRabbit;
import Vererbung.Beispiele.RabbitHole.Rabbit;

import java.util.*;

public class AppHashMaps {
    public static void main(String[] args) {
        // Wiederholung Hashmap
        //Key: Eindeutiges Häschenindentifikationsnummer
        //Value: Hasenobjekt

        HashMap<Integer, Rabbit> register = new HashMap();

        Rabbit r1 = new Rabbit("Hasi",2,34);
        Rabbit r2 = new Rabbit("Stupsi",3,13);
        Rabbit r3 = new EasterRabbit("Mr.Easter",5,36);
        Rabbit r4 = new ChristmasRabbit("Snowi",3,78);

        register.put(1001, r1);
        register.put(1002, r2);
        register.put(1003, r3);
        register.put(1004, r4);
        //register.put(1001,r4); wert unter dem schluessel wird ueberschrieben


        //remove
        //kann man ueberpruefen ob schluessel schon in hashmap ist
        register.containsKey(1001);
        if (register.containsKey(1001)) {
            System.out.println("yeah 1001 schon registriert");
        }
        //get: wenn wir den schluessel kennen, kann man Wert lesen
        Rabbit r = register.get(1002);
        if (r != null) {
            //erwarten uns stupsi
            System.out.println(r.getName());
        }
        // remove: entfernen key/value pair aus der hasmap
        //register.remove(1002);

        //Variante 1: keyset wir iterieren nicht über die werte
        // sondern über den key
        for (Integer rabbitId : register.keySet()) {

            Rabbit ra = register.get(rabbitId);
            System.out.println(ra.getName());

        }
        //variante 2 direkt ueber hasenobjekte iterieren
        for (Rabbit re : register.values()) {
            System.out.println(re.getName());
        }
        //variante 3: bekomme schluessel und value ueber entry objekt

        for (Map.Entry<Integer, Rabbit> rabbitEntry : register.entrySet()) {
            System.out.print(rabbitEntry.getKey());
            System.out.println(" " + rabbitEntry.getValue().getName());
        }


        // EINE NEUE HASHMAP
        //key = Integer, Wert ist eine Liste von Strings
        // Map<Integer, Map<String,List<String>>> specialMap=new HashMap<>();

        Map<Integer, List<String>> specialList = new HashMap<>();
        List<String> graz = new ArrayList<>();
        graz.add("Uhrturm");
        graz.add("Kunsthaus");
        graz.add("Doppelwendeltreppe");

        //alternativer Weg ueber collection
        Iterator<String> iter = graz.iterator();
        System.out.println("---- ITERATOR-----");
        while (iter.hasNext()){
            String str = iter.next();
            System.out.println(str);
        }

        List<String> wien = new ArrayList<>();
        wien.add("Riesenrad");
        wien.add("Belvedere");
        wien.add("Stephansdom");
        specialList.put(8010,graz);
        specialList.put(1010,wien);
        System.out.println("----------------------------");
        for (Integer postleitzahl: specialList.keySet()) {
            List<String> extra = specialList.get(postleitzahl);
            for (String s : extra) {
                System.out.println(s);
            }
        }
            System.out.println("------------------------");
            List <String> grazAttr= specialList.get(8010);
            for (String a: grazAttr){
                System.out.println(a);
            }



        //WRAPPER KLASSEN
        Integer i;
        i = Integer.valueOf(7);//so sollten wir das machen
        i = 14;// 14= primitiver datentyp i= komplexer Datentyp
        //autoboxing/autboxing == wird automatisch umgewandelt


    }
}
