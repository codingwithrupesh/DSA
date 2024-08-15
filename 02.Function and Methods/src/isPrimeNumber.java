import java.util.Scanner;

public class isPrimeNumber {
    //    public static boolean isPrime(int n){
//        boolean isPrime = true
//        for(int i= 2; i<=n/2; i++){
//            if(n%i==0){
//                isPrime = false;
//                break;
//              }
//        }
//        return isPrime;
//    }


//    public static boolean isPrime(int n){
//        if(n ==2){
//            return true;
//        }
//        for(int i= 2; i<=n/2; i++){
//            if(n%i==0){
//                return false;
//            }
//        }
//        return true;
//    }

    //optimized isPrime code
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any no ");
        int a = sc.nextInt();
        System.out.println(isPrime(a));
    }
}
