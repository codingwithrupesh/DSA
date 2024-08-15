public class All_Pelindrome_Substring_7 {
    public static void main(String[] args) {
        String s = "aaaabaaa";
        All_pelindrome_Substring(s);
    }
    static void All_pelindrome_Substring(String s){
        for(int i=0; i<s.length(); i++){
            for(int j=i+1; j<s.length(); j++){
                String substr = s.substring(i , j);
                if(isPalindrome(substr)){
                    System.out.println(substr);
                }
            }
        }
    }
    static boolean isPalindrome(String substr){
        int start = 0;
        int end = substr.length() -1;
        while(start < end){
            if(substr.charAt(start) != substr.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
