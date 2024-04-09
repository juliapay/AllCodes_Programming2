package Vererbung.Beispiele.RabbitHole;

public class Hedgehog implements PartyGoer{
private int nrSpikes;
private String name;

    public Hedgehog(int nrSpikes,String name) {
        this.nrSpikes = nrSpikes;
        this.name=name;
    }

    @Override
    public void party(String bringsWith) {
        System.out.println(name+" brings "+ bringsWith);
    }

    public int getNrSpikes() {
        return nrSpikes;
    }

    public void setNrSpikes(int nrSpikes) {
        this.nrSpikes = nrSpikes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
