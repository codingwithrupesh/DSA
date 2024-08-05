import java.util.Scanner;
//  isEven using Function
public class isEven {
    public static boolean  isEven(int num){
        boolean b = num % 2 == 0;
        return b;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a no ");
        int num = s.nextInt();

        //isEven  using conditional Statement
        boolean b = true;
        b = num % 2 == 0;
        System.out.println(b);

        System.out.println(isEven(num));

    }
}
