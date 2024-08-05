public class FirstAndLastOccuranceNo {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 7, 7, 8, 8, 10};
        int target = 7;

        int[] result = FirstandLastOccurance(arr, target);
        System.out.println("First Occurrence: " + result[0]);
        System.out.println("Last Occurrence: " + result[1]);
    }

    public static int[] FirstandLastOccurance(int[] arr, int target) {
        int[] result = {-1, -1};
        result[0] = Search(arr, target, true);
        result[1] = Search(arr, target, false);
        return result;
    }

    public static int Search(int[] arr, int target, boolean isFirstOccurrence) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (isFirstOccurrence) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
