public class Reverse_String_5 {
    public static void main(String[] args) {
        String s = "Scalar";

        System.out.println(Reverse(s));
    }
    static StringBuilder Reverse(String s){
        StringBuilder s1 = new StringBuilder(s);
        return s1.reverse();

    }
}
