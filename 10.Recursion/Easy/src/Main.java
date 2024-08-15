public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        fun(5);
    }
    static void fun(int n) {
        if (n == 0) {
            return;
        }
//       return fun(n--); // give the error
        System.out.println(n);
        fun(--n);
    }

}