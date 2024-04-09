package Vererbung.Beispiele.Person;

public class Person {
    private String firstName;
    private String lastName;

    public Person(String lastName) {
        this.lastName = lastName;
    }

    public void doSomething(String firstName){
        System.out.println(firstName+" jumps!");
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }
}
