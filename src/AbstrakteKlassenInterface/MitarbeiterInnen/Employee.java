package AbstrakteKlassenInterface.MitarbeiterInnen;

public class Employee {
    protected String lastName;
    protected String firstName;
    protected String department;
    protected double baseSalary;

    public Employee(String lastName, String firstName, String department, double baseSalary) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.department = department;
        this.baseSalary = baseSalary;
    }
    public double getFullsalary(){
        return baseSalary;
    }

    @Override
    public String toString() {
        return
                 lastName +" "
                + firstName + " " + department +
                " Gehalt: " ;
    }
}
