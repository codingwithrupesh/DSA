public class Replace_every_element_product_i_divide_itself {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 5};

        // make Prefix product array
        int[] pf = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                pf[i] = arr[i];
            } else {
                pf[i] = pf[i - 1] * arr[i];
            }
        }

        // make a Suffix product array
        int[] suf = new int[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i == arr.length - 1) {
                suf[i] = arr[i];
            } else {
                suf[i] = suf[i + 1] * arr[i];
            }
        }

        // Create the result array
        int[] prod = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int left = (i == 0) ? 1 : pf[i - 1];
            int right = (i == arr.length - 1) ? 1 : suf[i + 1];
            prod[i] = left * right;
        }

        // Print the result array
        for (int j : prod) {
            System.out.print(j + " ");
        }
    }
}


