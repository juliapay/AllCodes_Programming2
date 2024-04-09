package Vererbung.Beispiele.Person;

public class AppPerson {
    public static void main(String[] args) {
        Customer c = new Customer("Pablo", "Escobar", 01);
        c.addAddress(new Address("Street", "here", "Bigcity", "Tinycountry"));
        System.out.println(c);
    }
}
