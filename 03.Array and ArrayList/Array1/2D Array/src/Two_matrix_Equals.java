public class Two_matrix_Equals {
    public static void main(String[] args) {
        int[][] A = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] B = {{1,2,3},{7,8,9},{4,5,6}};

        int flag = Matrix_Equals(A , B);

        if(flag == 1){
            System.out.println("Both A and B matrix is same or equal.");
        }else{
            System.out.println("Both A and B matrix is not Equal.");
        }


    }
    // AreMatricesSame checks if two matrices are the same
    // and returns 1 if they are and 0 if they are not

    // Time complexity: O(n^2)
    // Space complexity: O(1)
    static int Matrix_Equals(int[][] A, int[][] B){

        // Check if the two matrices have the same number of rows
        if(A.length != B.length){
            return -1;
        }

        // Iterate over the rows
        for(int i=0; i<A.length; i++){

            // Check if the two matrices have the same number of columns
            if(A[i].length == B[i].length ){

                // Iterate over the columns
                for(int j=0; j<B.length; j++){

                    // Check if the values in the two matrices are not the same
                    if(A[i][j] != B[i][j] ){
                        return -1;
                    }
                }
            }
        }
        return 1;
    }
}
