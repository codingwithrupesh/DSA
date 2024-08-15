public class Find_unique_number {
    public static void main(String[] args) {
        int[] arr = {5,6,9,3,5,9,6};

        int ans = 0;
        for(int i=0; i<arr.length; i++){
            ans = ans ^ arr[i];
        }
        System.out.println("Unique element of array = "+ans);
    }
}
