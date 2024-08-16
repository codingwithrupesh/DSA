public class Find_Total_triplets {
    public static void main(String[] args) {
        // triplets = where, i>j>k and (arr[i] < arr[j] < arr[k])
        // T.C = O( n2 )

        int[] arr = {2,5,3,7,23,4,2,6,4,65,3};
//        int[] arr = {2,6,9,4,10};


        int ans = 0;

        for(int i=1; i<arr.length-1; i++){
            // iterate and find left less element of arr[i]
            int l = 0;
            for(int j=i-1; j>=0; j--){
                if(arr[j] < arr[i]  ){
                    l++;
                }
            }
            // iterate and find right greater element of arr[i]  (arr[i] < arr[j])
            int r = 0;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] > arr[i] ){
                    r++;
                }
            }
            System.out.println(l);
            System.out.println(r);
            ans += (l*r);
        }
        System.out.println(ans);
    }
}
