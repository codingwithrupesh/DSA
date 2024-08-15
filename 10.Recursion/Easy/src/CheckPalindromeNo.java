public class CheckPalindromeNo {
    public static void main(String[] args) {
        int n = 1234321 ;
        System.out.println(n + " is a Palindrome Number : " + palindrome(n));
    }

    private static boolean palindrome(int n) {
        return n == rev(n) ;
    }
    public static int rev(int n) {
        // sometimes you might need some additional variables in the argument
        // in that case , make another helper function
        int digit = (int) Math.log10(n) + 1 ;
        return helper(n , digit) ;
    }

    private static int helper(int n, int  digit) {
        if(n%10 == 0){
            return n ;
        }
        int rem = n % 10 ;
        return rem * (int)Math.pow(10, digit - 1) + helper(n/10 , digit - 1) ;
    }
}
