package Vererbung.Beispiele.Konto;

public class SparKonto extends Konto{
    //subklasse von konto

    public SparKonto(String inhaber) {
        super(inhaber);
    }

    @Override
    public double auszahlen(double wert) {
        if (kontoStand-wert>=0.0){//Ueberschreibugn der subklasse
            System.out.println("Es wurden "+wert+" vom sparkonto abgehoben");
            System.out.println("Sparkonto Kontostand "+kontoStand);
            return super.auszahlen(wert);//berechnung aus der superklasse wird angewendet kontostand-wert

        }else{
            System.out.println("Es sind nur Abbuchungen vom Sparkonto bis "+kontoStand+" möglich.");
            return 0.0;
        }

    }
}
