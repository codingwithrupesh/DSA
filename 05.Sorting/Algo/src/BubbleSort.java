import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3,1,5,4,2};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    //    Time complexity = O( N^2) in worst case and Best case = O( N )
//    Space Complexity = O( 1 ) means Constant then it has also known as Inplace Sorting Algorithm
    public static void bubbleSort(int[] arr){
        boolean swapped ;
        // run the steps in n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            // for each step , max item will come at the last respective index
            for (int j = 1; j < arr.length - i ; j++) {
                // swap if the item is smaller than the previous item
                if(arr[j] < arr[j-1]){
                    swap(arr , j , j-1);
                    swapped = true;
                }
            }
            // if you did not swap for a particular value of i , it means the array is sorted , Hence stop the program
            if(!swapped){
                break ;
            }
        }
    }
    static void swap(int[] arr, int first, int Second){
        int temp = arr[first];
        arr[first] = arr[Second];
        arr[Second] = temp;
    }
}
