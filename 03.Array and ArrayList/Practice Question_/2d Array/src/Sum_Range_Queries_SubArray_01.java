public class Sum_Range_Queries_SubArray_01 {
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

        int[][] PS = Create_PrefixSum_Matrix(arr);

        for(int i=0; i<Top_left.length; i++) {
            System.out.println(Query_SubArray_Matrix_Sum(PS , Top_left[i], Bottom_Right[i]));
        }


    }


    static int Query_SubArray_Matrix_Sum(int[][] ps , int[] tl , int[] br ){
        int i = tl[0] , j = tl[1], p = br[0], q = br[1];
        int sum = ps[p][q];

        if (j > 0)
            sum -= ps[p][j - 1];

        if (i > 0)
            sum -= ps[i - 1][q];

        if (i > 0 && j > 0)
            sum += ps[i - 1][j - 1];

        return sum;
    }
    static int[][] Create_PrefixSum_Matrix(int[][] arr){
        int[][] ps = new int[arr.length][arr[0].length];

        // prefix sum row wise
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(j > 0){
                    ps[i][j] = ps[i][j-1] + arr[i][j];
                }else{
                    ps[i][j] = arr[i][j];
                }
            }
        }
        // prefix sum column wise
        for(int j=0; j<arr[0].length; j++){
            for(int i=1; i<arr.length; i++){
                ps[i][j] += ps[i-1][j];
            }
        }
        return ps;
    }
}
