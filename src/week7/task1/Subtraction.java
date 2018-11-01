package week7.task1;

public class Subtraction extends BinaryExpression {

    Expression left;
    Expression right;

    public Subtraction(Expression left, Expression right){
        this.left = left;
        this.right = right;
    }

    public int evaluate(){
        return left.evaluate() - right.evaluate();
    }

    Expression left(){
        return this.left;
    }
    Expression right(){
        return this.right;
    }
}
