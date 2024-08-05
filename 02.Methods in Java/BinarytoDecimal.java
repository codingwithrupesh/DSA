import java.util.*;
import java.lang.*;

public class BinarytoDecimal {
    public static void BinarytoDecimal( int binary){
        int myno = binary;
       int  pow = 0;
       int deci = 0;
       while(binary > 0){
           int lastdigit = binary % 10;
           deci = deci + (int) Math.pow(2,pow) * lastdigit;
           binary /= 10;
           pow++;
       }
        System.out.println("Decimal of Binary digit "+myno+" = "+deci);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any binary no ");
        int binary = sc.nextInt();
        BinarytoDecimal(binary);
    }
}
