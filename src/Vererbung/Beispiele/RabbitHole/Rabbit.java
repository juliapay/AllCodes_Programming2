package Vererbung.Beispiele.RabbitHole;

public class Rabbit implements PartyGoer {
    private String name;

    public Rabbit(String name) {
        this.name = name;
    }

    public void rabbitSleep(){
        System.out.println(name+" sleeps: chchch");
    }

    public void rabbitHop(){
        System.out.println(name+" hops");
    }
    public void rabbitEat(){
        System.out.println(name+" eats");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void party(String bringsWith) {
        System.out.println("Rabbit "+name+" goes to party and brings "+bringsWith);
    }
}
