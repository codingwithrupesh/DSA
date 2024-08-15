public class Count_Occurance_String_11 {
    public static void main(String[] args) {
        String s = "abobc" , target = "bob";
        System.out.println(Count_Occurance(s , target));
    }

    private static int Count_Occurance(String s, String target) {
        int count = 0;
        int fromIndex = 0;
        while((fromIndex = s.indexOf(target , fromIndex)) != -1){
            count++;
            fromIndex++;
        }
        return count;
    }
}
