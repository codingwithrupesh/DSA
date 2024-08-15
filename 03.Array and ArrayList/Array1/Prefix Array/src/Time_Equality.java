public class Time_Equality {
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 3, 2};
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            if(max <= arr[i]){
                max = arr[i];
            }
            sum += arr[i];
        }
        int ans = (arr.length * max) - sum;
        System.out.println(ans);
    }
}
