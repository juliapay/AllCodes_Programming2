package Vererbung.Beispiele.LogisticMaster;

public class Shirt implements Moveable {
    private String brand;
    private String color;
    private String size;

    public Shirt(String brand, String color, String size) {
        this.brand = brand;
        this.color = color;
        this.size = size;
    }

    @Override
    public void move(String destination) {
        System.out.println("THe "+color+" "+brand+" T-shirt will be moved to "+destination);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
