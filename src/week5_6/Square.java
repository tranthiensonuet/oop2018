package week5_6;

import java.util.Objects;

public class Square extends Shape {
    private double side;
    private Point centerPoint;

    public Square() {
        side = 1.0;
        centerPoint = new Point(2.0, 2.0);
    }
    public Square(double side, double x, double y, String color, boolean filled) {
        super(color, filled);
        centerPoint = new Point(x, y);
        this.side = side;
    }
    public Square(double side, double x, double y) {
        this.centerPoint = new Point(x, y);
        this.side = side;
    }
    public Square(String color, boolean filled) {
        super(color, filled);
        side = 1.0;
        centerPoint = new Point(2, 2);
    }

    @Override
    public String toString() {
        return "Square{" +
                "centerPoint = " + centerPoint +
                ", side = " + side +
                ", color = " + this.getColor() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return Double.compare(square.side, side) == 0 &&
                Objects.equals(centerPoint, square.centerPoint);
    }

}