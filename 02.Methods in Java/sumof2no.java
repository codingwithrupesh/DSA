import java.util.Scanner;

public class sumof2no {
    public static void calculatesum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two no ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double sum = a + b ;
        System.out.println("sum of "+a+" and "+b+ " ="+sum);
    }

    public static void main(String[] args) {
        calculatesum();
    }
}
