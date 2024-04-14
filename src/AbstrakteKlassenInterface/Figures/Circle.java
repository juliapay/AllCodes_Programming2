package AbstrakteKlassenInterface.Figures;

public class Circle extends Figure {
    //SUBCLASS FROM ABSTRACT CLASS FIGURE
    //FIELD
    protected double radius;

    //CONSTRUCTOR
    public Circle(double radius) {
        this.radius = radius;
    }
    //METHODS FROM ABSTRACT CLASS FIGURE TO OVERRIDE
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
