package Vererbung.Beispiele.Dogs;

public class Dog {
    //auf private können abgeleitete Klassen NICHT zugreifen
    private String name;
    //auf protected können abgeleitete Klassen zugreifen
    protected  int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public void bark(String inhalt){
        System.out.println(name+ " barks " +inhalt);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
