import danish.Swap;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
//         it's only work on where we have 0 to n number or 1 to n but that shouldn't be missed
        int [] arr = { 0, 5, 3, 4, 1, 2};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void cyclicSort(int [] arr) {
        int i = 0;
        while(i < arr.length) {
            int correctIndex = arr[i];
            if (arr[correctIndex] != arr[i]) {
                Swap.swap(arr, correctIndex, i);
            } else {
                i++;
            }
        }
    }
}
