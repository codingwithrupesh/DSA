public class Replace_Ai_into_AAi {
    // Given an array , which contains all elements from 0 to N-1 , Replace A[i] with A[A[i]] for every index i.
    public static void main(String[] args) {
        int[] arr = {3,2,4,1,0};
        System.out.print("Before change the array : ");
        Print_Array(arr);
        Replace_value_Ai_into_AAi(arr);
        System.out.print("After Changes the Array : ");
        Print_Array(arr);

    }
    // TC = O(N) and SC = O(1)
    static void Replace_value_Ai_into_AAi(int[] arr){
        // step 1 : iterate over all the array and multiply with N (length of array )
        for(int i=0; i<arr.length; i++){
            arr[i] = arr[i]*arr.length;
        }
        // step 2 : iterate over all array and divide by N (length of array )
        for(int i=0; i<arr.length; i++){
            arr[i] += arr[arr[i]/arr.length]/arr.length;
        }
        // step 3 : iterate and extract the new value ( A[i] = A[i]%N )
        for(int i=0; i<arr.length; i++){
            arr[i] = arr[i] % arr.length ;
        }

    }
    static void Print_Array(int[] arr){
        for(int i : arr){
            System.out.print(i+ " ");
        }
        System.out.println();
    }
    // Brute Force
    // make an extra array and store value of array in index i position
    // TC = O(N) and SC = O(N)
}
