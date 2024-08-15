public class CeilingNumber {
    // smallest element greater than or equal to target
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18} ;
        int target = 15 ;
        System.out.println(Ceiling(arr , target));
    }
    static int Ceiling(int[] nums, int target) {
        int start = 0 ;
        int end = nums.length - 1 ;

        while(start <= end){
            int mid = start +(end - start) / 2 ;

            if(nums[mid] == target){
                return nums[mid] ;
            }else if(target < nums[mid]){
                end = mid -1 ;
            }else{
                start = mid + 1 ;
            }
        }
        return nums[start] ;
    }
}
