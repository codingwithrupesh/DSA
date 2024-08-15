import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Common_Elements_2_Array_03 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,2,1};
        int[] arr2 = {2,3,1,2};
        List<Integer> common_Element = Print_Common_Elements(arr1 ,arr2);
        System.out.print("Common Elements : "+ common_Element);

    }
    static List<Integer> Print_Common_Elements(int[] arr1 , int[] arr2){
        // Create a HashMap
        Map<Integer , Integer> map = new HashMap<>();
        // count the value of arr1
        for(int i : arr2){
            map.put(i , map.getOrDefault(i , 0) + 1);
        }

        // find common elements
        List<Integer> common = new ArrayList<>();
        for(int i : arr1){
            if(map.getOrDefault(i , 0) > 0){
                common.add(i);
                map.put(i , (map.get(i) - 1));
            }
        }
        return common;
    }
}
