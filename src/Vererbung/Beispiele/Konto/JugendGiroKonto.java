package Vererbung.Beispiele.Konto;

public class JugendGiroKonto extends GiroKonto {
//subklasse von girokonto und konto
    private double buchungsLimit;

    public JugendGiroKonto(String inhaber, double limit, double buchungsLimit) {
        super(inhaber, limit);//constructor -uebernahme von girokonto
        this.buchungsLimit = buchungsLimit;


    }

    @Override
    public void einzahlen(double wert) {
        super.einzahlen(wert);//berechnung aus der superklasse Konto wird angewendet kontostand+wert
    }

    @Override
    public double auszahlen(double wert) {
        if (wert < buchungsLimit) {//condition fuer max abhebungsberag
            if (kontoStand - wert > 0 - limit) {//contition fuer girokontorahmen
                System.out.println("Es wurden "+wert+" vom JugendGiroKonto abgehoben");//hier ueberschreibung in der subklasse
                System.out.println("JugendGiroKonto Kontostand "+kontoStand);//hier ueberschreibung in der subklasse
                return super.auszahlen(wert);//berechnung aus der superklasse Konto wird angewendet kontostand-wert
            } else {
                System.out.println("Das Konto darf nur bis " + (0 - limit) + " überzogen werden.");
                return 0.0;
            }
        } else {
            System.out.println("Es sind nur Auszahlungen bis maximal " + buchungsLimit + " möglich!");
            return 0.0;
        }

    }

}
