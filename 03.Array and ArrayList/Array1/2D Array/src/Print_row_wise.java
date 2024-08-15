import java.util.Scanner;

public class Print_row_wise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] arr = {{3,8,9,2},{1,2,3,4},{4,10,11,17}};
        for (int[] i : arr) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
