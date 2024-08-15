public class diffB_AnyAdj {
    public static void main(String[] args) {
        int[] arr = {3,8,4,2,9};
        int k = 5;
        System.out.println(DiffAnyAdj(arr , k));
        System.out.println(arr.length-1);

    }
    static boolean DiffAnyAdj(int[] arr , int k){

        for(int i=0; i<arr.length-1; i++) {
            if (arr[i] - arr[i + 1] == k) {
                return true;
            }
        }
        return false;
    }
}
