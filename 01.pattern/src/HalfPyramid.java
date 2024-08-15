import java.util.Scanner;

public class HalfPyramid {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the hight of the pyramid :");
        int height = s.nextInt();

        for (int i = 1; i <= height; i++){
            for (int j = 1 ; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
