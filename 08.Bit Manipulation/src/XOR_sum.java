import java.util.Scanner;

public class XOR_sum {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter both A and B number to find XOR sum :");
        int a = s.nextInt();
        int b = s.nextInt();

        System.out.println(a^b);
    }
}
