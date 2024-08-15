import java.util.Scanner;

public class Mix_numAndPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the hight of the pyramid :");
        int height = s.nextInt();

        for (int i = 1; i <= height; i++){
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
