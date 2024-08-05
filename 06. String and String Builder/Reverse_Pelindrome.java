import java.util.*;

public class Reverse_Pelindrome {
    public static String reverse(String str){
        char ch[] = str.toCharArray();
        String str1 ="";
        for(int i =str.length()-1; i>=0; i--){
           str1 += ch[i];
        }
        return str1;
    }
    public static void Pelindrome(String str){
        if(str.toUpperCase().equals(reverse(str.toUpperCase()))){
            System.out.println(str+" is a pelindrome String.");
        }
        else
            System.out.println(str+" is not a pelindrome String.");
    }
    public static boolean isPelindrome(String str ){
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
            System.out.println(isPelindrome(str));
            // String str1 = reverse(str);
            // System.out.println(str1);
        }
    }
    
}
