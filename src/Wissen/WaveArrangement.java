package Wissen;

import java.util.Arrays;

public class WaveArrangement {
    private static void danceForm(int n, int[] a) {
        for (int i = 1; i < a.length; i+=2) {
            swap(a,i,i-1);
        }
        System.out.println(Arrays.toString(a));
    }
    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {
        int[] performers = {1, 2, 3, 4, 5, 6, 7};
        danceForm(performers.length,performers);

    }
}

