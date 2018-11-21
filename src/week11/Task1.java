package week11;

import java.util.Arrays;

public class Task1 {
    static <T> void Sort(T[] a){
        Arrays.sort(a);
    }

    public static void main(String[] args) {
        String a[] = {"son", "thien", "huy", "hung", "nam", "cua"};
        Sort(a);
        System.out.println(Arrays.toString(a));
    }
}
