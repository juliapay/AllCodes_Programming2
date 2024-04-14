package Vererbung.Beispiele.MitarbeiterInnen;
public class AppEmployees {
    public static void main(String[] args) {
        FixComissionEmployee e = new FixComissionEmployee("Doe", "Jane", "Sales", 2300.00, 300.00);
        FixComissionEmployee f = new FixComissionEmployee("Moe", "Dane", "Management", 4300.00, 800.00);
        PercentCommissionEmployee h = new PercentCommissionEmployee("Coe", "Kane", "Sales", 4300.00, 10.00);
        PercentCommissionEmployee w = new PercentCommissionEmployee("Moe", "Dane", "Marketing", 5300.00, 12.00);
        FixComissionEmployee t = new FixComissionEmployee("Cloe", "Wane", "Marketing", 2100.00, 100.00);
        FixComissionEmployee s = new FixComissionEmployee("Goe", "Sane", "Marketing", 3100.00, 150.00);
        EmployeeManager manager = new EmployeeManager();
        manager.addEmployee(e);
        manager.addEmployee(f);
        manager.addEmployee(h);
        manager.addEmployee(w);
        manager.addEmployee(t);
        manager.addEmployee(s);
        System.out.println("-------------------------");
        System.out.println("FixCommissionEmployee " + f.getLastName() + " costs: " + f.getFullSalary());
        System.out.println("-------------------------");
        System.out.println("All employees cost: " + manager.calcTotalSalary());
        System.out.println("-------------------------");
        System.out.println("method with store hashmap in set for printing");
        manager.printHashMap();// print methode  mit SET
        System.out.println("print method with eturnvalue hashmap");
        System.out.println(manager.getSalaryByDepartment());


    }
}
