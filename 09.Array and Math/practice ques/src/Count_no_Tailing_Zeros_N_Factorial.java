public class Count_no_Tailing_Zeros_N_Factorial {
    public static void main(String[] args) {
        int N = 130;
        System.out.println(Count_Tailing_Zeros(N));
    }
    static int Count_Tailing_Zeros(int n) {
        int count = 0;
        for(int j=5 ; n/j >= 1 ; j = j*5 ){
            count += n / j;
        }
        return count;
    }
}
