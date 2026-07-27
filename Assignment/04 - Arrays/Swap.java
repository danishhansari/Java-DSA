package danish;

import java.util.Arrays;

public class Swap{
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6,7,8,9};
        // swap first and last value of an array;;
        swap(arr,0,8);
        System.out.println(Arrays.toString(arr));
    }
    public static void swap(int[] arr, int a, int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]= temp;
    }
}