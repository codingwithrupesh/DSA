public class Transpose {
    public static void main(String[] args) {
        int[][] arr = {{3,8,9,5,6},{1,2,3,5,3},{4,10,11,2,3},{6,7,3,1,3},{34,54,3,4,5}};
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(i<j){
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
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
