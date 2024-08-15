public class Printing_all_SubArray_n3 {
    public static void main(String[] args) {
        int[] arr = {-1,3,4,5};

        // printing all subarray
        for(int s=0; s<arr.length; s++){
            for(int e=s; e<arr.length; e++){
                for(int i=s; i<=e; i++){
                    System.out.print(arr[i]+" ");
                }
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}
