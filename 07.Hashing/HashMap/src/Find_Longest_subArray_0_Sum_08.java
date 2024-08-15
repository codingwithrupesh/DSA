import java.util.HashMap;

public class Find_Longest_subArray_0_Sum_08 {
    public static void main(String[] args) {
        int[] arr = {3,3,4,-5,-2,2,1,-3,3,-1,5,-4,-1};
        System.out.println(Longest_subArray_0_Sum(arr));
    }
    static String Longest_subArray_0_Sum(int[] arr){
        int[] pf = new int[arr.length];
        pf[0] = arr[0];
        for(int i=1; i<arr.length; i++){
            pf[i] = pf[i-1] + arr[i];
        }

        HashMap<Integer , Integer> map = new HashMap<>();
        int ans = 0;
        for(int i=0; i<pf.length; i++){
            if(map.containsKey(pf[i])){
                int len = i - map.get(pf[i]);
                ans = Math.max(ans , len);
            }else{
                map.put(pf[i] , i);
            }
        }
        return map.toString();
    }
}
