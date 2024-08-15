import java.util.Scanner;

public class Solid_Rectangle {

    public static void solid_Rectangle(int x , int y){
        for (int i = 1; i <= x; i++) {
            for (int j = 1; j <= y; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args){
        Scanner v = new Scanner(System.in);
        System.out.print("Enter no. of rows in a Solid Rectangle pattern   ");
        int n = v.nextInt();
        System.out.print("Enter no. of columns in a Solid Rectangle Pattern  ");
        int m = v.nextInt();
        solid_Rectangle(n, m);
    }
}
