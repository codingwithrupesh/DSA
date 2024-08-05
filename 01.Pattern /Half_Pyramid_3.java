import java.util.Scanner;

public class Half_Pyramid_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the hight of the pyramid :");
        int hight = s.nextInt();

        for (int i = 1; i <= hight; i++){
            for (int j = 1 ; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
