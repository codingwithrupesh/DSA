public class SubArrayPrint {
    public static void SubArray(int[] numbers){
        int total_Subarray = 0;
        for (int i = 0; i<numbers.length; i++){
            for (int j = i+1; j<numbers.length; j++){
                for(int k= i; k<j; k++) {  // for print sub array
                    System.out.print(numbers[k] + ",");
                    total_Subarray++;
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println(" total Sub Array = "+total_Subarray);
    }
    public static void main(String[] args) {
        int[]numbers ={2,6,8,3};
        SubArray(numbers);


    }
}
