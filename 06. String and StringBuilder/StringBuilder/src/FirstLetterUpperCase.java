public class FirstLetterUpperCase {
    public static String toUppercase(String str){

        StringBuilder sc = new StringBuilder();
        char ch = Character.toUpperCase(str.charAt(0));
        sc.append(ch);
        for(int i = 0; i< str.length(); i++){
            if(str.charAt(i) == ' ' && i< str.length()-1 ){
                sc.append(ch);
                i++;
                sc.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sc.append(str.charAt(i));
            }
        }
        return sc.toString();
    }
    public static void main(String[] args) {
        String str = " hi, i am Rupesh";
        System.out.println("Before Upper Case = "+str);
        System.out.println("after Upper case =  "+toUppercase(str));

    }
}
