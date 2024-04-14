package Vererbung.Beispiele.MitarbeiterInnen;

import java.util.*;

public class EmployeeManager {
    //METHODENKLASSE FUER DIE VERWENDUNG DER KLASSEN
    //DEKLARIERUNG ARRAYLIST
    private List<Employee> empList;//LIST IST NUR INTERFACE--MAN KANN KEIN OBJEKT ERSTELLEN

    public EmployeeManager() {
        this.empList = new ArrayList<>();//DESWEGEN MUSS ES MIT ARRAYLIST INITIALISIERT WERDEN
    }
//HINZUFUEGEN IN ARRAYLIST
    public void addEmployee(Employee e) {
        if (!empList.contains(e)) {//CONDITION FUER LEEREN PLATZ
            empList.add(e);
        }
    }
//BERECHNUNG SUMME ALLER SALARYS
    public double calcTotalSalary() {
        double sumSalary = 0;
        for (Employee e : empList) {
            sumSalary += e.getFullSalary();
        }
        return sumSalary;
    }
//RETURNVALUE HASMAP-----------------------------------------------------
    public HashMap<String, Double> getSalaryByDepartment() {
        HashMap<String, Double> allEmployee = new HashMap<>();
        for (Employee e : empList) {
            String department = e.getDepartment();//ZUWEISUNG DES KEYS AUF DEN NAMEN DER DEPARTMENTS
            if (!allEmployee.containsKey(department)) {//CONTITION FUER LEEREN PLATZ
                allEmployee.put(department, 0.0);//EMPLOYEES WERDEN ZUGEWIESEN ZU DEN DEPARTMENTS; VALUE WIRD AUF 0.0 GESETZT            }
                allEmployee.put(department, allEmployee.get(department) + e.getFullSalary());//VALUE WIRD SUMMIERT
            }
        }
        return allEmployee;
    }
    //PRINTMETHODE HASHMAP MIT SET---------------------------------------------------
    public void printHashMap(){
        Set<String> keySet= getSalaryByDepartment().keySet();//SET WIRD ERSTELLT IM SET WERDEN KEINE DOPPELTEN ELEMENTE AUSGGEBEN
        for (String s:keySet) {//FOR EACH SCHLEIFE ZUR CONSOLENAUSGABE
            System.out.println("The Department "+s+" costs "+getSalaryByDepartment().get(s));
        }
    }

}


