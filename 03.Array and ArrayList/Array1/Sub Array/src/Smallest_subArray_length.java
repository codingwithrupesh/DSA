public class Smallest_subArray_length {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,1,3,4,6,4,6,3};
        int[] arr = {1,6,4,6,5,1,5,2,6,4,4,2,1,5};

        // find minimum and maximum in  array
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int j : arr) {
            if (max < j) {
                max = j;
            }
            if (min > j) {
                min = j;
            }
        }


        int ans = 0 ;
        // find Smallest sub Array Length in an Array
        if(min == max){
            ans = 1;
        }
        ans = arr.length;
//        ans = -1;
        int maxi = -1, mini = -1;
        for(int i=arr.length-1; i>=0 ; i--){
            if(arr[i] == min){
                if(max != -1 ){
                    ans = Math.min(ans , Math.abs(maxi - i+1));
                }
                mini = i;
            }
            else if(arr[i] == max){
                if(max != -1){
                    ans = Math.min(ans, Math.abs(mini - i+1));
                }
                maxi = i;
            }
        }
        System.out.println(ans);

    }
}
