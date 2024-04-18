package Generics;

public class Maybe<T>{

    private T value;
    private String descritpion;
    private int status;
//STATUS VALUES: 1->everybody can acces
    //10->everybody + add partners can access
    //2-> deleted
    //3->
    public Maybe(T value, int status) {
        this.value = value;
        this.status = status;
    }
    //RÜVKGABEWERT SOLL NUR GELIEFERT WERDEN
    // WENN STATUS DEN WERT 1 ODER 10 HAT
    public T getValueIfAllowed(){
        if (status==1||status==2){
            return value;
        }
        return null;
    }
}
