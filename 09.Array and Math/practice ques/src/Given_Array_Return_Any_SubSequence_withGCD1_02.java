public class Given_Array_Return_Any_SubSequence_withGCD1_02 {
    /* given an array . return true if there exist any sub-sequence with gcd = 1 */
    public static void main(String[] args) {
        int[] arr = { 6 , 15 , 30 , 10 , 150};
        System.out.println(Check_GCD_Equals1(arr));

    }
    static boolean Check_GCD_Equals1 (int[] arr){
        int gcd = 0;
        for (int j : arr) {
            if (GCD(gcd, GCD(j , j+1)) == 1) {
                return true;
            }
        }
        return false ;
    }
    static int GCD (int a , int b){
        if(a ==0 | b == 0){
            return a+b;
        }
        return GCD( b , a % b);
    }
}
