package Klassen.Bilderrahmen;

public class Frame {
    private double height;
    private double width;
    private  double depth;
    private double frameWidth;
    private Matrial matrial;
    private Glass glass;
    private Color color;
    private BackBoard backBoard;
    private Passepartout passepartout;

    public Frame(double height, double width, double depth, double frameWidth, Matrial matrial, Glass glass, Color color, BackBoard backBoard, Passepartout passepartout) {
        this.height = height;
        this.width = width;
        this.depth = depth;
        this.frameWidth = frameWidth;
        this.matrial = matrial;
        this.glass = glass;
        this.color = color;
        this.backBoard = backBoard;
        this.passepartout = passepartout;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public double getFrameWidth() {
        return frameWidth;
    }

    public void setFrameWidth(double frameWidth) {
        this.frameWidth = frameWidth;
    }

    public Matrial getMatrial() {
        return matrial;
    }

    public void setMatrial(Matrial matrial) {
        this.matrial = matrial;
    }

    public Glass getGlass() {
        return glass;
    }

    public void setGlass(Glass glass) {
        this.glass = glass;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public BackBoard getBackBoard() {
        return backBoard;
    }

    public void setBackBoard(BackBoard backBoard) {
        this.backBoard = backBoard;
    }

    public Passepartout getPassepartout() {
        return passepartout;
    }

    public void setPassepartout(Passepartout passepartout) {
        this.passepartout = passepartout;
    }

    @Override
    public String toString() {
        return "Frame" +
                "height=" + height +
                ", width=" + width +
                ", depth=" + depth +
                ",\nframeWidth=" + frameWidth +
                ", matrial=" + matrial +
                ", glass=" + glass +
                ", color=" + color +
                ",\n" + backBoard +
                ",\n" + passepartout;
    }
}
