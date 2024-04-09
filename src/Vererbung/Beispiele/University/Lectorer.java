package Vererbung.Beispiele.University;

public class Lectorer extends Person {
    private String favoriteTopic;

    public Lectorer(String name, String favTopic) {
        super(name);
        this.favoriteTopic = favTopic;
    }

    @Override
    public void getInfo() {
        System.out.println("Lectorer " + name + " loves talking about " + favoriteTopic);
        super.getInfo();
    }
}
