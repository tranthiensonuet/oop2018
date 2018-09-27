package week2.task2;


import java.util.Objects;

public class Fraction {
    //ucln
    public static int gcd(int a, int b) {
        int gcd = 0;
        for (int i = 1; i <= Math.abs(a) || i <= Math.abs(b); i++) {
            if (Math.abs(a) % i == 0 && Math.abs(b) % i == 0)
                gcd = i;
        }
        return gcd;
    }

    // TODO: khai báo các thuộc tính
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        // TODO: khởi tạo giá trị cho các thuộc tính numberator (tử số), denominator (mẫu số)
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction add(Fraction other) {
        // TODO: Phương thức cộng hai phân số (this và other), trả về đối tượng Fraction mới
        if (other.denominator == 0 || denominator == 0)
        {
            return null;
        }
        else {
            int resultnum = 0, resultden = 0;
            Fraction result = new Fraction(0, 0);
            resultnum = numerator * other.denominator + other.numerator * denominator;
            resultden = denominator * other.denominator;
            int gcd = gcd(resultnum, resultden);
            result.numerator = resultnum / gcd;
            result.denominator = resultden / gcd;
            return result;
        }
    }

    public Fraction subtract(Fraction other) {
        // TODO: Phương thức trừ hai phân số (this và other), trả về đối tượng Fraction mới
        if (other.denominator == 0 || denominator == 0)
            return null;
        else {
            int resultnum = 0, resultden = 0;
            Fraction result = new Fraction(0, 0);
            resultnum = numerator * other.denominator - other.numerator * denominator;
            resultden = denominator * other.denominator;
            int gcd = gcd(resultnum, resultden);
            result.numerator = resultnum / gcd;
            result.denominator = resultden / gcd;
            return result;
        }
    }

    public Fraction multiply(Fraction other) {
        // TODO: Phương thức nhân hai phân số (this và other), trả về đối tượng Fraction mới
        if (other.denominator == 0 || denominator == 0)
            return null;
        else {
            int resultnum = 0, resultden = 0;
            Fraction result = new Fraction(0, 0);
            resultnum = numerator * other.numerator;
            resultden = denominator * other.denominator;
            int gcd = gcd(resultnum, resultden);
            result.numerator = resultnum / gcd;
            result.denominator = resultden / gcd;
            return result;
        }
    }

    public Fraction divide(Fraction other) {
        // TODO: Phương thức chia hai phân số (this và other), trả về đối tượng Fraction mới
        if (other.denominator == 0 || denominator == 0)
            return null;
        else {
            int resultnum = 0, resultden = 0;
            Fraction result = new Fraction(0, 0);
            resultnum = numerator * other.denominator;
            resultden = denominator * other.numerator;
            int gcd = gcd(resultnum, resultden);
            result.numerator = resultnum / gcd;
            result.denominator = resultden / gcd;
            return result;
        }
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fraction fraction = (Fraction) o;
        Fraction result = new Fraction(1, 1);
        result = this.subtract(fraction);
        if (result.numerator * result.denominator == 0)
            return true;
        return false;
    }



    //In ra ket qua cua phan so
    public void result(){
        if (this.denominator == 0 && this.numerator != 0)
            System.out.println("Phan so khong hop le");
        else
        {
            if (denominator == 1)
            System.out.println("Phan so ket qua la: " + numerator );
            else if (numerator > 0 && denominator < 0)
                System.out.println("Phan so ket qua la: " + -numerator + "/" + -denominator);
            else if (numerator < 0 && denominator < 0)
                System.out.println("Phan so ket qua la: " + -numerator + "/" + -denominator);
            else System.out.println("Phan so ket qua la: " + numerator + "/" + denominator);
        }

    }


    public static void main(String[] args) {
        Fraction s1 = new Fraction(2, 3);
        Fraction s2 = new Fraction(4, 5);
        //Cong 2 phan so
        Fraction sum = s1.add(s2);
        sum.result();
        //Tru 2 phan so
        Fraction hieu = s1.subtract(s2);
        hieu.result();
        //Nhan 2 phan so
        Fraction tich = s1.multiply(s2);
        tich.result();
        //Chia 2 phan so
        Fraction thuong = s1.divide(s2);
        thuong.result();
        // So sanh 2 phan so
        System.out.println(s1.equals(s2));
    }
}


