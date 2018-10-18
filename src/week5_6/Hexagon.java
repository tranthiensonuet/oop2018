package week5_6;

import java.util.Objects;

public class Hexagon extends Shape {
    private Point centerPoint;
    private double side;

    public Hexagon(String color, boolean filled, Point centerPoint, double side) {
        super(color, filled);
        this.centerPoint = centerPoint;
        this.side = side;
    }

    public Hexagon(Point centerPoint, double side) {
        this.centerPoint = centerPoint;
        this.side = side;
    }

    public Hexagon() {
        this.side = 1.0;
        this.centerPoint = new Point();
    }

    public Hexagon(String color, boolean filled) {
        this();
    }

    public Point getCenterPoint() {
        return centerPoint;
    }

    public void setCenterPoint(Point centerPoint) {
        this.centerPoint = centerPoint;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Hexagon{" +
                "centerPoint=" + centerPoint +
                ", side=" + side +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hexagon hexagon = (Hexagon) o;
        return Double.compare(hexagon.side, side) == 0 &&
                Objects.equals(centerPoint, hexagon.centerPoint);
    }


}