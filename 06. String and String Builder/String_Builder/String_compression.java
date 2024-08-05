package String_Builder;

public class String_compression {
    //using string
    public static String stringCompression(String str){
        
        String newStr ="";
        for(int i = 0;  i<str.length(); i++){
            Integer count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            newStr += str.charAt(i);
            if(count>1){
                newStr += count.toString();
            }
          
        }
        return newStr;
    }
    //using String Builder 
    public static String StringCompression(String str){
        StringBuilder sc = new StringBuilder("");

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
        System.out.println(StringCompression(str));
    }
    
}
