import java.util.Scanner;

public class PrintLastDigit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number :");
        int num = s.nextInt();
        System.out.println("Last digit of "+num+" = "+(num%10));

    }
}
