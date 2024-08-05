import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 5,4,6,-6,0 ,80 };
        insertionSort(arr) ;
        System.out.println(Arrays.toString(arr));
    }
    static void insertionSort(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            for (int j = i+1 ; j > 0 ; j--) {
                if(arr[j] < arr[j-1]){
                    BubbleSort.swap(arr , j , j-1);
                }else {
                    break ;
                }
            }
        }
    }
}
