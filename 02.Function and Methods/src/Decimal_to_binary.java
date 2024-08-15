import java.util.Scanner;

public class Decimal_to_binary {
    public static void DecimaltoBinary(int deci){
        int myno = deci;
        int binary =0;
        int pow = 0;
        while (deci > 0){
            int remender = deci % 2;
            binary = binary + (int)Math.pow(10,pow)*remender;
            deci /= 2;
            pow++;


        }
        System.out.println("binary number of "+myno+" = "+binary);

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter ant +ve number :-> ");
        int deci = s.nextInt();
        DecimaltoBinary(deci);
    }
}
