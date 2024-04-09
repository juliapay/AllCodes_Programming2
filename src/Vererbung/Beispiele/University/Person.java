package Vererbung.Beispiele.University;

public class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public void getInfo() {
        System.out.println("Person " + name + " enters university!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
