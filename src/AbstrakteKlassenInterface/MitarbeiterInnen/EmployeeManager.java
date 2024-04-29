package AbstrakteKlassenInterface.MitarbeiterInnen;

import java.util.*;

public class EmployeeManager {

    List<Employee>empList;

    public EmployeeManager() {
        this.empList = new ArrayList<>();
    }
    public void addEmployee(Employee e){
        if(empList!=null){
            if(!empList.contains(e)){
                empList.add(e);
            }
        }
    }
    public double calcTotalSalary(){
        double sum=0.0;
        if(empList!=null){
            for (Employee e:empList) {
                sum+=e.getFullsalary();
            }
        }
        return sum;
    }
    public HashMap<String,Double> getSalaryByDepartment(){
        HashMap<String,Double> salaryByDepartment=new HashMap<>();
        if(empList!=null){
            for (Employee e:empList) {
                if(salaryByDepartment.containsKey(e.department)){
                    //variable zum speichern des momentanen Value-WErtes aus der Hashmap
                    double currentSumOfSalary=salaryByDepartment.get(e.department);

                    salaryByDepartment.put(e.department, currentSumOfSalary+(e.getFullsalary()));
                    // else abfrage zum erstellung eines neun key-value-pairs falls der key noch nicht in der hashmap vorhanden ist
                }else{
                    salaryByDepartment.put(e.department, e.getFullsalary());
                }
            }
        }
        Set<String> keyset= salaryByDepartment.keySet();
        for (String s:keyset) {
            System.out.println("in der Abteilung: "+s+" beträgt die Summe aller Gehaelter: "+salaryByDepartment.get(s));
        }
        return salaryByDepartment;
    }
    public void EmployeeSortiertNachGehaltDannNamen(){
        GehaltComparator gehaltComparator= new GehaltComparator();
        Collections.sort(empList,gehaltComparator);
        for (Employee e:empList) {
            System.out.println(e);
        }
    }
    public void EmployeeSortiertNacNamenDannGehalt(){
        NamenDannGehaltComparator namenDannGehaltComparator= new NamenDannGehaltComparator();
        Collections.sort(empList,namenDannGehaltComparator);
        for (Employee e:empList) {
            System.out.println(e);
        }
    }
}
