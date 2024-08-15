import java.util.Scanner;

public class Star_half_Pyramid {
    public static void star_half_Pyramid(int x ) {

        for(int i = 1 ; i<=x ; i++){

            for(int j=1; j<=i ;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no. of rows if you want to print Star Pattern");
        int n = sc.nextInt();
        star_half_Pyramid(n);
    }
}
