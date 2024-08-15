import java.util.HashMap;

public class Check_subArray_0_Sum_06 {
    public static void main(String[] args) {
        int[] arr1 = {1,-1,-2,2};
        int[] arr2 = {1,2,3,4,5};
        System.out.println(Check_subArray_0_sum(arr1));
    }
    // using prefix array
//    static boolean Count_subArray_0_sum(int[] arr){
//        // Create Prefix array
//        int[] pf = new int[arr.length];
//        for(int i=0; i<arr.length; i++){
//            if(i == 0){
//                pf[i] = arr[i];
//            }else{
//                pf[i] = pf[i-1] + arr[i];
//            }
//        }
//        Set<Integer> set = new HashSet<>();
//        for(int i :pf){
//           set.add(i) ;
//        }
//
//        return set.contains(0);
//    }
    // using carry forward array
    static  boolean Check_subArray_0_sum(int[] arr){
        HashMap<Integer,Integer> hm = new HashMap<>();

        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum += arr[i];
            if(sum == 0 || hm.containsKey(sum) ){
                return true;
            }
            hm.put(sum , i);
        }
        return false;
    }
}
