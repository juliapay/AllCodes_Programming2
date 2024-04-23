package Vererbung.Beispiele.Person;

import java.util.ArrayList;
import java.util.List;

public class Customer extends Person {
    private int customerNumber;
    private List<Address> addresses;



    public Customer(String firstName, String lastName, int customerNumber) {
        super(firstName, lastName);
        this.customerNumber = customerNumber;
        this.addresses = new ArrayList<>();
    }

    public void addAddress(Address a) {
        addresses.add(a);
    }

    @Override
    public String toString() {
        return "Customer: " + getFirstName()+" "+getLastName()+" "+
                "\ncustomerNumber " + customerNumber +
                "\n" +addresses.toString();
    }
}
