public class OrderAgnosticsBinarySearch {
    public static void main(String[] args) {
        int[] arr = {40, 10, 5, 2, 1 };
        int target = 10 ;
        System.out.println(orderAgnosticsBinarySearch(arr , target ));
    }
    static int orderAgnosticsBinarySearch(int[] arr, int target) {
        int start = 0 ;
        int end = arr.length - 1 ;

        boolean isAscending = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            }

            if (isAscending) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
