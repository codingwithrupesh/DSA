public class Main_Minor_Diagonal_sum {
    public static void main(String[] args) {
        int[][] A = {{1,2,3},{4,5,6},{7,8,9}};

        // Main Diagonal sum is Calculate
        System.out.println("Main Diagonal sum : ");
        int i = 0;
        int sum = 0;
        while(i < A.length){
            System.out.print(A[i][i]+" ");
            sum += A[i][i];
            i++;
        }
        System.out.println(" = "+sum);

        // Minor Diagonal sum is calculated
        System.out.println("Minor Diagonal sum : ");
        i = 0;
        sum = 0;
        int j = A.length-1;
        while(i < A.length){
            System.out.print(A[i][j]+" ");
            sum += A[i][j];
            i++;
            j--;
        }
        System.out.println(" = "+sum);
    }
}
