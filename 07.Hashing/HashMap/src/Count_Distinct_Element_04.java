import java.util.HashSet;

public class Count_Distinct_Element_04 {
    public static void main(String[] args) {
        int[] arr1 = {3, 4, 3, 6, 6};
        int[] arr2 = {3, 3, 3, 9, 0, 1, 0};
        System.out.println("Distinct Element : " +Count_Distinct_Element(arr1));

    }
    static int Count_Distinct_Element(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int i : arr){
            set.add(i);
        }
        return set.size();
    }
}
