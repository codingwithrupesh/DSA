import java.util.ArrayList;

public class Create_PrefixMax_04 {
    // Time complexity = O( N )
    // Space complexity = O(N)
    public static void main(String[] args) {
        int[] arr = {1,-6, 3, 2,8,7};
        ArrayList<Integer> pfMax = new ArrayList<>();
        System.out.println("Before Creating Prefix Max Array : ");
        Print(arr);
        Create_PrefixMax_array(arr , pfMax);
        System.out.println("After Creating Prefix Max Array : " );
        Print_ArrayList(pfMax);

    }
    static void Create_PrefixMax_array(int[] arr, ArrayList<Integer> pfMax){
        pfMax.add(arr[0]);
        for(int i=1; i<arr.length; i++){
            pfMax.add(Math.max(arr[i-1] , arr[i]));
        }
    }
    static void Print(int[] arr){
        for(int i : arr){
            System.out.print(i +" ");
        }
        System.out.println();
    }
    static void Print_ArrayList(ArrayList<Integer> pfMax){
        for(int i : pfMax){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
