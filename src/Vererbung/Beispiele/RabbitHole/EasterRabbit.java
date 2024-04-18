package Vererbung.Beispiele.RabbitHole;

public class EasterRabbit extends Rabbit{


    public EasterRabbit(String name, int age, int nrCarrots) {
        super(name, age, nrCarrots);
    }

    @Override
    public void rabbitHop() {
        System.out.println(getName()+" hides eastereggs");
    }
}
