package week7.task1;

public class Division extends BinaryExpression{
    Expression left;
    Expression right;

    public Division(Expression left, Expression right){
        this.left = left;
        this.right = right;
    }

    public int evaluate(){
        return left.evaluate() / right.evaluate();
    }

    Expression left(){
        return this.left;
    }
    Expression right(){
        return this.right;
    }
}
