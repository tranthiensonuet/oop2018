package week4.task1;

/**
 * là một class về đối tượng Táo kế thừa {@link HoaQua}
 * @author tranthiensonuet
 */
public class Tao extends HoaQua{
    protected int number; // số lượng táo
    protected int year; // năm sản xuất

    /**
     * phương thức trả về số lượng táo
     * @return số lượng táo
     */
    public int getNumber(){
        return number;
    }

    /**
     * phương thức set số lượng táo
     * @param number
     */
    public void setNumber(int number){
        this.number = number;
    }

    /**
     * phương thức trả về năm sản xuất của táo
     * @return năm sản xuất của táo
     */
    public int getYear(){
        return year;
    }

    /**
     * phương thức set năm sản xuất của táo
     * @param year
     */
    public void setYear(int year){
        this.year = year;
    }
}

