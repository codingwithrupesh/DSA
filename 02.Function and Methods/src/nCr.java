import java.util.Scanner;

public class nCr {
    public static int binocoff(int n , int r){
        int fact_n = fact(n);
        System.out.println(fact_n);
        int fact_r = fact(r);

        int fact_n_minus_r = fact(n-r);
        int ncr = fact_n / (fact_r*fact_n_minus_r) ;

        return ncr;
    }


    public static int fact(int num) {
        // Factorial Function
        int f = 1;
        for (int i = num; i >= 1; i--) {
            f = (f * i);
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(" Enter number of Binomial coefficient  :-");
        int n = s.nextInt();
        System.out.println("Enter number of Binomial coefficient  :-");
        int r = s.nextInt();
        int ncr = binocoff(n ,r );
        System.out.println("Binomial coefficient of "+n+" and "+r+" = "+ncr);
    }
}
