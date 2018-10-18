package week5_6;

import java.util.Objects;

public class Square extends Shape {
    private Point centerPoint;
    private double side;

    public Square(String color, boolean filled, Point centerPoint, double side) {
        super(color, filled);
        this.centerPoint = centerPoint;
        this.side = side;
    }

    public Square(Point centerPoint, double side) {
        this.centerPoint = centerPoint;
        this.side = side;
    }

    public Square(String color, boolean filled) {
        super(color, filled);
        this.side = 1.0;
        this.centerPoint = new Point();
    }

    public Square() {
        this.side = 1.0;
        this.centerPoint = new Point();
    }

    @Override
    public String toString() {
        return "Square{" +
                "centerPoint=" + centerPoint +
                ", side=" + side +
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