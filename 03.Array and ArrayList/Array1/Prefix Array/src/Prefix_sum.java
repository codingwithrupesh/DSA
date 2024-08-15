import java.util.Arrays;

public class Prefix_sum {
    public static void main(String[] args) {
        int[] arr = {3,5,8,3,-2,4,32,5,6};
        int[] pre = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            if(i == 0){
                pre[i] = arr[i];
            }else{
                pre[i] = pre[i-1] + arr[i];
            }
        }

        System.out.println(Arrays.toString(pre));
    }
}
