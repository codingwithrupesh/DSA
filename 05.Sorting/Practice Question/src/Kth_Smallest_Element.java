public class Kth_Smallest_Element {
    public static void main(String[] args) {
        int[] A = {2, 1, 3, 4} ;
        int B = 2;
        System.out.println(kthSmallest(A, B));

    }
    public static int kthSmallest(int[] A, int k) {
        for (int i = 0; i < k; i++) {
            int min = A[i];
            int index = i;
            for (int j = i + 1; j < A.length; j++) {
                if (A[j] < min) {
                    min = A[j];
                    index = j;
                }
            }
            int temp = A[i];
            A[i] = A[index];
            A[index] = temp;
        }
        return A[k - 1];
    }
}
