public class Rain_Water_Tripping_06 {
    public static void main(String[] args) {
        int[] arr = {2,1,3,2,1,2,4,3,2,1,3,1};
        int[] PrefixMaxArray = Create_Prefix_Max(arr);
        int[] SuffixMaxArray = Create_SuffixMax_Array(arr);
        Print(PrefixMaxArray);
        Print(SuffixMaxArray);
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
        int[] create_Prefix_Max = new int[arr.length];
        create_Prefix_Max[0] = arr[0];
        for(int i=1; i<arr.length; i++){
            create_Prefix_Max[i] = Math.max(arr[i] , create_Prefix_Max[i-1]);
        }
        return create_Prefix_Max;
    }
    static int[] Create_SuffixMax_Array(int[] arr) {
        int[] createSuffixMax = new int[arr.length];
        createSuffixMax[arr.length-1] = arr[arr.length-1];
        for(int i = arr.length-2; i >= 0; i--){
            createSuffixMax[i] = Math.max(arr[i] , createSuffixMax[i+1]);
        }
        return createSuffixMax;
    }
    static void Print(int[] arr){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
