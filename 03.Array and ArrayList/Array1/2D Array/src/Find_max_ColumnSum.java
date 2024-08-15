public class Find_max_ColumnSum {
    public static void main(String[] args) {
        int[][] arr = {{3,8,9,2},{1,2,3,4},{4,10,11,17}};
        int max = Integer.MIN_VALUE;
        for (int[] i : arr) {
            int sum = 0;
            for (int j : i) {
                sum += j;
            }
            max = Math.max(max, sum);
        }
        System.out.println("Max of Column sum = "+max);
    }
}
