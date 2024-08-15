public class Longest_Prefix_String_1 {
    public static void main(String[] args) {
//        String[] s = {"abcdefgh", "aefghijk", "abcefgh"};
        String[] s = {"abab", "ab", "abcd"};
        System.out.println(Longest_Prefix(s));

    }
    static String Longest_Prefix(String[] s){
        // if String Array is contains only one String
        if(s.length == 0) return "";

        // if String array contains more than 1 Strings
        String prefix = s[0];
        for (String string : s) {
            while (string.indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                // can't find any prefix subarray
                if (prefix.isEmpty()) return "";
            }
        }
        return prefix;
    }
}
