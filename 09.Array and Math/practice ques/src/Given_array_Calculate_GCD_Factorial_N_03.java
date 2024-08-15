public class Given_array_Calculate_GCD_Factorial_N_03 {
    // Given an Array , find the GCD of the factorials of the elements
    public static void main(String[] args) {
        int[] arr = {5 ,6 ,9 ,4};
        System.out.println(Calculate_GCD_Elements(arr));

    }
    // first we calculate the min element of array then we calculate factorial of min element , because min element is common in all the elements in array
    static int Calculate_GCD_Elements (int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i : arr){
            if(min > i){
                min = i;
            }
        }
        return Factorial(min);
    }

    static int Factorial(int min) {
        if(min == 0 | min == 1){
            return 1 ;
        }
        return (min * Factorial(min -1));
    }
}
