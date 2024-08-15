public class StringCompression {
    //using string
    public static String stringCompression(String str){

        StringBuilder newStr = new StringBuilder();
        for(int i = 0;  i<str.length(); i++){
            int count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            newStr.append(str.charAt(i));
            if(count>1){
                newStr.append(Integer.toString(count));
            }

        }
        return newStr.toString();
    }
    //using String Builder
    public static String stringCompression1(String str){
        StringBuilder sc = new StringBuilder();

        // sc.append(str.charAt(0));

        for(int  i = 1;  i<str.length(); i++){

            Integer  count = 1;
            while( i< (str.length()-1)  && str.charAt(i) == str.charAt(i+1)) {
                count++;
                i++;
            }
            sc.append(str.charAt(i));
            if(count > 1){
                sc.append(count);

            }

        }

        return sc.toString();
    }
    public static void main(String[] args) {
        String str = "aaabbcccdd" ;
        System.out.println(str.length());
        System.out.println(stringCompression1(str));
    }
}
