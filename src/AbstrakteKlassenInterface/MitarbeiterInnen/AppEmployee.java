package AbstrakteKlassenInterface.MitarbeiterInnen;

public class AppEmployee {
    public static void main(String[] args) {
        FixComissionEmployee f1 = new FixComissionEmployee("Diaz", "Anna", "Sales", 2000.03, 200);
        FixComissionEmployee f2 = new FixComissionEmployee("Alvarez", "Dominia", "Accounting", 3200.45, 300);
        FixComissionEmployee f3 = new FixComissionEmployee("Martinez", "Pablo", "Sales", 1400.90, 100);
        PercentCommissionEmployee p1 = new PercentCommissionEmployee("Diago", "Maria", "Sales", 2556.45, 10);
        PercentCommissionEmployee p2 = new PercentCommissionEmployee("Vengo", "Jose", "Accounting", 2000.60, 20);
        PercentCommissionEmployee p3 = new PercentCommissionEmployee("Condemnato", "Hugo", "Accounting", 3400.21, 15);
        EmployeeManager manager = new EmployeeManager();
  manager.addEmployee(f1);
        manager.addEmployee(f2);
        manager.addEmployee(f3);
        manager.addEmployee(p1);
        manager.addEmployee(p2);
        manager.addEmployee(p3);


        System.out.println("die Gesamtsumme aller Gehaelter betraegt: "+manager.calcTotalSalary());
        manager.getSalaryByDepartment();
        manager.EmployeeSortiertNachGehaltDannNamen();
        System.out.println("-------------------------");
        manager.EmployeeSortiertNacNamenDannGehalt();

    }
}
