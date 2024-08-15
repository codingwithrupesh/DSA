public class ReverseNumber {
    // Method 1st
    static int sum = 0 ;
    public static void reverseDigit1(int n) {
        if(n == 0){
            return ;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        reverseDigit1(n/10);
    }
    // Method 2nd
    public static int reverseDigit2(int n) {
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


    public static void main(String[] args) {
        int num = 1234;
        reverseDigit1(num);
        System.out.println(sum);

        // Method 2
        System.out.println("Reverse of "+ num +" using recursion is : " + reverseDigit2(num));

    }
}
