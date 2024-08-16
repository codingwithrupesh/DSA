import java.util.Arrays;

public class Rain_Water_Tripping_06 {
    public static void main(String[] args) {
        int[] arr = {2,1,3,2,1,2,4,3,2,1,3,1};
        int[] PrefixMaxArray = Create_Prefix_Max(arr);
        int[] SuffixMaxArray = Create_SuffixMax_Array(arr);
        System.out.println(Arrays.toString(PrefixMaxArray));
        System.out.println(Arrays.toString(SuffixMaxArray));
        System.out.println("Total amount of water accumulated on ith building : " + Solution(arr, PrefixMaxArray, SuffixMaxArray));

    }
    static int Solution(int[] arr, int[] PrefixMaxArray , int[] SuffixMaxArray){
        int ans = 0 ;
        for(int i=1; i<arr.length-1; i++){
            int Lmax = PrefixMaxArray[i-1];
            int Rmax = SuffixMaxArray[i+1];

            int Height = Math.min(Lmax , Rmax);
            int water = Height - arr[i];

            if(water > 0 ){
                ans = ans + water;
            }
        }
        return ans;
    }
    static int[] Create_Prefix_Max(int[] arr) {
        int[] prefixMax = new int[arr.length];
        prefixMax[0] = arr[0];
        for(int i=1; i<arr.length; i++){
            prefixMax[i] = Math.max(arr[i] , prefixMax[i-1]);
        }
        return prefixMax;
    }
    static int[] Create_SuffixMax_Array(int[] arr) {
        int[] suffixMax = new int[arr.length];
        suffixMax[arr.length-1] = arr[arr.length-1];
        for(int i = arr.length-2; i >= 0; i--){
            suffixMax[i] = Math.max(arr[i] , suffixMax[i+1]);
        }
        return suffixMax;
    }



}
