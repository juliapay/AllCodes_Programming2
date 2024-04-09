package Vererbung.Beispiele.University;

import java.util.ArrayList;
import java.util.List;

public class AppUniversity {
    public static void main(String[] args) {
        Student s = new Student("Pablo");
        s.getInfo();
        Mentor m = new Mentor("NoWayJose", "Programming");
        m.getInfo();
        List<Person> everybody = new ArrayList<>();
        everybody.add(s);
        everybody.add(m);
        for (Person p : everybody) {
            p.getInfo();
        }
        //UPCASTING

        Person p2 = s;
        // das geht ohne Probleme,
        // da wir wissen, da Student sich von Person ableitet

        //DOWNCASTING
        s.learn();
        //p2.learns(); geht nicht da Student auf Personenreferenz
        // unddeshalb nur die attribute und personenmethoden angeboten werden können
        // ABER: bei Methodenueberschreibung werden die neusten Implementierungen ausgeführt

        Student s2= (Student)p2;
        //wenn ich explizit caste dann ist downcast erlaubt

        Person p3 =m;
        // GEHT NICHT:    Student s3= m;

        //CLASSCASTEXCEPTION
        //weil java einen mentor in einen studenten umwandeln will
        // Student s3 = (Student)p3;
        //--> das kann ich machen...aber stuerzt ab
    }
}
