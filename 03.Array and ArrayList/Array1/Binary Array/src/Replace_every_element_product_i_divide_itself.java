public class Replace_every_element_product_i_divide_itself {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        // make Prefix product array
        int[] pf = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            if(i == 0){
                pf[i] = arr[i];
            }else{
                pf[i] = pf[i-1] * arr[i];
            }
        }
        // make a suffix product array
        int[] suf = new int[arr.length];
        for(int i=arr.length-1; i>=0; i--){
            if(i == arr.length-1){
                suf[i] = arr[arr.length-1];
            }else{
                suf[i] = suf[i+1] * arr[i];
            }
        }


        int[] prod = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            int left = 0;
            if(i == 0){
                left = pf[i];
            }else{
                left = pf[i-1];
            }
            int right = 0;
            if(i == arr.length-1){
                right = suf[arr.length-1];
            }else{
                right = suf[i+1];
            }
            prod[i] = left * right;
        }


        for(int i =0; i<arr.length; i++){
            System.out.print(suf[i]+" ");
        }
    }
}


//check the whole program and find error and fix it
//        and write new program

