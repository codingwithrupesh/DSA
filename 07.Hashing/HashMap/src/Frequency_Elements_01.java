import java.util.HashMap;

public class Frequency_Elements_01 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 1};
        int[] Q = {1,2};
        Print_Queries(arr , Q);

    }
    static void Print_Queries(int[] arr , int[] Q){
        HashMap<Integer , Integer> hm = new HashMap<>() ;

        // Iterate on Array & Populate hm
        for(int i=0; i<arr.length; i++){
            if(hm.containsKey(arr[i])){
                int freq = hm.get(arr[i]);
                hm.put(arr[i] , freq+1);
            }else{
                hm.put(arr[i] , 1);
            }
        }

        // Iterate on Queries & answer using hashmap
        for(int i=0; i<Q.length ; i++){
            if(hm.containsKey(Q[i])){
                System.out.println(hm.get(Q[i]));
            }else{
                System.out.println(0);
            }
        }
    }
}
