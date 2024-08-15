public class Josephs_Problem {
    public static void main(String[] args) {
        int n = 5 , k = 1;
        System.out.println(solution(n , k));

    }
    static int solution(int N , int k){
        int ans = 0;
        int i = 1;
        while(i <= N ){
            ans = (ans + k)%i;
            i++;
        }
        return ans+1;
    }
}
