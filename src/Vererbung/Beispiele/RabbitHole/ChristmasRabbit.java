package Vererbung.Beispiele.RabbitHole;

public class ChristmasRabbit extends Rabbit{
    public ChristmasRabbit(String name, int age, int nrCarrots) {
        super(name, age, nrCarrots);
    }

    public  void bringsPresents(){
        System.out.println(getName()+" brings presents");
    }

    @Override
    public void party(String bringsWith) {
        System.out.println(getName()+ " throws away "+bringsWith+
                " and brings carrot cake to party");
    }
}
