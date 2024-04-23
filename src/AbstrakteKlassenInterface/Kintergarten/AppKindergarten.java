package AbstrakteKlassenInterface.Kintergarten;

public class AppKindergarten {
    public static void main(String[] args) {
        Kindergartenklasse kindergartenklasse = new Kindergartenklasse("4a");
        kindergartenklasse.addKind(new Kind("Martha","Meier",3));
        kindergartenklasse.addKind(new Kind("Anton","Meier",4));
        kindergartenklasse.addKind(new Kind("Susi","Huller",5));
        kindergartenklasse.addKind(new Kind("Andrea","Haber",3));
        System.out.println(kindergartenklasse);
        kindergartenklasse.sortAge();
        kindergartenklasse.sortAlphabetical();
    }
}
