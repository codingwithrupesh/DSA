import java.util.Scanner;

public class Half_Pyramid_Reverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the hight of the pyramid :");
        int height = s.nextInt();

// Method 1
//        for (int row = height; row >= 1; row--){
//            for (int col = row ; col >= 1; col--){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

// Method 2 : Optimised
        for (int row = 1; row <= height; row++){
            for (int col = 1 ; col <= (height+1)-row; col++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
