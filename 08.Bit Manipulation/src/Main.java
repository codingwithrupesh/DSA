import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Decimal Number : ");
        int num  = sc.nextInt();
        System.out.println("Enter the Base of conversion : ");
        int base = sc.nextInt();

        while(num > 0){
            int rem = num % base;
            System.out.print(rem + " ");
            num /= base;
        }
    }
}