public class Given_n_set_i_bits {
    public static void main(String[] args) {
        int n = 21;
        int i = 3;
        System.out.println(set_i_bits(n , i));

    }
    static int set_i_bits(int n, int i){
        return (n | (1<<i));
    }
}
