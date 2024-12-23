package app;

import java.util.Arrays;
import java.util.Scanner;

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

        Scanner scan = new Scanner(System.in);
        System.out.print("\nEnter int number: ");
        int key = scan.nextInt();

        int low = 0;
        int high = array.length - 1;
        int index = -1;

        while (low <= high){
            int middle = (low + high) / 2;
            if (array[middle] == key){
                index = middle;
                break;
            } else if (array[middle] < key) {
                low = middle + 1;
            }else {
                high = middle - 1;
            }
        }
        if (index == -1){
            System.out.println("3) There is no number that you entered");
        }else {
            System.out.println("3) Entered number is " + key + "." +
                    " Its index is " + index + ".");
        }
    }
}
