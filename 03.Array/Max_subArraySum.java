public class Max_subArraySum {

    public static void MAXSubArraySum(int[] numbers){
        int curr_sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i= 0; i < numbers.length  ; i++){
            for( int j = i ; j<numbers.length ; j++){
                curr_sum =  0;
                for(int k = i; k<=j ; k++){
                    curr_sum += numbers[k];
                }
                System.out.println(curr_sum);
                if( maxSum < curr_sum ){
                    maxSum = curr_sum;
                }
            }
        }
        System.out.println("Max Sub Array sum = "+maxSum);

    }
    public static void main(String[] args) {
        int[] numbers = {4,6,5,2,3};
        MAXSubArraySum(numbers);
    }
}
