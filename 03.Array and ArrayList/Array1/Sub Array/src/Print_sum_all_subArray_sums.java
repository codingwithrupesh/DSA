public class Print_sum_all_subArray_sums {
    public static void main(String[] args) {
        int[] arr = {2,-2,4,-1,2,6};

        // 1st method   T.C = O( n2 )
        int totalsum = 0;
//        for(int i=0; i<arr.length; i++){
//            int sum = 0;
//            for(int j=i; j<arr.length; j++) {
//                sum += arr[j];
//                totalsum += sum;
//            }
//        }
//        System.out.println("Total Sum of all Sub-Array sums = "+totalsum);



        // 2nd method   T.C = O( n )
        totalsum = 0;
        for(int i=0; i<arr.length; i++){
            // frequency of i
            int freq = (i+1) * (arr.length - i);
            totalsum += freq * arr[i];
        }
        System.out.println("Total sum of all sub_Array sum =  "+totalsum);
    }
}
