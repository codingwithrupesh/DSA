public class Count_Pairs {
    public static void main(String[] args) {
        char[] arr = {'a','d','g', 'a', 'g', 'a', 'g', 'f', 'g'};
        int count_g = 0;
        int ans = 0;
        for(int i=arr.length-1; i>=0; i--){
            if (arr[i] == 'g') {
                count_g++;
            }
            if(arr[i] == 'a'){
                ans += count_g;
            }
        }
        System.out.println(ans);
    }
}
