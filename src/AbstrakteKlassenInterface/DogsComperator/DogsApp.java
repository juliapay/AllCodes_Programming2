package AbstrakteKlassenInterface.DogsComperator;

public class DogsApp {
    public static void main(String[] args) {
        Dog doggi = new Dog("Wuffi",2);
        doggi.bark("Wuff");
        Pudel bello =new Pudel("Bello",5,"Bär");
        bello.bark("gaff, gaff");
        bello.isstBeilage("Gnu");
        System.out.println(bello.getAge());

        Perser p = new Perser();
        System.out.println(p.getName());
    }

}
