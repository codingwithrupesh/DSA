import java.util.Arrays;

public class SetMisMatch {
    // Leetcode : https://leetcode.com/problems/set-mismatch/description/
    public static void main(String[] args) {
        int[] arr = {1,2,2,4} ;
        int[] ans = findErrorNums(arr) ;
        System.out.println(Arrays.toString(ans));
    }
    // TC = O( N ) using Cyclic Sort
    public static int[] findErrorNums(int[] arr) {
        int i = 0 ;
        while(i < arr.length){
            int correctIndex = arr[i] -1 ;
            if(arr[i] != arr[correctIndex]){
                swap(arr , i , correctIndex) ;
            }else{
                i++ ;
            }
        }
        int[] ans = new int[2] ;
        for(int index = 0 ; index < arr.length ; index++){
            if(arr[index] != index + 1){
                ans[0] = arr[index] ; // return index value
                ans[1] = index + 1 ;  // return correct value present on this index
                break ;
            }
        }
        return ans ;
    }
    static void swap (int[] arr , int first , int second ){
        FindDuplicate.swap(arr, first, second);
    }
}
