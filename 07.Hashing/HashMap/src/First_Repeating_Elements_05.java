import java.util.HashSet;
import java.util.Set;

public class First_Repeating_Elements_05 {
    public static void main(String[] args) {
        int[] arr1 = {10, 5, 3, 4, 3, 5, 6};
        int[] arr2 = {6, 10, 5, 4, 9, 120};
        System.out.println("First Repeating Element : "+ First_Repeatint_Elements(arr2));

    }
    static int First_Repeatint_Elements(int[] arr){
        Set<Integer> set = new HashSet<>();

        for(int i :arr){
            if(set.contains(i)){
                return i;
            }else{
                set.add(i);
            }
        }
        return -1;
    }
}
