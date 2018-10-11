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
}
