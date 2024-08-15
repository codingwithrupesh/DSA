public class Special_index {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1};
        int[] pfodd = new int[arr.length];
        int[] pfeven = new int[arr.length];
        prefix_even(arr , pfeven);
        prefix_odd(arr, pfodd);
        System.out.println(ans(pfeven, pfodd));


    }
    static int ans(int[] pfeven, int[] pfodd){
        int count = 0;
        for(int i=0; i<pfeven.length; i++){
            int sumeven = pfodd[pfodd.length-1] - pfodd[i];
            if(i != 0){
                sumeven += pfeven[i-1];
            }
            int sumodd =  pfeven[pfeven.length-1] - pfeven[i] ;
            if(i !=0){
                sumodd += pfodd[i-1];
            }
            if(sumeven == sumodd){
                count++;
            }
        }
        return count;
    }
    static void prefix_odd(int[] arr, int[] pfodd){
        for(int i= 0 ; i<arr.length; i++){
            if(i ==0){
                pfodd[i] = 0;
            }else{
                if(i%2 !=0 ){
                    pfodd[i] = pfodd[i-1] + arr[i];
                }
                else{
                    pfodd[i] = pfodd[i-1];
                }
            }
        }
    }
    static void prefix_even(int[] arr, int[] pfeven){
        for(int i= 0 ; i<arr.length; i++){
            if(i != 0){
                if(i%2 == 0){
                    pfeven[i] = pfeven[i-1] + arr[i];
                }
                else{
                    pfeven[i] = pfeven[i-1];
                }
            }else{
                pfeven[i] = arr[i];
            }
        }
    }
    static void print(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
