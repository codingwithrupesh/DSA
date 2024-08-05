import java.lang.*;

public class maxSum {
    public static void maxSum_SubArray( int[] numbers){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE ;
        int[] Prefix_sum = new int[numbers.length]; 

        Prefix_sum[0] = numbers[0];
        for(int i = 1; i<numbers.length ; i++){
            Prefix_sum[i] = Prefix_sum[i-1] + numbers[i];
        }
        for(int i =0 ; i<numbers.length ; i++){
            for (int j = i; j < numbers.length; j++){
                currSum = i == 0 ? i = Prefix_sum[i] : (Prefix_sum[i] += Prefix_sum[j-1] );
            }
            if(maxSum < currSum){
                maxSum = currSum;
            }
            System.out.println("Max Sum of Sub Arrays = "+maxSum);
        }

    }
    public static void main(String[] args) {
        int[] numbers = {5,2,6,9,3};
        maxSum_SubArray(numbers);
    }
}
