public class Check_Palindrome_String_06 {
    public static void main(String[] args) {
        String str = "madam";
        System.out.println(Check_Palindrome_String(str , 0 , str.length()-1));

    }
    static boolean Check_Palindrome_String(String str , int s , int e){
        if(s>e) {
            return true;
        }
        if(str.charAt(s) == str.charAt(e) && Check_Palindrome_String(str, s+1, e-1)){
            return true;
        }
        return false;
    }
}
