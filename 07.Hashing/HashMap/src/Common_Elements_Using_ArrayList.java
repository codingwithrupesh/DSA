import java.util.ArrayList;
import java.util.List;

public class Common_Elements_Using_ArrayList {
    public static void main(String[] args) {
        int[] arr1 = {1,2,2,1};
        int[] arr2 = {2,3,1,2};
        List<Integer> common_elements = Find_Common_Elements(arr1, arr2);
        System.out.println("Common Elements "+ common_elements);


    }
    public static List<Integer> Find_Common_Elements(int[] arr1, int[] arr2) {
        List<Integer> list1 = new ArrayList<>();
        for (int i : arr1) {
            list1.add(i);
        }

        List<Integer> list2 = new ArrayList<>();
        for (int i : arr2) {
            list2.add(i);
        }

        List<Integer> common = new ArrayList<>();

        for (Integer i : list1) {
            if(list2.contains(i)) {
                common.add(i);
                list2.remove(i);
            }
        }

        return common;
    }
}
