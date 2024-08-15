public class ProductOfDigitNo {
    public static void main(String[] args) {
        int n = 23452 ;
        System.out.println("Sum of all Digits of " + n + " is : " + prodDigit(n) );
    }

    private static int prodDigit(int n) {
        if(n%10 == n) return n;

        return n%10 * prodDigit(n/10);
    }
}
