public class Palindrome_no {
    public static void main(String[] args) {
        System.out.println(ispalindrome(121));


    }
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
    static boolean ispalindrome(int n){
        return n == reverse2(n);

        }
}

