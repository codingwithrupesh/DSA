public class Check_AlphaNumeric_9 {
    public static void main(String[] args) {
        char[] ch = {'S', 'c', 'a', 'l', 'e', 'r', 'A', 'c', 'a', 'd', 'e', 'm', 'y', '2', '0', '2', '0'};
        char[] ch1 = {'S', 'c', 'a', 'l', 'e', 'r', '#', '2', '0', '2', '0'};
        System.out.println(isAlphaNumeric(ch1));
    }
    static int isAlphaNumeric(char[] ch){
        for(char c : ch){
            if(!Character.isLetterOrDigit(c)){
                return 0;
            }
        }
        return 1;
    }
}
