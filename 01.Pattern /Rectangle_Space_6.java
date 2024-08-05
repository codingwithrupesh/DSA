import java.util.Scanner;

public class Rectangle_Space_6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the hight of the pyramid :");
        int hight = s.nextInt();

// Method 1
//        for (int row = 1; row <= hight; row++){
//            for (int col = 0 ; col <= hight; col++){
//                if(col==0 || col == hight){
//                    System.out.print("*");
//                }
//                else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
// Method 2 easy method
        for (int row = 1; row <= hight; row++){
            System.out.print("*");
            for (int col = 1 ; col <= hight; col++){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }

    }
}
