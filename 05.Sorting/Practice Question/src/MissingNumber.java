import java.util.Arrays;

public class MissingNumber {
    // Leetcode : https://leetcode.com/problems/missing-number/

    // TC = O( N )
    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1} ;
        int ans = missingNumber(arr) ;
        System.out.println("Missing Number in " + Arrays.toString(arr) + "  array is : " + ans);
    }
    static int missingNumber(int[] arr) {
        // sort the array using Cyclic Sort
        int i = 0 ;
        while(i < arr.length){
            int correctIndex = arr[i] ;
            if(arr[i] < arr.length && arr[i] != arr[correctIndex]){
                swap(arr , i , correctIndex) ;
            }else{
                i++ ;
            }
        }

        // find missing no
        for(int j=0 ; j < arr.length ; j++){
            if(j != arr[j]){
                return j ;
            }
        }
        return arr.length ;
    }
    // swap the no
    static void swap(int[] arr , int first ,int second ){
        int temp = arr[first] ;
        arr[first] = arr[second] ;
        arr[second] = temp ;
    }
}
