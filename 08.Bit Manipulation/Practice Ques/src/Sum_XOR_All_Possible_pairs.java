public class Sum_XOR_All_Possible_pairs {
    public static void main(String[] args) {
        int[] arr = {3,5,6,8};
        System.out.println(Sum_XOR_All_PossiblePairs(arr));
        System.out.println((Sum_XOR_All_Possiblepair(arr)));

    }
    // Brute Force
    // T.C = O(N2) SC = O(1)
    static long Sum_XOR_All_PossiblePairs(int[] arr){
        long sum = 0;
        for(int i=0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                sum += (arr[i] ^ arr[j]);
            }
        }
        return sum;
    }
    // using Contribution technique
    static int Sum_XOR_All_Possiblepair(int[] arr){
        int sum = 0;
        // iterate over all the bits and count total set and unset bit
        for(int i=0; i<32; i++){
            int CountSetBits = 0;
            int CountUnsetBits = 0;
            for (int k : arr) {
                if (CheckIthBit_Set(k, i)) {
                    CountSetBits++;
                } else {
                    CountUnsetBits++;
                }
            }
            sum = sum + (CountSetBits * CountUnsetBits * (1 << i));

        }
        return sum;
    }
    // Check Ith Bit is set or not
    static boolean CheckIthBit_Set(int num , int i){
        return ((num >> i) & 1) == 1;
    }
}
