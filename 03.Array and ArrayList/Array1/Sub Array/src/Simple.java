import java.util.Scanner;

public class Simple {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String st = "restart";
        System.out.println(st.charAt(2));
        change_char(st);
        System.out.println(st);




    }
    public static String change_char(String s) {
        // complete the function template
        char c = s.charAt(0);
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i) == c){
                char a = s.charAt(i);
                s.replace(a,'$');

            }
        }
        return s;
    }
}
