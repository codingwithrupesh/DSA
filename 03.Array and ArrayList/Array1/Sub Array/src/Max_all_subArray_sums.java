public class Max_all_subArray_sums {
    public static void main(String[] args) {
        int[] arr = {-1,3,4,5};

        // 1st method   T.C = O(n3)
        int max = Integer.MIN_VALUE;
//        for(int s=0; s<arr.length; s++){
//            for(int e=s; e<arr.length; e++){
//                int sum = 0;
//                for(int i=s; i<=e; i++){
//                    System.out.print(arr[i]+" ");
//                    sum += arr[i];
//                }
//                System.out.print(" = "+sum+"\t\t");
//                max = Math.max(max , sum);
//            }
//            System.out.println();
//        }
//        System.out.println("Maximum of all Sub Array sums = "+max);

        // 2nd method using prefix array T.C = O( n2 )
//        int[] pf = new int [arr.length];
//        for(int i=0; i<arr.length; i++){
//            if(i ==0 ){
//                pf[i] = arr[i];
//            }else{
//                pf[i] = pf[i-1] + arr[i];
//            }
//        }
//        for(int j=0; j<pf.length; j++){
//            System.out.print(pf[j]+" ");
//        }
//        max = Integer.MIN_VALUE;
//        for(int s=0; s<arr.length; s++){
//            for(int e=s; e<arr.length; e++){
//                int sum = 0;
//                if(s == 0){
//                    sum  = pf[e];
//                }else{
//                    sum = pf[e] - pf[s-1];
//                }
//                max = Math.max(max , sum);
//            }
//        }
//        System.out.println("Maximum of all Sub Array sums = "+max);

        // 3rd method using carry-forward Array    T.C = O( n2 )
        max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            int sum = 0;
            for(int j=i; j<arr.length; j++){
                System.out.print(arr[j]+" ");
                sum += arr[j];
            }
            System.out.print(" = "+sum+" ");
            System.out.println();
            max = Math.max(max , sum);
        }
        System.out.println("Max of all sub-Array sums = "+max);

    }
}
