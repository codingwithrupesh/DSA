import java.util.Arrays;

public class CycleSort {
    // When given no. from range 1 to N then we use CycleSort Algo for optimal sort
    // TC = O( N )
    // SC = O( 1 )
    public static void main(String[] args) {
        int[] arr = {3,2,4,1,5};
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cycleSort(int[] arr) {
        int i = 0;

        while (i < arr.length) {
            int correctIndex = arr[i] - 1; // Calculate where the element should be

            if (arr[i] != arr[correctIndex]) { // Check if the element is at its correct position
                swap(arr, i, correctIndex); // Swap elements to put the current element in its correct position
            } else {
                i++; // Move to the next element if current element is in its correct position
            }
        }
    }


    static void swap(int[] arr, int i, int correctIndex) {
        int temp = arr[i] ;
        arr[i] = arr[correctIndex] ;
        arr[correctIndex] = temp ;
    }
}
