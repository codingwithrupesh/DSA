import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,24,-42, 0, 3, 8};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    // Time Complexity = O ( N^2 ) in best and worst case
//     Space Complexity = O(1) and it is not a Stable sorting algorithms
    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length ; i++) {
            // find the max item in the Remaining array and swap with correct index
            int lastIndex = arr.length - 1 - i;
            int maxIndex = getMaxIndex(arr , 0 , lastIndex) ;
            swap(arr , maxIndex , lastIndex) ;
        }
    }
    // swap the element
    static void swap(int[] arr , int first , int second) {
//       int temp = arr[first] ;
//       arr[first]  = arr[second] ;
//       arr[second]  = temp ;
        BubbleSort.swap(arr, first, second);
    }
    //  find the maximum index of the element present in this array
    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start ;
        for (int i = start; i <= end; i++) {
            if(arr[max]  < arr[i]) {
                max = i ;
            }
        }
        return max ;
    }
}
