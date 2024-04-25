package AbstrakteKlassenInterface.DogsComperator;

public class Dog implements Comparable<Dog> {
    //MIT COMPARABLE INTERFACE
    //auf private können abgeleitete Klassen NICHT zugreifen
    private String name;
    //auf protected können abgeleitete Klassen zugreifen
    protected int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public void bark(String inhalt) {
        System.out.println(name + " barks " + inhalt);
    }

    //HIER DIE COMPARETO METHODE
    //WIE WOLLEN WIR HUNDE SORTIEREN? NACH ALTER ABSTEIGEND
    //WIE MÜSSEN DAS THIS OBJEKT MIT DEM O OBJEKT VERGLEICHEN

    @Override
    public int compareTo(Dog o) {//FÜR SORT-ARRAYSORT WICHTIG!!!!!
        if (this.age>o.age){//THIS SOLL VOR O STEHEN ALSO NEGATIVE ZAHL
            return -1;
        }
        if (this.age<o.age){//THIS SOLL NACH O STEHEN ALSO POSITIVE ZAHL
            return 1;
        }
        //BEI GLEICH ALT
        return 0;
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

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
