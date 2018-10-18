package week5_6;

import java.util.Objects;

public class Circle extends Shape {
    private double radius;
    private final double PI = 3.14f;
    private Point centerPoint;

    public Circle(String color, boolean filled, double radius, Point centerPoint) {
        super(color, filled);
        this.radius = radius;
        this.centerPoint = centerPoint;
    }

    public Circle(double radius, Point centerPoint) {
        this.radius = radius;
        this.centerPoint = centerPoint;
    }

    public Circle(String color, boolean filled) {
        super(color, filled);
    }

    public Circle() {
        this(2, new Point());
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getPI() {
        return PI;
    }

    public Point getCenterPoint() {
        return centerPoint;
    }

    public void setCenterPoint(Point centerPoint) {
        this.centerPoint = centerPoint;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", PI=" + PI +
                ", centerPoint=" + centerPoint +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0 &&
                Objects.equals(centerPoint, circle.centerPoint);
    }


}