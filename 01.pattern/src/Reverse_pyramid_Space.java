import java.util.Scanner;

public class Reverse_pyramid_Space {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the height of the pyramid :");
        int height = s.nextInt();
        for (int row = 1; row <= height; row++){
            System.out.print("*");
            for (int col = 1 ; col <= height-row; col++){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
    }
}
