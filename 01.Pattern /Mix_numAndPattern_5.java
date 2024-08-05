import java.util.Scanner;

public class Mix_numAndPattern_5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the hight of the pyramid :");
        int hight = s.nextInt();

        for (int i = 1; i <= hight; i++){
            for (int j = 1 ; j <= i; j++){
                if(j % 2 == 0){
                    System.out.print(j);
                }
                else{
                    System.out.print("*");

                }
            }
            System.out.println();
        }
    }
}
