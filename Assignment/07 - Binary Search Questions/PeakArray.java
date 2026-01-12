public class PeakArray {
    public static void main(String[] args) {
        int [] arr = {0,10,5,2};
        int max = arr[0];
        int count = 0;
        for(int i = 0; i< arr.length; i++) {
            if(max < arr[i]){
                max = arr[i];
                count = i;
            }
        }
        System.out.println(max + "" + count);
    }
     
}
