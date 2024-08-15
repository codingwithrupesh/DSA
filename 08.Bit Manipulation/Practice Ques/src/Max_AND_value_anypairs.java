public class Max_AND_value_anypairs {
    /* Given an N array of non-negative no and return max '&' value of any pairs
    eg   A : {27 , 18 20 }
    return max ( A[i] , A[j] )  */
    public static void main(String[] args) {
        int[] arr = {26,13,23,28,27,7,25};
        System.out.println(Find_Max_AND_valuePairs(arr));


    }
    // TC = O( size of Array Datatypes * N )  and SC = ( 1 )
    static int Find_Max_AND_valuePairs(int[] arr){
        int ans = 0;
        // iterate over all bits and count set Bits
        for(int i=31; i>=0; i--){
            int CountSetBit = 0;
            for (int value : arr) {
                if (CheckIthBitSet(value, i)) {
                    CountSetBit++;
                }
            }
            // if set bits is greater than 1 then setIthBit in ans and make unset bit value is 0
            if(CountSetBit >= 2){
                ans = SetIthBit(ans , i);
                // iterate all array value and make unset bit array value is 0
                for(int j =0; j<arr.length;  j++){
                    if(!CheckIthBitSet(arr[j] , i)){
                        arr[j] = 0;
                    }
                }
            }
        }
        return ans;
    }
    // Check Ith Bit is Set or not using Right shift operator
    static boolean CheckIthBitSet(int num , int i){
        return ((num >> i) & 1) == 1;
    }
    static int SetIthBit(int num , int i){
        int mask = 1 << i;
        return num | mask ;
    }
}
