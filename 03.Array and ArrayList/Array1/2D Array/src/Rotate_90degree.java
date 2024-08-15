public class Rotate_90degree {
    public static void main(String[] args) {
        int[][] arr = {{3,8,9,5,6},{1,2,3,5,3},{4,10,11,2,3},{6,7,3,1,3},{34,54,3,3,2}};

        // Transpose the matrix  A
        // Iterate through each row.
        for(int i=0; i<arr.length; i++){
            // Iterate through each column.
            for(int j=0; j<arr.length; j++){
                if(i<j){
                    // Swap the values at the start and end of the row.
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }
        }
        // Iterate through each row.
        for(int k=0 ; k<arr.length; k++ ){
            // Iterate through each column. and reverse each column
            for(int i = 0 ,j = arr.length-1; i<arr.length; i++,j-- ){
                if(i<j){
                    // Swap the values at the start and end of the row.
                    int temp  = arr[k][i];
                    arr[k][i] = arr[k][j];
                    arr[k][j] = temp;
                }
            }
        }
        for (int[] i : arr) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(i[j] + " ");

            }
            System.out.println();
        }

    }
}
