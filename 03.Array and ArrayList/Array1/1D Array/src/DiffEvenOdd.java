import java.util.Scanner;

public class DiffEvenOdd {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter the size of an array : ");
            int size= s.nextInt();
            System.out.println("Enter a Array of integers: ");
            int[] arr = new int[size];
            for(int i=0; i<size; i++){
                arr[i] = s.nextInt();
            }
            int result = FindResult(arr);
            System.out.println("Difference between even and odd present in array : " + result);
        }

    }
    static int FindResult(int[] arr){
        int even = 0;
        int odd = 0 ;
        for (int j : arr) {
            if (j % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        return Math.abs(even - odd);
    }
}
