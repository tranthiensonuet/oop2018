package week4.task2;

/**
 * là class về đối tượng Rectangle kế thừa {@Link Shape}
 * @author tranthiensonuet
 */
public class Rectangle extends Shape{
    protected double width = 1.0; // chiều rộng của Rectangle
    protected double length = 1.0; // chiều dài của Rectangle

    /**
     * phương thức khởi tạo không tham số
     */
    public Rectangle(){
    }

    /**
     * phương thức khởi tạo 2 tham số
     * @param width
     * @param length
     */
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    /**
     * phương thức khởi tạo 4 tham số
     * @param width
     * @param length
     * @param color
     * @param filled
     */
    public Rectangle(double width, double length, String color, boolean filled){
        super(color,filled);
        this.width = width;
        this.length = length;
    }

    /**
     * phương thức trả về giá chị chiều rộng của Rectangle
     * @return giá trị chiều rộng
     */
    public double getWidth() {
        return width;
    }

    /**
     * phương thức set giá trị chiều rông của Rectangle
     * @param width
     */
    public void setWidth (double width){
        this.width = width;
    }

    /**
     * phương thức trả về giá trị chiều dài của Rectangle
     * @return giá trị chiều dài
     */
    public double getLength(){
        return length;
    }

    /**
     * phương thức set giá trị chiều dài của Rectangle
     * @param length
     */
    public void setLength (double length){
        this.length = length;
    }

    /**
     * phương thức trả về giá trị diện tích của Rectangle
     * @return giá trị diện tích
     */
    public double getArea(){
        return length * width;
    }

    /**
     * phương thức trả về giá trị chu vi của Rectangle
     * @return giá trị của chu vi
     */
    public double getPerimeter(){
        return 2 * (length + width);
    }

    /**
     * phương thức trả về giá trị thuộc tính của Rectangle
     * @return thuộc tính của Rectangle
     */
    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
