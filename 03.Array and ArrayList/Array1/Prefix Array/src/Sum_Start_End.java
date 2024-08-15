import java.util.ArrayList;

public class Sum_Start_End {
    public static void main(String[] args) {
        int[] arr = {2, 2, 2};
        int[][] B = {{0, 0}, {1, 2}};
        ArrayList<Integer> ans = new ArrayList<>();
        prefix_sum_s_e(arr, B ,ans);
        print(ans);
    }
    static int prefix_sum_s_e(int[]arr , int[][]B, ArrayList<Integer> ans){
        int[] pf = new int[arr.length];
        Prefix_sum(arr , pf);
        int sum = 0;
        for (int[] ints : B) {
            int s = ints[0];
            int e = ints[1];
            for (int j = s; j < e; j++) {
                if (s != 0) {
                    sum = pf[e] - pf[s - 1];
                } else {
                    sum = pf[e];
                }
            }
            ans.add(sum);
        }
        return sum;
    }
    static void Prefix_sum(int[] arr , int[]pf){
        for(int i=0; i<arr.length; i++){
            if(i == 0){
                pf[i] = arr[i];
            }else{
                pf[i] = pf[i-1] + arr[i];
            }
        }
    }
    static void print(ArrayList<Integer> ans){
        for (Integer an : ans) {
            System.out.print(an + " ");
        }
    }
}
