package week7.task1;

public class Numeral extends Expression {
    private int value;

    public Numeral(int value){
        this.value = value;
    }
    public Numeral(){
    }
    public int evaluate(){
        return  value;
    }
}
