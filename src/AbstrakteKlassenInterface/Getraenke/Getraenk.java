package AbstrakteKlassenInterface.Getraenke;

public abstract class Getraenk implements Brennbar{
    //ABSTRACT SUPER CLASS GETRAENK
    //FIELD
    String name;
    //CONSTRUCTOR
    public Getraenk(String name) {
        this.name = name;
    }
//METHODS FOR IMPLEMENTING
public abstract int getAnzahlzutaten();
public abstract boolean beinhaltetAlcohol();
public abstract double mengeInMl();
//IMPLEMENT FROM INTERFACE BRENNBAR
    @Override
    public abstract boolean brennt();
    //GETTER AND SETTER
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
//TO STRING METHOD
    @Override
    public String toString() {
        String bool= "";
        String bool1="";

        if (beinhaltetAlcohol()){
            bool=" ja";
        }else{
            bool=" nein";
        }
        if (brennt()){
            bool1=" ja";
        }else{
            bool1=" nein";
        }
        return "Getraenk " +
                "Name " + name +
                "\nZutaten "+getAnzahlzutaten()+
                " alkoholisch: "+bool+
                " / brennbar: "+bool1+"\n";
    }
}
