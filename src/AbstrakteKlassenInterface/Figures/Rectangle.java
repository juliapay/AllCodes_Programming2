package AbstrakteKlassenInterface.Figures;

public class Rectangle extends Figure {
    //SUBCLASS OF ABSTRACT CLASS FIGURE
    //FIELDS
protected double length;
protected double width;
//CONSTRUCTOR
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
//METHODS FROM ABSTRACT CLASS FIGURE
    @Override
    public double getPerimeter() {
        return ((2*length)+(2*width));
    }
    @Override
    public double getArea() {
        return length*width;
    }
}
