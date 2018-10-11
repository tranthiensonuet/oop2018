package week4.task2;

/**
 * là một class về đối tượng circle kế thừa {@Link Shape}
 * @author tranthienson1999
 */
public class Circle extends Shape{
    private double radius = 1.0; //bán kinh của circle
    private final double PI =3.14; // định nghĩa số pi

    /**
     *phương thức khởi tạo không tham số
     */
    public Circle(){
    }

    /**
     * phương thức khởi tạo có 1 tham số
     * @param radius
     */
    public Circle(double radius){
        this.radius = radius;
    }

    /**
     * phương thức khởi tạo có 3 tham số
     * @param radius
     * @param color
     * @param filled
     */
    public Circle (double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    /**
     * phương thức trả về giá trị radius của circle
     * @return giá trị radius
     */
    public double getRadius(){
        return radius;
    }

    /**
     * phương thức set giá trị radius cảu circle
     * @param radius
     */
    public void setRadius(double radius){
        this.radius = radius;
    }

    /**
     * phương thức trả về giá trị Area của circle
     * @return giá trị Area
     */
    public double getArea(){
        return PI * radius * radius;
    }

    /**
     * phương thức trả về giá trị Perimeter của circle
     * @return giá trị Perimeter
     */
    public double getPerimeter(){
        return 2 * PI * radius;
    }

    /**
     * phương thức trả về thông tin của circle
     * @return thông tin của circle
     */
    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", PI=" + PI +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
