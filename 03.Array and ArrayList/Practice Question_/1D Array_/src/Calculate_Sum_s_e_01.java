public class Calculate_Sum_s_e_01 {
    // Time complexity = O( Q+N )
    // Space complexity = O(1) ---> i am changing given array into prefix array
    public static void main(String[] args) {
        int[] arr = {3,2,-1,5,6,8,2,3,2,6};
        int[][] query = {{1,4}, {3,6}, {1,7}};
        System.out.println(Sum_each_queries(arr , query));


    }
    static int Sum_each_queries(int[] arr , int[][] query){
        Prefix_sum(arr);
        int sum = 0;

        for(int[] q : query){
            int start = q[0];
            int end = q[1];

            if(start != 0){
                sum = arr[end] - arr[start - 1];
            }else{
                sum = arr[end];
            }
        }
        return sum;
    }
    //calculate prefix sum ( Changing input array )
    static void Prefix_sum(int[] arr){
        for(int i=0; i<arr.length; i++){
            if(i != 0 ){
                arr[i] = arr[i] + arr[i-1];
            }
        }
    }
}
