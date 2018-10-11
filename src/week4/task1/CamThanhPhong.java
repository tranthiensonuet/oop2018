package week4.task1;

/** là một class về đối tượng Cam Thanh Phong kế thừa {@Link Cam}
 * @author tranthiensonuet
 */
public class CamThanhPhong extends Cam {
    private String shape; // hình dáng của cam thanh phong
    private String smell; // mùi vị của cam thanh phong

    /**
     * phương thức trả về hình dáng của cam thanh phong
     * @return hình dáng cảu cam thanh phong
     */
    public String getShape(){
        return shape;
    }

    /**
     * phương thức set hình dáng của cam thanh phong
     * @param shape
     */
    public void setShape(String shape){
        this.shape = shape;
    }

    /**
     * phương thức trả về mùi vị của cam thanh phong
     * @return mùi vị của cam thanh phong
     */
    public String getSmell(){
        return smell;
    }

    /**
     * phương thức set mùi vị của cam thanh phong
     * @param smell
     */
    public void setSmell(String smell){
        this.smell = smell;
    }
}
