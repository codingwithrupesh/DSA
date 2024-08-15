public class SumOfNumber {
    public static void main(String[] args) {
        int n = 5 ;
        System.out.println("Sum of " +n+ " is : " + sum(n));
    }
    static int sum(int n) {
        if(n <= 1){
            return n ;
        }
        return n + sum(n-1);
    }
}
