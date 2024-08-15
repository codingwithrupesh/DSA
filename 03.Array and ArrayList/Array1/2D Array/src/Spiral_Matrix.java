public class Spiral_Matrix {
    public static void main(String[] args) {
        int[][] arr = {{3,8,9,5,6},{1,2,3,5,3},{4,10,11,2,3},{6,7,3,1,3},{34,54,3,3,2}};

        int row = 0, col =0;
        int n = arr.length;
        while(n > 0){
            for(int k=1; k<arr.length; k++){
                System.out.print(arr[row][col]+" ");
                col++;
            }
            System.out.println();
//        System.out.println(col);
            // row = 0 and col = n-1
            for(int k=1; k<arr.length; k++){
                System.out.print(arr[row][col]+" ");
                row++;
            }
            System.out.println();
            // row = n-1 and col= n-2
            for(int k=1; k<arr.length; k++){
                System.out.print(arr[row][col]+" ");
                col--;
            }
            System.out.println();
            // row = n-1 and col= 0
            for(int k=1; k<arr.length; k++){
                System.out.print(arr[row][col]+" ");
                row--;
            }
            // row = 0 and col = 0
            row++;
            col++;
            n -= 2;

            if(n == 1){
                System.out.println(arr[row][col]);
            }

        }

    }
}
