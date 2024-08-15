import java.util.Scanner;

public class AllDigitSum {
    public static int allDigitSum(int num){
        int sum = 0 ;
        while(num >0){
            int lastDigit = num % 10;
            sum += lastDigit;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter any number :->  ");
        int num = s.nextInt();
        System.out.println("Sum of all digit of "+num+" = "+allDigitSum(num));
    }
}
