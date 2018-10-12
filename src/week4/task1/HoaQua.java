package week4.task1;

/**
 * đây là một class mô tả về hoa quả
 * @author tranthiensonuet
 */
public class HoaQua{
    protected float price; // Giá của hoa quả
    protected String source; // Nguồn gốc của hoa quả

    /**
    * phương thức trả về giá tiền của hoa quả
    * @return giá tiền của hoa quả
     */
    public float getPrice(){
        return price;
    }

    /**
     * phương thức set giá tiền của hoa quả
     * @param price
     */
    public void setPrice(float price){
        this.price = price;
    }

    /**
     * phương thức trả về nguồn gốc của hoa quả
     * @return nguồn gốc của hoa quả
     */
    public String getSource(){
        return source;
    }

    /**
     * phương thức set nguồn gốc của hoa quả
     * @param source
     */
    public void setSource(String source) {
        this.source=source;
    }

    /**
     * phương thức so sánh nguồn gốc của 2 quả
     * @return true hoặc false
     */
    public boolean equals(HoaQua hq){
        if (source.equals(hq.source))
            return true;
        else return false;
    }

}
