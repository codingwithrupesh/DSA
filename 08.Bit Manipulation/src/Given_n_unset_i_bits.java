public class Given_n_unset_i_bits {
    public static void main(String[] args) {
        int n = 23;
        int i = 2;
        System.out.println(Unset_i_bits(n, i));

    }
    static int Unset_i_bits(int n, int i){
        return (n ^ (1<<i));

    }
}
