import java.util.Scanner;

public class Factorial {
    // Factorial Function
    public static int fact(int num) {
        int f = 1;
        for (int i = num; i >= 1; i--) {
            f = (f * i);
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a +ve no :- ");
        int num = s.nextInt();
        int Factorial = fact(num);
        System.out.println(" Factorial of "+num+" = "+Factorial);

    }
}
