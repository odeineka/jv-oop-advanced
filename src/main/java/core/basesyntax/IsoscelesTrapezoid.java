package core.basesyntax;

public class IsoscelesTrapezoid extends Figure {
    private int height;
    private int smallerSide;
    private int biggerSide;

    public IsoscelesTrapezoid(int height, int smallerSide, int biggerSide, Color color) {
        super(color);
        this.height = height;
        this.smallerSide = smallerSide;
        this.biggerSide = biggerSide;
    }

    @Override
    public double getArea() {
        return (double) height * smallerSide * biggerSide * 0.5;
    }

    @Override
    public String getFigureInfo() {
        return null;
    }

    @Override
    public String toString() {
        return "Figure: isosceles trapezoid, area: " + String.format("%.1f", getArea())
                + " sq. units, height: " + height + " units, smaller side: " + smallerSide
                + " units, bigger side: " + biggerSide + " units, color: "
                + getColor().name().toLowerCase();
    }
}
