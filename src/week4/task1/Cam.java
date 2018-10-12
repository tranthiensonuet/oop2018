package week4.task1;

/**
 * là một class về đối tượng Cam kế thừa{@Link HoaQua}
 * @author tranthiensonuet
 */
public class Cam extends HoaQua{
    protected int number; // số lượng cam
    protected int year; // năm sản xuất

    /**
     * phương thức trả về số lượng cam
     * @return số lượng cam
     */
    public int getNumber(){
        return number;
    }

    /**
     * phương thức set số lượng cam
     * @param number
     */
    public void setNumber(int number){
        this.number = number;
    }

    /**
     * phương thức trả về năm sản xuất của cam
     * @return năm sản xuất của cam
     */
    public int getYear(){
        return year;
    }

    /**
     * phương thức set năm sản xuất của cam
     * @param year
     */
    public void setYear(int year){
        this.year = year;
    }

    /**
     * phương thức so sánh số lượng cam
     * @return 0 là bằng nhau hoặc 1 không bằng nhau
     */
    public int equalsnumber (Cam cam){
        if (cam.number == number )
            return 0;
        else {
            return 1;
        }
    }
    /*
    public static void main(String[] args) {
        HoaQua cam1 = new HoaQua();
        HoaQua cam2 = new HoaQua();
        cam1.setSource("China");
        cam2.setSource("VietNam");
        System.out.println(cam1.equals(cam2));
    }*/
}
