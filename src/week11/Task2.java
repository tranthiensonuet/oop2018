package week11;

import java.util.Arrays;

public class Task2 {
    static <T> T Sort (T a[]){
        Arrays.sort(a);
        return a[a.length - 1];
    }

    public static void main(String[] args) {
        String a[] = {"son", "thien", "huy", "hung", "nam", "cua"};
        String max = Sort(a);
        System.out.println(max);
    }
}
