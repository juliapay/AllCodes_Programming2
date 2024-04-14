package AbstrakteKlassenInterface.Figures;

public class AppFigures {
    public static void main(String[] args) {
        //ADD FIGURES
        Circle a = new Circle(5);
        Circle c = new Circle(1000);
        Circle e = new Circle(500);
        Rectangle r= new Rectangle(5,3);
        Rectangle s= new Rectangle(100,200);
        Rectangle t = new Rectangle(600,700);
        //INITIALIZE CLASS FIGUREMANAGER
        FigureManager manager =new FigureManager();
        //ADD FIGURES IN ARRAYLIST
        manager.addfigures(a);
        manager.addfigures(c);
        manager.addfigures(e);
        manager.addfigures(r);
        manager.addfigures(t);
        manager.addfigures(s);
        //METHODS
        System.out.println("the average size of all figures is "+manager.getAverageSize());
        System.out.println("just the hashmap: " +manager.getAreaBySizeCatagories());
        System.out.println("the maximum perimeter is "+manager.getMaxPerimeter());
        //PRINT METHOD
        manager.printHashMap();
    }
}
