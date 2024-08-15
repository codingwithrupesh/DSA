public class Product_matrix {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int B = 2;
        // iterate over the Row
        for(int i = 0; i<arr.length; i++){
            //  iterate over the Column
            for(int j = 0 ; j<arr.length; j++){
                // multiply each element by B
                arr [i][j] = arr[i][j]*B;
            }
        }
        // Print the matrix
        for(int i = 0; i<arr.length; i++){
            for(int j = 0 ; j<arr.length; j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
