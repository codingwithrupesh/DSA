public class FloorNumber {
    // greatest element less than or equal to target
    public static void main(String[] args) {
        int[] arr = {2,3,4,9,14,16,18} ;
        int target = 13 ;

        System.out.println(Floor(arr, target));
    }

    private static int Floor(int[] arr, int target) {
        int start = 0 ;
        int end = arr.length - 1 ;

        while(start <= end){
            int mid = start + (end - start) / 2 ;
            if(arr[mid] == target){
                return arr[mid] ;
            }else if(target < arr[mid]){
                end = mid - 1 ;
            }else{
                start = mid + 1 ;
            }
        }
        return arr[end] ;
    }
}
