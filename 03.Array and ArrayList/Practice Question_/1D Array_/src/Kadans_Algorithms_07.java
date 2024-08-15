public class Kadans_Algorithms_07 {
    public static void main(String[] args) {
        int[] arr = {3,2,-6,8,2,9,4};
        System.out.println("Maximum SubArray Sum is : " + Solution(arr));

    }
    static int Solution(int[] arr){
        int ans = Integer.MIN_VALUE;
        int sum = 0;
        for (int j : arr) {
            sum += j;
            ans = Math.max(ans, sum);

            if (sum < 0) {
                sum = 0;
            }
        }
        return ans;
    }
}
