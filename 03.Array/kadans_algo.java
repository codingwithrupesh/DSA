public class kadans_algo {
    public static void kadanes(int[] numbers){
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for (int number : numbers) {
            cs = cs + number;
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("ours max sub array sum is "+ms);
    }
    public static void main(String[] args) {
        int[] numbers = {-2,-2,-3,-9,-6,-1};
        kadanes(numbers);

    }
}
