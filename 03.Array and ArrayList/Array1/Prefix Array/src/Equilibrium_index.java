public class Equilibrium_index {
    /*
    The equilibrium index of an array is a position where the sum of elements to the left of that position is equal to the sum of elements to the right.

Definition:
Given an array A of n elements, an index i is called an equilibrium index if the sum of elements on the left of i is equal to the sum of elements on the right of i.
    */
    public static void main(String[] args) {
        int[] arr = {-7, 1, 5, 2, -4, 3, 0};
        int[] pre = new int[arr.length];
        Prefix_array(arr, pre);
        int ans = Equilibrium_idx(pre);
        System.out.println(ans);
    }
    static int Equilibrium_idx(int[] pre){
        int leftsum = 0;
        int rightsum = 0;
        int count = 0;
        int ans = Integer.MAX_VALUE;
        for(int i=0; i<pre.length; i++){
            if(i == 0){
                leftsum = 0;
            }else{
                leftsum = pre[i-1];
            }
            rightsum = pre[pre.length-1] - pre[i];
            if(leftsum == rightsum){
                ans = Math.min(ans,i);
                count++;
            }
        }
        if(count>0){
            return ans;
        }
        return -1;
    }
    static void Prefix_array(int[] arr, int[] pre){
        for(int i=0; i<arr.length; i++){
            if(i ==0){
                pre[i] = arr[i];
            }else{
                pre[i] = pre[i-1] + arr[i];
            }
        }

    }
}
