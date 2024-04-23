package AbstrakteKlassenInterface.musikanten;

public class MusikantenTest {
    public static void main(String[] args) {
        Quartett quartett = new Quartett();
        quartett.add(new Esel(4, new Instrument("IAH", 3), 4));
        quartett.add(new Hahn(2, new Instrument("Kikeriki", 4), 5));
        quartett.add(new Hund(4, new Instrument("Wuff", 5), 4));
        quartett.add(new Katze(3, new Instrument("Fauch", 2), 3));
        System.out.println(quartett);
        System.out.println(quartett.durchschnittlicheLautstaerke());
        System.out.println(quartett.gemeinsamRaeuberVerscheucht());
        System.out.println(quartett.getAnzahlMusikantenMitBeinAnzahl());
        System.out.println("---------------------");
        quartett.printLautStaerkeAbsteigend();
        System.out.println("------------------");
        System.out.println(quartett.getMusikantenInLautstaerkeBereich(2, 4));


    }
}
