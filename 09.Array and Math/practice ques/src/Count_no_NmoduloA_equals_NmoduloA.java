public class Count_no_NmoduloA_equals_NmoduloA {
    // given M and N which N > M , Count no A > 0 , such that (N % A == M % A)
    public static void main(String[] args) {
        int M = 4 ,N = 10;
        System.out.println(Count_NmoduloA_Equals_MmoduloA(M , N));
        System.out.println(Count_Factors(M , N));

    }
    // Count the Factors of N
    // TC = O ( Log N )
    static int Count_Factors(int M , int N){
        int count = 0 ;
        for(int i=1; i * i <= N-M ; i++){
            if((N-M) % i == 0){
                if( i == ((N-M) % i)){
                    count++;
                }else{
                    count = count + 2;
                }
            }
        }
        return count;
    }
    // Brute force : Iterate over 1 to N and find N%A == M%A and count
    // TC = O( N )
    static int Count_NmoduloA_Equals_MmoduloA(int M , int N){
        int count = 0;
        for(int i=1; i<=N ; i++ ){
            if(M % i == N % i){
                count++;
            }
        }
        return count;
    }

}
