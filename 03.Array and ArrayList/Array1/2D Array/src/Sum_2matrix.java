public class Sum_2matrix {
    public static void main(String[] args) {
        int[][] A = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] B = {{1,2,3},{7,8,9},{4,5,6}};
        int[][] C = new int[A.length][A[0].length];

        // iterate over the Row
        for(int i = 0; i<A.length; i++){
            //  iterate over the Column
            for(int j = 0; j<B[0].length; j++){
                // add each element of Both A and B matrix
                C [i][j] = A[i][j]+B[i][j];
            }
        }

        // Print the matrix
        for(int i = 0; i<A.length; i++){
            for(int j = 0 ; j<C[0].length; j++){
                System.out.print(C[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
