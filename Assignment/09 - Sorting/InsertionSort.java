import danish.Swap;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int [] arr = {1,5,2,9, 10, 4,6,102};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if(arr[j] > arr[j - 1]) {
                    Swap.swap(arr, j, j - 1);
                } else {
                    System.out.println("I got break " + arr[j] + " " +  arr[j - 1]);
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
