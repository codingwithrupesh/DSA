public class ArraySorted {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 6, 9, 10};
        System.out.println(isSorted(arr, 0));
    }
    static boolean isSorted(int[] arr, int index) {
        if (index == arr.length - 1) {
            return true;
        } else {
            return arr[index] < arr[index + 1] && isSorted(arr, index + 1);
        }
    }
}
