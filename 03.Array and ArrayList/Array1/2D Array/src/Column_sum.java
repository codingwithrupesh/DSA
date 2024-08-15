public class Column_sum {
    public static void main(String[] args) {
        int[][] A = {{1,2,3},{4,5,6},{7,8,9}};

        // iterate over the Row
        for (int[] i : A) {
            int sum = 0;
            //  iterate over the Column
            for (int j = 0; j < A.length; j++) {
                // print the all column element and find all column element sum
                System.out.print(i[j] + " ");
                sum += i[j];
            }
            // print column element sum
            System.out.println(" = " + sum);
        }
    }
}
