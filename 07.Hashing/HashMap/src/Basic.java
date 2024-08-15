public class Basic {
    public static void main(String[] args) {
        int[] arr = {5, 4, 10, 15, 7, 6} ;
        int k = 5;

        int[] arr2 = {3, 6, 8, 10, 15, 50};
        int b = 5;
        XOR_Pairs(arr2 , b);

    }
    static void XOR_Pairs(int[] arr , int k){
        int count = 0;
        for(int i=0; i<arr.length-1; i++){
            if((arr[i] ^ arr[i+1]) == k){
                count++;
            }
        }
        System.out.println(count);
    }
}
