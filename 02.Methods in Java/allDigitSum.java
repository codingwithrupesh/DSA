import java.util.*;

public class allDigitSum {

    public static int alldigitsum(int num){
        int sum = 0 ;
        while(num >0){
            int lastdigit = num % 10;
            sum += lastdigit;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter any number :->  ");
        int num = s.nextInt();
        System.out.println("Sum of all digit of "+num+" = "+alldigitsum(num));
    }
}
