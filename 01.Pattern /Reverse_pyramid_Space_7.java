import java.util.Scanner;

public class Reverse_pyramid_Space_7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the hight of the pyramid :");
        int hight = s.nextInt();
        for (int row = 1; row <= hight; row++){
            System.out.print("*");
            for (int col = 1 ; col <= hight-row; col++){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
    }
}
