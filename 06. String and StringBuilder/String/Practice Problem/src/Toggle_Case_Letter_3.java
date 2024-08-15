public class Toggle_Case_Letter_3 {
    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(Toggle_Case(s));
    }
    static String Toggle_Case(String s){
        char[] ch = s.toCharArray();
        for(int i=0; i<s.length(); i++){
            if(Character.isUpperCase(ch[i])){
                ch[i] = Character.toLowerCase( ch[i] );

            } else if (Character.isLowerCase( ch[i]) ) {
                ch[i] = Character.toUpperCase( ch[i] );
            }
        }
        return new String(ch);
    }

}
