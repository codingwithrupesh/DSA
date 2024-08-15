import java.util.HashMap;

public class Count_subArray_0_Sum_07 {
    public static void main(String[] args) {
        int[] arr1 = {1, -1, -2, 2};
        int[] arr2 = {-1, 2, -1};
        System.out.println(Count_subArray_0_sum(arr1));

    }
    // using Prefix Array
//    static void Count_subArray_0_sum(int[] arr){
//        // Create Prefix array
//        int[] pf = new int[arr.length];
//        for(int i=0; i<arr.length; i++){
//            if(i == 0){
//                pf[i] = arr[i];
//            }else{
//                pf[i] = pf[i-1] + arr[i];
//            }
//        }
//        HashMap<Integer , Integer > map = new HashMap<>();
//        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (pf[i] == 0) {
//                count++;
//            }
//            if (map.containsKey(pf[i])) {
//                count += map.get(pf[i]);
//            }
//            map.put(pf[i], map.getOrDefault(pf[i], 0) + 1);
//        }
//        System.out.println(count);
//
//    }

    // using carry forward
    static int Count_subArray_0_sum(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == 0) {
                count++;
            }
            if (map.containsKey(sum)) {
                count += map.get(sum);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
