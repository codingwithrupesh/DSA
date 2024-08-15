public class Create_Prefix_SubArray_Matrix {
    public static void main(String[] args) {
        int[][] arr = {{7,-1,-6,3, 12,10},
                {10,5,6,2,3,1},
                {6,4,2,5,6,9},
                {1,5,6,7,1,5},
                {-3,8,-5,6,7,7},
                {2,0,6,2,1,3},
                {5,6,7,8,9,0},
                {2,3,3,2,1,1},
                {3,0,2,1,2,1}};
        int[][] Top_left = {{1,2},{1,1},{0,0}};
        int[][] Bottom_Right = {{4,3}, {1,1},{4,0}};


    }
    // Brute force idea
    static int Query_subarray_Matrix_Sum(int[][] arr , int[] tl , int[] br){
        int tli = tl[0] , tlj = tl[1] , bri = br[0] , brj = br[1];
        int sum = 0;
        for(int i=tli ; i<=bri; i++){
            for(int j=tlj; j<=brj; j++){
                sum += arr[i][j];
            }
        }
        return sum;
    }
}
