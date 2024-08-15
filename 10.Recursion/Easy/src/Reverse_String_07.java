public class Reverse_String_07 {
    public static void main(String[] args) {
        String str = "raj";
        System.out.println(Reverse_String(str));

    }
    static String Reverse_String(String str){
        if(str.length() == 1){
            return str;
        }
        StringBuilder sb = new StringBuilder();
        Reverse_String(str , str.length() , sb);
        return sb.toString();
    }
    private static void Reverse_String(String str , int n , StringBuilder sb) {
        if(n == 1){
            sb.append(str.charAt(n - 1));
            return;
        }
        sb = sb.append(str.charAt(n - 1));
        Reverse_String(str , n - 1 , sb);
    }
}
