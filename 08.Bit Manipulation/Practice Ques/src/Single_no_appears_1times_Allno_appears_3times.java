public class Single_no_appears_1times_Allno_appears_3times {
    public static void main(String[] args) {
        int[] arr = {5,7,5,7,11,11,9,5,11,7};
        System.out.println(Find_Distinct_no(arr));

    }
    //
    static int Find_Distinct_no(int[] arr){
        int ans = 0;
        for (int i=0; i<32; i++){
            int count = 0;
            // count the Ith bit of all number
            for (int j=0 ; j<arr.length; j++){
                if(CheckIthBit(arr[j] , i)){
                    count++;
                }
            }
            // if count is more than multiple of 3 then find ans using Count % 3
            if(count % 3 != 0){
                ans = SetIthBit(ans , i);
            }
        }
        return ans;
    }
    // Check Ith Bit is set or not using Left Shift
    static boolean CheckIthBit(int num , int pos){
        return !((num & (1 << pos)) == 0);
    }
    // Set Ith Bit
    static int SetIthBit(int num , int pos){
        //left shift 1 position times
        int mask = 1 << pos;
        return num | mask ;
    }



    // using hashmap
    // T.C = O( N ) and S.C = O(N)
//    static int Find_Distinct_no(int[] arr){
//        HashMap<Integer, Integer> hm = new HashMap<>();
    // put all the values in HashMap
//        for(int i : arr){
////            if(hm.containsKey(i)){
////                int freq = hm.get(i);
////                hm.put(i , freq + 1);
////            }else{
////                hm.put(i , 1);
////            }
//            hm.put(i, hm.getOrDefault(i, 0) + 1);
//
//        }
//        for(int i : hm.keySet()){
//            if(hm.get(i) == 1 ){
//                return i;
//            }
//        }
//        return -1;
//    }
}
