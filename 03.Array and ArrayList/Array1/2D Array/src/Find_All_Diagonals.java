public class Find_All_Diagonals {
    public static void main(String[] args) {
        int[][] arr = {{3,8,9,5,6},{1,2,3,5,3},{4,10,11,2,3},{6,7,3,1,3}};
        // total diagonals = (n + m -1)
        for(int j=0; j<arr[0].length; j++){
            int x = 0;
            int y = j;
            while(x < arr.length && y>=0){
                System.out.print(arr[x][y]+" ");
                x++;
                y--;
            }
            System.out.println();
        }
        for(int i=1; i<arr.length; i++){
            int x = i;
            int y = arr[0].length-1;
            while(x < arr.length && y>=0){
                System.out.print(arr[x][y]+" ");
                x++;
                y--;
            }
            System.out.println();
        }
    }
}
