package Vererbung.Beispiele.MitarbeiterInnen;

public class FixComissionEmployee extends Employee{
    //SUBKLASSE VON EMPLOYEE
    private double additionalCommission;

    public FixComissionEmployee(String lastName, String firstName, String department, double baseSalary, double additionalCommission) {
        super(lastName, firstName, department, baseSalary);//UEBERNAHME VON DER SUPERKLASSE
        this.additionalCommission=additionalCommission;//WICHTIG FUER BERECHNUNG
    }

    @Override
    public double getFullSalary() {
        return super.getFullSalary()+additionalCommission;//ADDITIONALCOMMISSION MUSS IM CONSTRUCTOR SEIN SONST WIRD ES NICHT BERECHNET
    }

}
