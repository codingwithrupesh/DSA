public class Copy_array_value {
    public static void main(String[] args) {
        int[] arr = {2,4,3,6,38,8,6};
        int b = 3;
        int[] newArr = new int[arr.length];
        for(int i=0; i<arr.length-1 ; i++){
            newArr[i] = arr[i]+b;
        }
        for(int i=0; i<arr.length ; i++){
            System.out.print(newArr[i]+" ");
        }
    }

}
