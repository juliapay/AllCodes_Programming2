package AbstrakteKlassenInterface.MitarbeiterInnen;

public class FixComissionEmployee extends  Employee{

    protected double additionalCommission;

    public FixComissionEmployee(String lastName, String firstName, String department, double baseSalary, double additionalCommission) {
        super(lastName, firstName, department, baseSalary);
        this.additionalCommission = additionalCommission;
    }

    @Override
    public double getFullsalary() {
        return super.getFullsalary()+additionalCommission;
    }

    @Override
    public String toString() {
        return super.toString()+getFullsalary();
    }
}
