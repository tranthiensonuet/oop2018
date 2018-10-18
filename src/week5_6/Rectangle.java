package week5_6;

import java.util.Objects;

public class Rectangle extends Shape {
    private double width;
    private double length;
    private Point pointCenter;

    public Rectangle() {
        width = 1.0;
        length = 2.0;
        pointCenter = new Point(3.0, 4.0);
    }

    public Rectangle(String color, boolean filled) {
        super(color, filled);
    }

    public Rectangle(double width, double length, double x, double y, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
        pointCenter = new Point(x, y);
    }

    public Rectangle(double width, double length, double x, double y) {
        this.width = width;
        this.length = length;
        this.pointCenter = new Point(x, y);
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

    public double getArea(){
        return width * length;
    }
    public  double getPerimeter(){
        return (width + length)*2;
    }
    @Override
    public String toString() {
        return "Rectangle{" +
                "width = " + width +
                ", length = " + length +
                ", color = " + this.getColor() +
                ", pointCenter = " + pointCenter +
                ", filled = " + this.isFilled() +
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