package week5_6;

import java.util.Objects;

public class Circle extends Shape {
    private double radius;
    private final double PI = 3.14;
    private Point centerPoint;

    public Circle() {
        radius = 1.0;
        centerPoint = new Point(1,1);
    }

    public Circle(String color, boolean filled) {
        super(color, filled);
    }

    public Circle(double radius, double x, double y, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
        centerPoint = new Point(x, y);
    }

    public Circle(double radius, double x, double y) {
        this.radius = radius;
        centerPoint = new Point(x, y);
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

    public double getArea(){
        return PI*radius*radius;
    }
    public double getPerimeter(){
        return 2*PI*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius = " + radius +
                ", PI = " + PI +
                ", color = " + this.getColor() +
                ", centerPoint = " + centerPoint +
                ", filled = " + this.isFilled() +
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