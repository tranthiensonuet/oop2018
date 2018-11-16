package week10;

public class Task2 {
    public double[] Random() {
        double[] arrayrd = new double[1000];
        for (int i = 0; i < 1000; i++) {
            arrayrd[i] = Math.random() * (1000 - 1) + 1;
        }
        return arrayrd;
    }

    public void bubblesort(double[] arrayrd) {
        for (int i = 0; i < arrayrd.length - 1; i++) {
            for (int j = 0; i < arrayrd.length - i - 1; j++) {
                if (arrayrd[j] > arrayrd[j + 1]) {
                    double temp = arrayrd[j];
                    arrayrd[j] = arrayrd[j + 1];
                    arrayrd[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Task2 a = new Task2();
        double[] array = a.Random();
        a.bubblesort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
