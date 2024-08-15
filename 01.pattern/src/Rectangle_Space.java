import java.util.Scanner;

public class Rectangle_Space {
    public static void main(String[] args) {


        Scanner s = new Scanner(System.in);
        System.out.print("Enter the height of the pyramid :");
        int height = s.nextInt();

        // Method 1
        //        for (int row = 1; row <= height; row++){
        //            for (int col = 0 ; col <= height; col++){
        //                if(col==0 || col == height){
        //                    System.out.print("*");
        //                }
        //                else{
        //                    System.out.print(" ");
        //                }
        //            }
        //            System.out.println();
        //        }
        // Method 2 easy method
        for (int row = 1; row <= height; row++) {
            System.out.print("*");
            for (int col = 1; col <= height; col++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }
    }
}
