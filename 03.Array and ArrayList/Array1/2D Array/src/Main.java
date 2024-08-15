public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        int[] arr = {3,8,9,5,6};
        for(int i=0, j =arr.length-1; i<arr.length; i++,j--){
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}