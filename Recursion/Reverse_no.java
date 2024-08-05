public class Reverse_no {
    public static void main(String[] args) {
//        reverse1(3425);
//        System.out.println("Reverse no. :"+rev);
        System.out.println("Reverse no. :"+reverse2(256));

    }
    // 1st method
    static int rev =0;
    static void reverse1(int n ){
        if( n == 0){
            return ;
        }
        int rem = n%10;
        rev = rev *10 +rem;
        reverse1(n/10);

    }
    // 2nd method
    // sometimes u might need some additional variables in the argument
    // in case that make another function
    static int reverse2(int n){
        int digits = (int)(Math.log10(n))+1;
        return helper(n, digits);
    }

    private static int  helper(int n, int digit) {
        if(n%10 == n){
            return n;
        }
        int rem = n%10;
        return rem * (int) Math.pow(10 , digit -1) + helper(n/10 , digit-1);

    }
}
