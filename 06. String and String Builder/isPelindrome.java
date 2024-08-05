import java.util.Scanner;

public class isPelindrome {

    // compare first and last index of element
    public static boolean Pelindrome(String str) {
        for (int i = 0 ; i<= str.length(); i++){
            int n = str.length();
            if (str.charAt(i) == str.charAt(n-1-i)){
                return false;
            }
        }
        return false;

    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a Strings : ");
        String str = s.nextLine();
        System.out.println(Pelindrome(str));

    }
}
