import java.util.Scanner;

public class Space_Pyramid {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the height of the pyramid :");
        int height = s.nextInt();

        for (int row = 1; row <= height; row++){
            for (int col = 1 ; col <= height-row; col++){
                System.out.print(" ");
            }
            for(int col = 1; col <= row; col++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
