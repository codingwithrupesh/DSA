public class Print_both_Diagonal {
    public static void main(String[] args) {
        // always print diagonal matrix when, row == column
        int[][] arr = {{3,8,9},{1,2,3},{4,10,11}};

        int i = 0;
        while(i < arr.length){
            System.out.print(arr[i][i]+" ");
            i++;
        }
        System.out.println();
        i = 0;
        int j = arr.length-1;
        while(i < arr.length && j>=0) {
            System.out.print(arr[i][j]+" ");
            i++;
            j--;

        }
    }
}
