import java.util.Scanner;

public class PrimesInRange {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(" Enter a range to print prime no :-> ");
        int n = s.nextInt();
        printPrimeInRange(n);

    }
    public static void printPrimeInRange(int n){
        System.out.println("Prime number between 2 to "+n+" = ");
        for (int i = 2; i<=n; i++){
            if(isPrime(i)) {
                System.out.print(i + " , ");
            }
        }
    }
    public static boolean isPrime(int n) {
        if( n == 2){
            return true;
        }
        for(int i = 2; i<=Math.sqrt(n); i++){
            if( n % i == 0){
                return false;
            }
        }
        return true;
    }
}
