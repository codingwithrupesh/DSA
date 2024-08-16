

class Rotate_90degree_AntiClock
{
    public static void main(String[] args) {
        int[][] arr =  {{1, 2, 3},{4, 5, 6},{7, 8, 9}} ;
//        int[][] arr = {{3,8,9,5,6},{1,2,3,5,3},{4,10,11,2,3},{6,7,3,1,3},{34,54,3,3,2}};
        rotateby90(arr, arr.length);
        for (int[] i : arr) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(i[j] + " ");

            }
            System.out.println();
        }
    }
    //Function to rotate matrix anticlockwise by 90 degrees.
    static void rotateby90(int[][] matrix, int n)
    {
        // Transpose the matrix
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    // Swap matrix[i][j] with matrix[j][i]
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }

            // Reverse each column to get the anticlockwise 90-degree rotation
            for (int j = 0; j < n; j++) {
                int start = 0, end = n - 1;
                while (start < end) {
                    int temp = matrix[start][j];
                    matrix[start][j] = matrix[end][j];
                    matrix[end][j] = temp;
                    start++;
                    end--;
                }
            }

    }
}