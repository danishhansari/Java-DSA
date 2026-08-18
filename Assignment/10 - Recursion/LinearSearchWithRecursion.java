import java.util.ArrayList;
import java.util.List;

public class LinearSearchWithRecursion {
    public static void main(String[] args) {
        int [] arr = {1,0, 3, 9, 2, 4, 8, 9};
        int target = 9;
        System.out.print(search(arr, target, 0));
        System.out.print(" " + findIndex(arr, target, 0));
        System.out.println(" " + findIndexLast(arr, target, arr.length - 1));
        List<Integer> list = new ArrayList<>();
        List<Integer> newList = findAllIndex(arr, target, 0, list);
        System.out.println(newList);
        System.out.println(list.hashCode() + " " + newList.hashCode());
    }

    public static boolean search (int [] arr, int target, int i) {
        if (i == arr.length ) { return false; }
        return arr[i] == target || search(arr, target, ++i);
    }

    public static int findIndex(int [] arr, int target, int i) {
        if(i > arr.length - 1) { return -1; }
        if(arr[i] == target) {
            return i;
        }
        return findIndex(arr, target, ++i);
    }

    public static int findIndexLast(int [] arr, int target, int i) {
        if(i == -1) return i;
        if(arr[i] == target) return i;
        return findIndexLast(arr, target, --i);
    }
    public static List<Integer> findAllIndex(int [] arr, int target, int i, List<Integer> list) {
        if(i > arr.length - 1) return list;
        if (arr[i] == target) list.add(i);
        return findAllIndex(arr, target, i + 1, list);
    }
}
