public class String_Operations_4 {
    public static void main(String[] args) {
        String s = "AbcaZeoB";
        System.out.println(Replace_Vowels_Hash(s));
    }
    static String Replace_Vowels_Hash(String s){
        // Concatinate String with itself
        String s2 = s;
        s = s.concat(s2);

        // Remove all Capital letters
        s = s.replaceAll("[A-Z]" , "");

        return s.replaceAll("[aeiou]" , "#");

    }
}
