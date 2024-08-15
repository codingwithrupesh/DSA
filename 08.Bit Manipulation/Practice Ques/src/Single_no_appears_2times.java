import java.util.Arrays;
import java.util.List;

public class Single_no_appears_2times {
    public static void main(String[] args) {
        int[] arr = {3,6,4,4,6,8};
        List<Integer> ls = Find_both_distinct_element(arr);
//        Print(ls);
    }

    // using XOR operation
    // T.C = O(N) and S.C = O( 1 )
    static List<Integer> Find_both_distinct_element(int[] arr){
        // XOR of all the elements
        int xor = 0;
        for(int i : arr){
            xor = xor ^ i;
        }
        // Find One position where XOR has a Set Bit
        int pos = 0;
        for(int i=0; i<32; i++){
            if(CheckIthBit(arr[i] , i)){
                pos = i;
                break;
            }
        }
        // Collect the XOR of all no. with a set bit at position p in ans1 and ans2
        int ans1 = 0, ans2 = 0;
        for(int i=0; i<arr.length; i++){
            if(CheckIthBit(arr[i] , pos)){
                ans1 = ans1 ^ arr[i];
            }else{
                ans2 = ans2 ^ arr[i];
            }
        }
        return Arrays.asList(ans1 , ans2);
    }
    // Check Ith Bit is Set or Not
    static boolean CheckIthBit(int num , int pos){
        return ((num >> pos) & 1) == 1 ;
    }
    // Print List
    static void Print(List<Integer> ls){
        for(int i : ls){
            System.out.print(i + " ");
        }
    }

    // method 1 Using Hashmap
//    T.C = O( N ) and S.C = O( N )
//    static List<Integer> Find_both_distinct_element(int[] arr){
//        HashMap<Integer, Integer> hm = new HashMap<>();
//        List<Integer> ls = new ArrayList<>();
//        for(int i : arr){
//            if(hm.containsKey(i)){
//                int freq = hm.get(i);
//                hm.put(i,freq+1);
//            }else{
//                hm.put(i , 1);
//            }
//        }
//        for(int i : arr){
//            int freq = hm.get(i);
//            if(freq == 1 && !ls.contains(i)){
//                ls.add(i);
//            }
//        }
//        return ls;
//    }
}
