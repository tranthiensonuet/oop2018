package week4.task2;

/**
 * là một class về đối tượng Shape
 *
 * @author tranthiensonuet
 */
public class Shape {
    protected String color = "red"; // màu sắc
    protected boolean filled = true; //true là , false là

    /**
     * phương thức khởi tạo không có tham số
     */
    Shape(){
    }

    /**
     * phương thức khởi tạo có chưa tham số
     *
     * @param color
     * @param filled
     */
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    /**
     * phương thức trả về màu sắc
     *
     * @return màu sắc
     */
    public String getColor(){
        return color;
    }

    /**
     * phương thức set màu sắc
     *
     * @param color
     */
    public void setColor(String color){
        this.color = color;
    }

    /**
     * phương thức kiểm tra true hoặc false
     *
     * @return true hoặc false
     */
    public boolean isFilled(){
        return filled;
    }

    /**
     * phương thức set kiểm tra true hoặc false
     *
     * @param filled
     */
    public void setFilled(boolean filled){
        this.filled = filled;
    }

    /**
     * phương thức trả về thông tin của Shape
     *
     * @return thông tin của Shape
     */
    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
