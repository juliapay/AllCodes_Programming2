package Vererbung.Beispiele.RabbitHole;

public class EasterRabbit extends Rabbit{
    public EasterRabbit(String name) {
        super(name);
    }

    @Override
    public void rabbitHop() {
        System.out.println(getName()+" hides eastereggs");
    }
}
