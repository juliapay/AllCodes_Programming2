package Vererbung.Beispiele.Konto;

public class GiroKonto extends Konto{
    //Subklasse von konto
    protected   double limit;
    public GiroKonto(String inhaber, double limit) {
        super(inhaber);
        this.limit=limit;
    }

    @Override
    public void einzahlen(double wert) {
        super.einzahlen(wert);////berechnung aus der superklasse wird angewendet kontostand+wert
    }

    @Override
    public double auszahlen(double wert) {
        if (kontoStand-wert>0-limit){//Condition für das limit
            System.out.println("Es wurden "+wert+" vom GiroKonto abgehoben");
            System.out.println("GiroKonto Kontostand "+kontoStand);
            return super.auszahlen(wert);//berechnung aus der superklasse wird angewendet kontostand-wert
        }else{
            System.out.println("Das GiroKonto darf nur bis "+(0-limit)+ " überzogen werden.");
            return 0.0;//bei überschreitung des limits wird nichts abgebucht!
        }
    }


}
