import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the no of rows in a pattern :");
        int m = s.nextInt();
        System.out.print("Enter the no of column in a pattern :");
        int n = s.nextInt();

        for (int row = 0; row < m;  row++){
            for (int col = 0; col < n;  col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
