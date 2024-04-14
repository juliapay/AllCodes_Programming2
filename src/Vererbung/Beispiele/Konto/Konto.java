package Vererbung.Beispiele.Konto;

public class Konto {
    //Basisklasse
    protected String inhaber;
    protected double kontoStand;

    public Konto(String inhaber) {
        this.inhaber = inhaber;
        this.kontoStand = 0.0;//Kontostand wird initialisiert
    }
    public void einzahlen(double wert){
        kontoStand+= wert;//berechnung wird in den sub-klassen aufgerufen
    }
    public double auszahlen(double wert){
        kontoStand-=wert;//berechnung wird in den sub-klassen aufgerufen
        return wert;
    }

    public String getInhaber() {
        return inhaber;
    }

}
