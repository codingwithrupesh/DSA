import java.util.ArrayList;
import java.util.Arrays;

public class Create_PrefixMax_04 {
    // Time complexity = O( N )
    // Space complexity = O(N)
    public static void main(String[] args) {
        int[] arr = {1,-6, 3, 2,8,7};
        ArrayList<Integer> pfMax = new ArrayList<>();
        System.out.println("Before Creating Prefix Max Array : " + Arrays.toString(arr));
        Create_PrefixMax_array(arr , pfMax);
        System.out.println("After Creating Prefix Max Array : " + pfMax);
//        Print_ArrayList(pfMax);

    }
    static void Create_PrefixMax_array(int[] arr, ArrayList<Integer> pfMax){
        pfMax.add(arr[0]);
        for(int i=1; i<arr.length; i++){
            pfMax.add(Math.max(arr[i-1] , arr[i]));
        }
    }



}
