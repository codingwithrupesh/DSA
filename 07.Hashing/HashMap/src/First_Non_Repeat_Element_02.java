import java.util.HashMap;

public class First_Non_Repeat_Element_02 {
    public static void main(String[] args) {
        int[] arr ={1,2,3,1,2,5};
        int[] arr1 = {4,8,8,3,4,2,3};
        System.out.println(First_NonRepeat_Element(arr));

    }
    static int First_NonRepeat_Element(int[] arr){
        HashMap<Integer , Integer> hm = new HashMap<>();
        for(int i=0; i<arr.length ; i++){
            if(hm.containsKey(arr[i])){
                int freq = hm.get(arr[i]);
                hm.put(arr[i] , freq+1);
            }else{
                hm.put(arr[i] , 1);
            }
        }

        for(int i=0; i<hm.size(); i++){
            if(hm.get(arr[i]) == 1){
                return arr[i];
            }
        }
        return -1;
    }
}
