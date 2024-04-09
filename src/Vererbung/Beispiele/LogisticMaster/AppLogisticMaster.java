package Vererbung.Beispiele.LogisticMaster;

public class AppLogisticMaster {
    public static void main(String[] args) {
        Shirt s = new Shirt("Diesel","red","XXL");
        Car c = new Car("VW Golf","blue",123456.045);
        LogisticMaster l = new LogisticMaster();
        l.addMoveable(s);
        l.addMoveable(c);
        Europalettes e = new Europalettes("white");
        l.addMoveable(e);

        l.moveAll("Graz");
    }
}
