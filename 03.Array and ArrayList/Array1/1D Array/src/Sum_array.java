public class Sum_array {
    public static void main(String[] args) {
        int[] arr = {2,35,55,90,804,90,708};
        int sum = SumArr(arr);
        System.out.println("Sum of The Array is : "+sum);

    }
    static int SumArr(int[] arr){
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return sum;
    }
}
