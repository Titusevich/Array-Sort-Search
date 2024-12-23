package app;

import java.util.Arrays;

public class Main {
    static int[] array;

    public static void main(String[] args) {

        array = new int[]{14, 56, 7, 9, 6, 81, 17, 36, 64, 73, 13, 66, 49, 28, 2};
        System.out.println("\n1) Not sorted numbers of array:\n" +
                Arrays.toString(array));

        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && key < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
        System.out.println("\n2) Sorted numbers of array:\n" +
                Arrays.toString(array));
    }
}
