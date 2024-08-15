import java.util.Scanner;

public class isEven {
    public static boolean  checkEven(int num){
        return num % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a no ");
        int num = s.nextInt();

        //isEven  using conditional Statement
        boolean b;
        b = num % 2 == 0;
        System.out.println(b);

        System.out.println(checkEven(num));

    }
}
