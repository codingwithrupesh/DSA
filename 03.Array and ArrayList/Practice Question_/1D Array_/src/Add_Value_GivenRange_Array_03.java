public class Add_Value_GivenRange_Array_03 {
    // Time complexity = O( Q+N )
    // Space complexity = O(1)
    // Google question
    public static void main(String[] args) {
//        int[] arr = {0,0,0,0,0,0,0,0,0,0};
//        int[][] queries = {{3,6,1},{2,7,3},{5,8,-3},{1,9,2}};
        int[] arr = {0,0,0,0,0,0,0,0,0,0,0};
        int[][] queries = {{2,5,1},{1,3,3},{0,3,4}};
        System.out.print("Before Adding value or Process queries : ");
        Print(arr);
        Add_value_Range(arr , queries);
        System.out.print("After Adding value or process all queries : ");
        Print(arr);

    }
    static void Add_value_Range(int[] arr , int[][] queries){
        for(int[] q : queries){
            // Given start , end , value
            int start = q[0];
            int end = q[1];
            int val = q[2];
            // add value in array ( start to N )
            arr[start] += val; // add value
            // minus the value in array ( end+1 to N )
            if(end+1 < arr.length){
                arr[end+1] -= val;    // minus value
            }
        }
        Prefix_array(arr);
    }

    private static void Prefix_array(int[] arr) {
        for(int i=0; i<arr.length; i++){
            if( i != 0){
                arr[i] = arr[i] + arr[i-1];
            }
        }
    }
    static void Print(int[] arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
