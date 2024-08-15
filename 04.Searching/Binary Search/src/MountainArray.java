public class MountainArray {
    // Mountain array : return the minimum index where target is found
    public static void main(String[] args) {
        // int[] arr = {0,1,2,4,2,1};
        int[] arr = { 1,2,3,4,5,3,1} ;
        int target = 3 ;
        System.out.println(findInMountainArray(arr , target));

    }
    public static int findInMountainArray( int[] arr , int target) {
        int peak = peakIndexMountainArray(arr);
        int firstTry = orderAgnosticsBinarySearch(arr, target, 0, peak);

        if (firstTry != -1) {
            return firstTry;
        }

        return orderAgnosticsBinarySearch(arr, target, peak + 1, arr.length - 1);
    }

    public static int peakIndexMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid+1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start; // or end; both are pointing to the same element
    }

    static int orderAgnosticsBinarySearch(int[] arr, int target, int start, int end) {
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
