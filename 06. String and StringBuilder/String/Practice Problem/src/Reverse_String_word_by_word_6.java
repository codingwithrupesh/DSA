import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Reverse_String_word_by_word_6 {
    public static void main(String[] args) {
        String str = "the sky is blue";
        System.out.println(Reverse(str));
    }
    static String Reverse(String str){

        // "\\s" is used for matches any whitespace character (including space, tab, line break, etc.).

        List<String> words = Arrays.asList(str.split("\\s"));
        Collections.reverse(words);
        return String.join(" ", words);

    }
}
