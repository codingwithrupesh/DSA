import java.util.ArrayList;
import java.util.Scanner;

public class Decimal_to_Any_Base {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Decimal Number : ");
        int num  = sc.nextInt();
        System.out.println("Enter the Base of conversion : ");
        int base = sc.nextInt();
        System.out.print("Base "+base+" of decimal number "+num+" = ");
        ArrayList<Integer> arr = new ArrayList<>();

        while (num > 0){
            int rem = num % base;
            arr.add(rem);
            num /= base;
        }
        for(int i=arr.size()-1; i>=0; i--){
            System.out.print(arr.get(i)+" ");
        }
    }
}
