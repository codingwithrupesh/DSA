public class Count_set_bits {
    public static void main(String[] args) {
        int n = 27;
        System.out.println(Count_set_bits(n));

    }
    // method 1 using loop
//    static int Count_set_bits(int n){
//        int c = 0;                            // T.C = O(1)
//        for(int i=0; i<32; i++){
//            if(Check_set_bits(n, i)) {
//                c++;
//            }
//        }
//        return c;
//    }

    // 2nd method using right shift
    static int Count_set_bits(int n){
        int c = 0;
        while(n > 0){
            if((n & 1) == 1) {           // T.C = O( log n )
                c++;
            }
            n = n>>1;
        }
        return c;
    }

    static boolean Check_set_bits(int n, int i){
        return (((n>>i) & 1) != 0);
    }
}
