public class Calculate_HCF_2_no_01 {
    public static void main(String[] args) {
        int a = 30 , b = 18 ;
        System.out.println(GCD_BruteForce(a ,b ));
        System.out.println(GCD_Recursion(a , b));
        System.out.println(GCD(a , b));

    }
    // idea 3 : Using Modules operator using recursion
    // TC = O ( Log N )
    static int GCD( int a , int b){
        if(a == 0 | b == 0){
            return a+b;
        }
        return GCD(b , a % b);
    }

    // idea 2 : using Recursion ( b , a-b )
    // TC = O ( N )
    static int GCD_Recursion(int a , int b){
        if(a < b){
            int temp = a ;
            a = b ;
            b = temp;
        }
        if(b == 0){
            return a;
        }
        return GCD_Recursion(b , a - b);
    }

    // idea 1 : Brute Force Method
    // TC = ( N )
    static int GCD_BruteForce(int a , int  b){
        a = Math.abs(a);
        b = Math.abs(b);
        if(a == 0 | b == 0){
            return a+b ;
        }
        int gcd = 1;
        for(int i = 2; i<= Math.min(a , b) ; i++){
            if(a % i == 0 && b % i == 0){
                gcd = i;
            }
        }
        return gcd;
    }
}
