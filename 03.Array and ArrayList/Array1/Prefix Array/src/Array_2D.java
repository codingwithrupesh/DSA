public class Array_2D {

    public static void main(String[] args) {
        int arr[][] = {{1,2},{4,6}};
        int s , e ;
//        for(int i =0; i<arr.length; i++){
//            for(int j=0; j<=arr.length; j++){
//                System.out.println(arr[i][j]);
////                System.out.println(arr[i][j+1]);
//
//            }
//        }
        int[] arr1 = {2, 1, 6, 4};
        int[] pfodd = new int[arr1.length];
        for(int i= 0 ; i<arr1.length; i++){
            if(i ==0){
                pfodd[i] = 0;
            }else{
                if(i%2 !=0 ){
                    pfodd[i] = pfodd[i-1] + arr1[i];
                }
                else{
                    pfodd[i] = pfodd[i-1];
                }
            }
        }

//
        for(int i=0; i<arr1.length; i++){
            System.out.print(pfodd[i]+" ");
        }
    }
}
