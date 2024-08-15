public class Left_Rotate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] B = {2,3};

        for(int i=0; i<B.length; i++){
            Rotate_Ktimes(arr ,B[i]);
            print(arr);
        }
    }
    static void Rotate_Ktimes(int[] arr, int k){
        int n = arr.length;
        k = k%n;
        Reverse(arr,0,n-1);
        Reverse(arr , n-k, n-1);
        Reverse(arr, 0 ,n-1-k );
    }
    static void Reverse(int[] arr , int s, int e){
        while(s<e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
    static void print(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
