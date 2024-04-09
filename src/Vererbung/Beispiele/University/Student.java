package Vererbung.Beispiele.University;

public class Student extends Person{

    public Student(String name) {
        super(name);//ruft construkctor der Basisklasse auf
    }

    @Override
    public void getInfo() {
        //Reihenfolge bei Ueberschreinung achten!
        //1.Ausgabe
        System.out.println(" Student "+name+" is studying!");
        //2.Ausgabe
        super.getInfo();//ruft implementierung der Basisklasse auf
    }
    public void getInfo(String text) {
        super.getInfo();
    }
    public void learn(){
        System.out.println(name+" learns");
    }
}
