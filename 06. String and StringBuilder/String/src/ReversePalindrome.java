import java.util.Scanner;

public class ReversePalindrome {
    public static String reverse(String str){
        char[] ch = str.toCharArray();
        StringBuilder str1 = new StringBuilder();
        for(int i =str.length()-1; i>=0; i--){
            str1.append(ch[i]);
        }
        return str1.toString();
    }
    public static void palindrome(String str){
        if(str.toUpperCase().equals(reverse(str.toUpperCase()))){
            System.out.println(str+" is a palindrome String.");
        }
        else
            System.out.println(str+" is not a palindrome String.");
    }
    public static boolean isPalindrome(String str ){
        for(int i = 0; i<str.length(); i++){
            if(str.toLowerCase().charAt(i)!= str.toLowerCase().charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter a String : ");
            String str = s.nextLine();
            System.out.println(isPalindrome(str));
            // String str1 = reverse(str);
            // System.out.println(str1);
        }
    }
}
