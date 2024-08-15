public class peakElement {
    // peakElement : find the highest element in the array and return its index
    public static void main(String[] args) {
        int[] arr = {0,10,5,2} ;

        System.out.println(peakIndexInMountainArray(arr));

    }
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1 ;

        while(start < end){
            int mid = start + (end - start)/2;

            if(arr[mid] > arr[mid+1]){
                end = mid ;
            }else{
                start = mid + 1 ;
            }
        }
        return start ;   // or end both are pointing same element
    }
}
