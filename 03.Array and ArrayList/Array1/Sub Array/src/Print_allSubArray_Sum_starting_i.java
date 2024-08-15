public class Print_allSubArray_Sum_starting_i {
    public static void main(String[] args) {
        int[] arr = {7,3,2,-1,6,8,2,3};
        int i  = 2;

        // 1st method T.C = O( n2 )

//      int[] pf = new int[arr.length];
//      for(int j=0; j<arr.length; j++){
//          if(j == 0){
//              pf[j] = arr[j];
//          }else{
//              pf[j] = pf[j-1] + arr[j];
//          }
//      }
//
//      for(int s=i; s<arr.length; s++){
//          for(int e=s; e<arr.length; e++){
//              int sum =0;
//              if(s == 0){
//                sum = pf[e];
//              }else{
//                  sum = pf[pf.length-1] - pf[s-1] ;
//              }
//              System.out.print(sum+" ");
//              break;
//          }
//      }

        // 2nd method T.C = O(n)
        int sum = 0;
        for(int j=i; j<arr.length; j++){
            sum = sum + arr[j];
            System.out.print(sum+" ");
        }
    }
}
