public class Smallest_subArray_lenth_2ndMethod {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,3,4,6,4,6,3};

        // find minimum and maximum in  array
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int j : arr) {
            if (max < j) {
                max = j;
            }
            if (min > j) {
                min = j;
            }
        }

        int min_index = -1, max_index = -1;

    }
}
