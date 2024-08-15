import java.util.Scanner;

public class NegativeElements {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter the size of an array : ");
            int size= s.nextInt();
            System.out.println("Enter a Array of integers: ");
            int[] arr = new int[size];
            for(int i=0; i<size; i++){
                arr[i] = s.nextInt();
            }
            PrintNegativeElements(arr);
        }


    }
    static void PrintNegativeElements(int[] arr) {
        System.out.println("Negative elements of array: ");
        for (int j : arr) {
            if (j < 0) {
                System.out.println(j + " ");
            }
        }
    }
}
