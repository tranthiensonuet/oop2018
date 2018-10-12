package week4.task2;

/**
 * là class về đối tượng Square kế thừa {@Link Rectangle}
 * @author tranthiensonuet
 */
public class Square extends Rectangle{
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
        new Rectangle(side, side);
    }

    /**
     * phương thức khởi tạo có 3 tham số
     *
     * @param side
     * @param color
     * @param filled
     */
    public Square(double side, String color, boolean filled){
        super(side,side,color,filled);
    }

    /**
     * phương thức trả về giá trị cạnh của Square
     * @return giá trị cạnh
     */
    public double getSide(){
        return getWidth();
    }

    /**
     * phương thức set giá trị cạnh của Square
     * @param side
     */
    public void setSide(double side){
        setWidth(side);
        setLength(side);
    }

    /**
     * phương thức set giá trị chiều rộng
     * @param side
     */
    public void setWidth(double side){
        width = side;
    }

    /**
     * phương thức set giá trị chiều dài
     * @param side
     */
    public void setLength(double side){
        length = side;
    }

    /**
     * phương thức trả về giá trị thuộc tính của Square
     * @return thuộc tính của Square
     */
    @Override
    public String toString() {
        return "Square{" +
                "width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
