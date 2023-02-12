package Arrays;

import java.util.Arrays;

public class HarmonicMean {
    public static void main(String[] args) {
        int[] list = {1, 2, 3, 4, 5};
        System.out.print("Diziniz : " + Arrays.toString(list));

        double sum = 0.0;

        for (int i = 0; i < list.length; i++) {
            sum += 1.0 / list[i];
        }
        double harmonicMean = list.length / sum;
        System.out.println("\nDizinin harmonik ortalaması : " + harmonicMean);
    }
}
