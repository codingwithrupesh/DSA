public class DigitSumOfNo {
    public static void main(String[] args) {
        int n = 23452 ;
        System.out.println("Sum of all Digits of " + n + " is : " + sumDigit(n) );
    }

    private static int sumDigit(int n) {
        if(n%10 == n) return n;

        return n%10 + sumDigit(n/10);
    }
}
