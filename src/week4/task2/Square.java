package week4.task2;

/**
 * là class về đối tượng Square kế thừa {@Link Shape}
 * @author tranthiensonuet
 */
public class Square extends Shape{
    private double side; // cạnh hình vuông

    /**
     * phương thức khởi tạo không có tham số
     */
    public Square(){
    }

    /**
     * phương thức khởi tạo có 1 tham số
     * @param side
     */
    public Square(double side){
        this.side = side;
    }

    /**
     * phương thức khởi tạo có 3 tham số
     *
     * @param side
     * @param color
     * @param filled
     */
    public Square(double side, String color, boolean filled){
        super(color, filled);
        this.side = side;
    }

    /**
     * phương thức trả về giá trị cạnh của Square
     * @return giá trị cạnh
     */
    public double getSide(){
        return side;
    }

    /**
     * phương thức set giá trị cạnh của Square
     * @param side
     */
    public void setSide(double side){
        this.side = side;
    }

    /**
     * phương thức set giá trị chiều rộng
     * @param side
     */
    public void setWidth(double side){
        this.side = side;
    }

    /**
     * phương thức set giá trị chiều dài
     * @param side
     */
    public void setLength(double side){
        this.side = side;
    }

    /**
     * phương thức trả về giá trị thuộc tính của Square
     * @return thuộc tính của Square
     */
    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
