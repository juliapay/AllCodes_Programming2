package Vererbung.Beispiele.MitarbeiterInnen;

public class PercentCommissionEmployee extends Employee{

    private double percentCommission;

    public PercentCommissionEmployee(String lastName, String firstName, String department, double baseSalary, double percentCommission) {
        super(lastName, firstName, department, baseSalary);//UEBERNAHME VON DER SUPERKLASSE
        this.percentCommission = percentCommission;//WICHTIG FUER BERECHNUNG
    }

    @Override
    public double getFullSalary() {
        return super.getFullSalary()*0.1+super.getFullSalary();//ADDITIONALCOMMISSION MUSS IM CONSTRUCTOR SEIN SONST WIRD ES NICHT BERECHNET
    }
}
