public class Sum_all_SubArray_n3 {
    public static void main(String[] args) {
        int[] arr = {-1,3,4,5};

        // 1st method T.C = O( n3 )
//        for(int s=0; s<arr.length; s++){
//            for(int e=s; e<arr.length; e++){
//                int sum = 0;
//                for(int i=s; i<=e; i++){
//                    System.out.print(arr[i]+" ");
//                    sum += arr[i];
//                }
//                System.out.print(" = "+sum+"\t\t");
//            }
//            System.out.println();
//        }

        // 2nd method using carry-forward method     T.C = O( n2 )
        for(int i=0; i<arr.length; i++){
            int sum = 0;
            for(int j=i; j<arr.length; j++){
                sum += arr[j];
                System.out.print(arr[j]+" ");
            }
            System.out.print(" = "+sum+" \t\t");
            System.out.println();

        }
    }
}
