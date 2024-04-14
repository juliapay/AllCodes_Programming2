package Vererbung.Beispiele.MitarbeiterInnen;

public class Employee {
    //superklasse
    //attribute die uebernommen werden
    protected String lastName;
    protected  String firstName;
    protected String department;
    protected double baseSalary;
//constructor
    public Employee(String lastName, String firstName, String department, double baseSalary) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.department = department;
        this.baseSalary = baseSalary;
    }

    public double getFullSalary(){
        return baseSalary;
    }

    public String getDepartment() {
        return department;
    }
//fuer consolenausgabe
    public String getLastName() {
        return lastName;
    }
}
