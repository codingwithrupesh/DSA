import java.util.Scanner;

public class Hollow_Rectangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of rows in a Hollow Rectangle pattern   ");
        int n = s.nextInt();
        System.out.print("Enter no. of columns in a Hollow Rectangle Pattern  ");
        int m = s.nextInt();
        hollow_Rectangle(n, m);
    }
    public static void hollow_Rectangle(int x , int y){
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= y; j++) {
                if( i == 1 | i == x | j == 1 | j == y){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");

                }
            }
            System.out.println();
        }
    }

}
