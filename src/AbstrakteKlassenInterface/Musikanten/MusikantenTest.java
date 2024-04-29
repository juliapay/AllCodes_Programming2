package AbstrakteKlassenInterface.Musikanten;

public class MusikantenTest {
    public static void main(String[] args) {
        Quartett quartett = new Quartett();
        quartett.addMusikant(new Esel(4, new Instrument("IAH", 3), 4));
        quartett.addMusikant(new Hahn(2, new Instrument("Kikeriki", 4), 5));
        quartett.addMusikant(new Hund(4, new Instrument("Wuff", 5), 4));
        quartett.addMusikant(new Katze(3, new Instrument("Fauch", 2), 3));
        System.out.println("sind ca laut: " + quartett.durchschnittlicheLautstaerke());

        System.out.println("sind alle da? " + quartett.istQuartett());
        System.out.println("haben " + quartett.gemeinsameRaeuberVerscheucht() + " Raeuber vescheucht");
        System.out.println("-------------------");
        System.out.println("sind von 1 bis 4 laut: " + quartett.getMusikantenInLautstaerkeBereich(1, 4));
        System.out.println("------------------");
        System.out.println(quartett.getAnzahlMusikantenMitBeinAnzahl());

        System.out.println("---------------");
        quartett.printLautstaerkeAbsteigend();
    }
}
