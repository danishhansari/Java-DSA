import java.util.ArrayList;
import java.util.List;

public class ReturnListFromRecursion {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4, 6, 4};
        int target = 4;
        List<Integer> ans = find(arr, target, 0);
        System.out.println(ans);
    }
    public static List<Integer> find(int [] arr, int target, int i) {
        List<Integer> list = new ArrayList<>();
        if (i == arr.length) {
            return list;
        }
        if(arr[i] == target) {
            list.add(i);
        }
        List<Integer> ans = find(arr, target, i + 1);
        ans.addAll(list);
        return ans;
    }
}
