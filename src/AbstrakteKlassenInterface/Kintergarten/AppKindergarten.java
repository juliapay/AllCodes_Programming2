package AbstrakteKlassenInterface.Kintergarten;

public class AppKindergarten {
    public static void main(String[] args) {
        Kindergartenklasse kindergartenklasse = new Kindergartenklasse("4a");
        kindergartenklasse.addKind(new Kind("Martha","Meier",3));
        kindergartenklasse.addKind(new Kind("Anton","Meier",4));
        kindergartenklasse.addKind(new Kind("Susi","Huller",5));
        kindergartenklasse.addKind(new Kind("Andrea","Haber",3));
        Kind k1 = new Kind("Furkan", "Atas", 3);
        Kind k2 = new Kind("Bina", "Atas", 5);
        Kind k3 = new Kind("Daniel", "Brnic", 4);
        Kind k4 = new Kind("Mathilda", "Sauer", 5);
        kindergartenklasse.addKind(k1);
        kindergartenklasse.addKind(k2);
        kindergartenklasse.addKind(k3);
        kindergartenklasse.addKind(k4);
        System.out.println(kindergartenklasse);

        kindergartenklasse.sortAge();
        System.out.println("----------------------------");
        kindergartenklasse.sortAlphabetical();
        System.out.println("----------------------------");
        kindergartenklasse.sortiertKinderNachAlterInListen();
    }
}
