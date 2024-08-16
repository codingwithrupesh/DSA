import java.util.Arrays;

public class Add_Queries_value_Array0_02 {
    // Time complexity = O( Q+N )
    // Space complexity = O(1)
    public static void main(String[] args) {
        int[] arr = {0,0,0,0,0,0,0,0,0,0,};
        int[][] queries = {{2,4}, {3, -1}, {0,2},{4,1}};
        System.out.print("Before changing array : ");
        System.out.println(Arrays.toString(arr));

        Calculate_Updated_Array(arr , queries);
        System.out.print("After changing all queries Array is : ");
        System.out.println(Arrays.toString(arr));

    }
    static void Calculate_Updated_Array(int[] arr, int[][] queries){
        for(int[] q : queries){
            int idx = q[0];  // index of queries
            int val = q[1];  // value of queries

            arr[idx] += val;  // add queries value in array
        }
        // then make prefix array
        for(int i=1; i<arr.length; i++){
            arr[i] = arr[i] + arr[i-1];
        }
    }
    static void print(int[] arr){
        for(int i : arr){
            System.out.print( i +" ");
        }
        System.out.println();
    }
}
