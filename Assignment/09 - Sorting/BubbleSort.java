import java.util.Arrays;

import static danish.Swap.swap;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {9,30, 0, 11, 4,2,99, 24};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }

    private static int[] bubbleSort(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length; i ++) {
            swapped = false;
            for ( int j = 1; j < arr.length - i ; j ++) {
                if ( arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        return arr;
    }
}
