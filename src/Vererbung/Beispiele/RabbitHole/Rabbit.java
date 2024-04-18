package Vererbung.Beispiele.RabbitHole;

public class Rabbit implements PartyGoer {
    private String name;
    protected int age;
    protected int nrCarrots;

    public Rabbit(String name,int age,int nrCarrots) {
        this.name = name;
        this.age= age;
        this.nrCarrots=nrCarrots;
    }

    public int getAge() {
        return age;
    }

    public int getNrCarrots() {
        return nrCarrots;
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

    @Override
    public String toString() {
        return "Rabbit " +
                "name='" + name + '\'' +
                " age=" + age +
                " nrCarrots=" + nrCarrots+"\n";
    }
}
