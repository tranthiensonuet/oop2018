package week2.task1;
public class Task1 {
    public static int gcd(int a, int b) {
        // TODO: Tính ước  chung lớn nhất của 2 số a, b
        int gcd = 0;
        for (int i = 1; i <= Math.abs(a) || i <= Math.abs(b); i++) {
            if (Math.abs(a) % i == 0 && Math.abs(b) % i == 0)
                gcd = i;
        }
        return gcd;
    }

    public static int fibonacci(int n) {
        // TODO: Tìm số fibonacci ở vị trí n
        if( n== 0|| n==1)
            return n;
        else
            return fibonacci(n-1) + fibonacci(n-2);
    }
    public static void main(String[] args) {
        System.out.println("Uoc chung lon nhat cua 2 so la: ");
        System.out.println(gcd(-6, -15));
        System.out.println("Vi tri la: ");
        System.out.println(fibonacci(3));
    }
}
