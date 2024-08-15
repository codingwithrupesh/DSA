import java.util.Scanner;

public class Sumof2no_with_para {
    public static void calculateSum( double num1, double num2){
        double sum = num1 + num2;
        System.out.println("sum of "+num1+" and "+num2+ " ="+sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two no ");
        double a = sc.nextDouble();
        double b= sc.nextDouble();
        calculateSum(a,b );

    }
}
