package week5_6;

import java.util.Objects;

public class Rectangle extends Shape {
    private double width;
    private double length;
    private Point pointCenter;

    public Rectangle(String color, boolean filled, double width, double length, Point pointCenter) {
        super(color, filled);
        this.width = width;
        this.length = length;
        this.pointCenter = pointCenter;
    }

    public Rectangle(double width, double length, Point pointCenter) {
        this.width = width;
        this.length = length;
        this.pointCenter = pointCenter;
    }

    public Rectangle(String color, boolean filled) {
        super(color, filled);
    }

    public Rectangle() {
        this(1, 1, new Point());
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public Point getPointCenter() {
        return pointCenter;
    }

    public void setPointCenter(Point pointCenter) {
        this.pointCenter = pointCenter;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", pointCenter=" + pointCenter +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.width, width) == 0 &&
                Double.compare(rectangle.length, length) == 0 &&
                Objects.equals(pointCenter, rectangle.pointCenter);
    }


}