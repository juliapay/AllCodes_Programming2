package Klassen.Bilderrahmen;

public class Passepartout {
    private BoardWeight boardweight;
    private PositionCutOut positionCutOut;
    private Color color;
    private boolean angleCut;
    private double cutOutHeight;
    private double cutOutwidth;

    public Passepartout(BoardWeight boardweight, PositionCutOut positionCutOut, Color color, boolean angleCut, double cutOutHeight, double cutOutwidth) {
        this.boardweight = boardweight;
        this.positionCutOut = positionCutOut;
        this.color = color;
        this.angleCut = angleCut;
        this.cutOutHeight = cutOutHeight;
        this.cutOutwidth = cutOutwidth;
    }

    public BoardWeight getBoardweight() {
        return boardweight;
    }

    public void setBoardweight(BoardWeight boardweight) {
        this.boardweight = boardweight;
    }

    public PositionCutOut getPositionCutOut() {
        return positionCutOut;
    }

    public void setPositionCutOut(PositionCutOut positionCutOut) {
        this.positionCutOut = positionCutOut;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public boolean isAngleCut() {
        return angleCut;
    }

    public void setAngleCut(boolean angleCut) {
        this.angleCut = angleCut;
    }

    public double getCutOutHeight() {
        return cutOutHeight;
    }

    public void setCutOutHeight(double cutOutHeight) {
        this.cutOutHeight = cutOutHeight;
    }

    public double getCutOutwidth() {
        return cutOutwidth;
    }

    public void setCutOutwidth(double cutOutwidth) {
        this.cutOutwidth = cutOutwidth;
    }

    @Override
    public String toString() {
        return "Passepartout " +
                "boardweight=" + boardweight +
                ",\npositionCutOut=" + positionCutOut +
                ", color=" + color +
                ", angleCut=" + angleCut +
                ",\ncutOutHeight=" + cutOutHeight +
                ", cutOutwidth=" + cutOutwidth;
    }
}