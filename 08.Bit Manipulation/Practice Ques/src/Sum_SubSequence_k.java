public class Sum_SubSequence_k {
    public static void main(String[] args) {
        int[] arr = {6,8,3,2,4,1,9,10};
        int k = 57;
        System.out.println(SumSubSequence_equal_k(arr , k));

    }
    // TC = O( 2 power N  )
    static boolean SumSubSequence_equal_k(int[] arr , int k ){
        for(int i=0; i<(1<<arr.length); i++){
            int sum = 0;
            for(int j=0 ; j<arr.length; j++){
                if(CheckIthBit(i , j)){
                    sum += arr[j];
                }
            }
            if(sum == k){
                return true;
            }
        }
        return false;
    }
    static boolean CheckIthBit(int num , int i){
        return ((num >> i) & 1 ) == 1;
    }

}
