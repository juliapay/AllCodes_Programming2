package AbstrakteKlassenInterface.MitarbeiterInnen;

public class PercentCommissionEmployee extends  Employee{

    protected double percentCommission;

    public PercentCommissionEmployee(String lastName, String firstName, String department, double baseSalary, double percentCommission) {
        super(lastName, firstName, department, baseSalary);
        this.percentCommission = percentCommission;
    }

    @Override
    public double getFullsalary() {
        return baseSalary+(baseSalary*(percentCommission/100));
    }
    @Override
    public String toString() {
        return super.toString()+getFullsalary();
    }
}
