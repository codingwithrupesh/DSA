import java.util.Arrays;

public class Max_min_array {
    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 5, 0, 9, 1};

        Arrays.sort(arr); // pre define function for Array Sorting
        System.out.println("Minimum of the Array : "+arr[0]);
        System.out.println("Maximum of the Array : "+arr[arr.length-1]);


    }
}
