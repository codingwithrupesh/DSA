public class pick_both_side_maxElement_sizeB {
    public static void main(String[] args) {
        int[] arr = {5, -2, 3 , 1, 2};
        int B = 3;
//        System.out.println( ans(arr , B));
//        ans(arr , B);

        int n = arr.length;
        int curr = 0;
        int ans = Integer.MIN_VALUE;
//        for(int i=0; i<B; i++){
//            curr += arr[i];
//        }
        int back = B-1;
        ans = Math.max(ans , curr);

        for(int i=n-1; i>=n-B; n--){
            curr += arr[i];
            curr -= arr[back];
            back--;
            ans = Math.max(ans, curr);

//            if(i+back == b){
//                ans = Math.max(ans, curr);
//                System.out.println(ans);
//            }
        }


    }
    static int ans(int[] arr, int b){
        int n = arr.length;
        int curr = 0;
        int ans = Integer.MIN_VALUE;

        for(int i=0; i<b; i++){
            curr += arr[i];
        }
        int back = b-1;
        ans = Math.max(ans, curr);
//        System.out.println(ans);

        for(int i=n-1; i>=n-b; n--){
            curr += arr[i];
            curr -= arr[back];
            back--;
            if(i+back == b){
                ans = Math.max(ans, curr);
                System.out.println(ans);
            }
        }
        return ans;

    }
}
