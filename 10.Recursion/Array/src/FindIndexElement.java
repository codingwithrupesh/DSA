import java.util.ArrayList;

public class FindIndexElement {
    public static void main(String[] args) {
        // int[] arr = {3,1,2,18, 18, 9};
        // int target = 18;
        // System.out.println(find(arr , target , 0 ));
        // System.out.println(findIndex(arr , target , 0));
        // System.out.println(findLastIndex(arr , target , arr.length-1));
        int[] arr = { 1, 2, 3, 4, 4, 8 };
        // ArrayList<Integer> ans = findAllIndex(arr , 4 , 0 , new ArrayList<>()) ;
        // System.out.println(ans);
        System.out.println(findAllIndex(arr, 4, 0));
    }

    static boolean find(int[] arr, int target, int index) {
        if (index == arr.length) {
            return false;
        }
        return arr[index] == target || find(arr, target, index + 1);
    }

    static int findIndex(int[] arr, int target, int index) {
        if (index == arr.length - 1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findIndex(arr, target, index + 1);
        }
    }

    static int findLastIndex(int[] arr, int target, int index) {
        if (index == -1) {
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return findLastIndex(arr, target, index - 1);
        }
    }

    // Find all Index Method 1
    static ArrayList<Integer> list = new ArrayList<>();

    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findAllIndex(arr, target, index + 1);

    }

    // find all Index Method 2
    static ArrayList<Integer> findAllIndex1(int[] arr, int target, int index, ArrayList<Integer> list) {

        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findAllIndex1(arr, target, index + 1, list);

    }

    // find all index method 3
    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> ansfromBelowCalls = findAllIndex2(arr, target, index + 1);
        list.addAll(ansfromBelowCalls);
        return list;
    }
}
