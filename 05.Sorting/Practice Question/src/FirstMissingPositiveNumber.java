public class FirstMissingPositiveNumber {
    public static void main(String[] args) {
        int[] arr = {3,4,-1,1}  ;
        System.out.println(firstMissingPositive(arr));
    }
    static int firstMissingPositive(int[] arr) {
        // sort the array using Cyclic Sort
        int i = 0 ;
        while(i < arr.length){
            int correctIndex = arr[i] - 1 ;
            if(arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correctIndex]){
                swap(arr , i , correctIndex) ;
            }else{
                i++ ;
            }
        }

        // find missing no
        for(int index=0 ; index < arr.length ; index++){
            if((index + 1) != arr[index]){
                return index + 1 ;
            }
        }
        return (arr.length + 1);
    }
    // swap the no
    static void swap(int[] arr , int first ,int second ){
        int temp = arr[first] ;
        arr[first] = arr[second] ;
        arr[second] = temp ;
    }
}
