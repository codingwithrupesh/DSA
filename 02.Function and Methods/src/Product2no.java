import java.util.Scanner;

public class Product2no {
    public static int product(int a , int b){
        return a*b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two no ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int multiply = product(a,b);
        System.out.println("Product of "+a+" and "+b+" = "+multiply);
    }
}
