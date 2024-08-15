import java.util.Scanner;

public class Any_base_to_Decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base of a input Number : ");
        int base  = sc.nextInt();
        System.out.println("Enter the number of base "+base+" : ");
        int num = sc.nextInt();
        System.out.print("Decimal of "+num+" base "+base+" = ");



        double total = 0;
        int pow =  0;
        while(num > 0){
            int last_digit = num % 10;
            total = total + last_digit * (Math.pow(base , pow++));
            num /= 10;
        }
        System.out.println(total);
    }
}
