public class Leaders_array {
    public static void main(String[] args) {
        int[] arr = {15,-1,7,2,5,4,2,3};
        int max = arr[arr.length-1];
        int ans = 1;
        for(int i=arr.length-2; i>=0; i--){
            if(max < arr[i]){
                max = arr[i];
                ans += 1;
            }
        }
        System.out.println(ans);
    }
}
