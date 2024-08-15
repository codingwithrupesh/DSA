public class Create_SuffixMax_05 {
    // Time complexity = O( N )
    // Space complexity = O(N)
    public static void main(String[] args) {
        int[] arr = {3, 10, 6, 7, 0, 2, -1};
        int[] suffixMaxArray = CreateSuffixMaxArray(arr);
        System.out.print("Before creating Suffix max array : ");
        Print_Array(arr);
        System.out.print("After creating Suffix max array : ");
        Print_Array(suffixMaxArray);
    }
    // Create suffixMax Array
    private static int[] CreateSuffixMaxArray(int[] arr) {
        int[] suffixMaxArray = new int[arr.length];

        suffixMaxArray[arr.length - 1] = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            suffixMaxArray[i] = Math.max(arr[i], suffixMaxArray[i + 1]);
        }
        return suffixMaxArray;
    }

    static void Print_Array(int[] arr) { // Print array
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
