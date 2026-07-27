import danish.Swap;

import java.util.Arrays;

import static danish.Swap.swap;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {8, 0, 12,4,2, 18, 99, 129};
        System.out.println(Arrays.toString(selectionSort(arr)));
    }

    private static int[] selectionSort(int[] arr) {
        for ( int i = 0; i < arr.length; i ++) {
            int lastIndex = arr.length - i - 1;
            int max = getMax(arr, 0, lastIndex);
            swap(arr, max, lastIndex);
        }
        return arr;
    }

    public static int getMax(int [] arr, int start, int end) {
        int max = start;
        for ( int i = start; i <= end; i ++) {
            if ( arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }
}
