import java.util.Scanner;

public class DecimalToBinary {
    public static int Binary(int n ){
        int pow = 0;
        int bin = 0;
        while(n>0){
            int rem = n % 2;
            bin = bin + (rem * (int)Math.pow(10,pow));
            pow++;
            n/=2;
        }
        return bin;

    }
    public static void main (String [] args){
        Scanner d = new Scanner(System.in);
        System.out.print("Enter a no.Do you want to convert Decimal into Binary :");
        int num = d.nextInt();
        int Binary = Binary(num);
        System.out.println("Binary no."+num+" = "+Binary);






    }
}
