package week4.task1;
/** là một class về đối tượng Cam Sanh kế thừa {@Link Cam}
 * @author tranthiensonuet
 */

public class CamSanh extends Cam{
    private String shape; // hình dáng của cam sanh
    private String smell; // mùi vị của cam sanh

    /**
     * phương thức trả về hình dáng của cam sanh
     * @return hình dáng cảu cam sanh
     */
    public String getShape(){
        return shape;
    }

    /**
     * phương thức set hình dáng của cam sanh
     * @param shape
     */
    public void setShape(String shape){
        this.shape = shape;
    }

    /**
     * phương thức trả về mùi vị của cam sanh
     * @return mùi vị của cam sanh
     */
    public String getSmell(){
        return smell;
    }

    /**
     * phương thức set mùi vị của cam sanh
     * @param smell
     */
    public void setSmell(String smell){
        this.smell = smell;
    }

    /*
    public static void main(String[] args) {
        Cam camsanh1 = new Cam();
        Cam camsanh2 = new Cam();
        camsanh1.setNumber(40);
        camsanh2.setNumber(30);
        if (camsanh1.equalsnumber(camsanh2) == 0)
            System.out.println("Bang nhau");
        else System.out.println("Khong bang nhau");
    }*/
}
