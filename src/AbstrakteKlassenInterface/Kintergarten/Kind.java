package AbstrakteKlassenInterface.Kintergarten;

public class Kind {
    private String vname;
    private  String zname;
    private int age;

    public Kind(String vname, String zname, int age) {
        this.vname = vname;
        this.zname = zname;
        this.age = age;
    }

    public String getVname() {
        return vname;
    }

    public void setVname(String vname) {
        this.vname = vname;
    }

    public String getZname() {
        return zname;
    }

    public void setZname(String zname) {
        this.zname = zname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return
                "vname: " + vname + '\'' +
                ", zname: " + zname + '\'' +
                ", age: " + age;
    }
}
