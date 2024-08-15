public class Max_consecutive_1_Swap0to1 {
    public static void main(String[] args) {
//        int[] arr = {0,1,0,0,0,0,1,1,1,1,0,1,1,1,0,0,0,1,0};
        int[] arr = {0,0,1,1,1,0,1,1,1,0,0};


        int cnt = 0;
        int max = Integer.MIN_VALUE;
        for(int i : arr){
            if(i == 1){
                cnt++;
            }
        }
        if(cnt == arr.length){
            System.out.println(arr.length);
        }

        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0){
                int l = 0;
                for(int j=i-1; j>=0; j--){
                    if(arr[j] == 1){
                        l++;
                    }else{
                        break;
                    }
                }
                int r = 0;
                for(int j=i+1; j<arr.length; j++){
                    if(arr[j] == 1){
                        r++;
                    }else{
                        break;
                    }
                }
                if(cnt > l+r){
                    max = Math.max(max , l+r+1);
                }else{
                    max = Math.max(max , l+r);
                }
            }
        }
        System.out.println(max);
    }
}
