import java.util.Arrays;

public class Right_rotate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k =7;
        Rotate_k_times(arr,k);
        System.out.println(Arrays.toString(arr));

    }
    static void Rotate_k_times(int[] arr, int k){
        int n = arr.length;
        k = k%n;
        Reverse_part(arr , 0, n-1);
        Reverse_part(arr , 0, k-1);
        Reverse_part(arr,k, n-1);
    }
    static void Reverse_part(int[] arr ,int s ,int e){
        while(s < e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
}
