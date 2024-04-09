package Klassen.Bilderrahmen;

public class BackBoard {
   private Matrial material;
   private double weight;
   private Color color;
   private boolean hook;
   private boolean multipleHooks;
   private  boolean stand;

    public BackBoard(Matrial material, double weight, Color color, boolean hook, boolean multipleHooks, boolean stand) {
        this.material = material;
        this.weight = weight;
        this.color = color;
        this.hook = hook;
        this.multipleHooks = multipleHooks;
        this.stand = stand;
    }

    public Matrial getMaterial() {
        return material;
    }

    public void setMaterial(Matrial material) {
        this.material = material;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public boolean isHook() {
        return hook;
    }

    public void setHook(boolean hook) {
        this.hook = hook;
    }

    public boolean isMultipleHooks() {
        return multipleHooks;
    }

    public void setMultipleHooks(boolean multipleHooks) {
        this.multipleHooks = multipleHooks;
    }

    public boolean isStand() {
        return stand;
    }

    public void setStand(boolean stand) {
        this.stand = stand;
    }

    @Override
    public String toString() {
        return "BackBoard " +
                "material=" + material +
                ",\nweight=" + weight +
                ", color=" + color +
                ", hook=" + hook +
                ",\nmultipleHooks=" + multipleHooks +
                ", stand=" + stand;
    }
}
