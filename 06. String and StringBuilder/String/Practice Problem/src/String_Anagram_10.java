import java.util.Arrays;

public class String_Anagram_10 {
    public static void main(String[] args) {
        String str1 = "bat" , str2 = "cat";
        String a = "secure" , b = "rescue";
        System.out.println(isAnagram(a , b));
    }

    private static boolean isAnagram(String str1, String str2) {
        // check both String length is equals or not
        if(str1.length() != str2.length()){
            return false;
        }
        // change both string into character array
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        // Sort Both character Array
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        //check both character array is equal or not
        return Arrays.equals(ch1, ch2);
    }
}
