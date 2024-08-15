public class Add_2_Binary_String {
    public static void main(String[] args) {
        String a = "110" , b = "10";
        String A = "100" , B = "11" ;
        System.out.println(Add_Binary(A , B));
    }

    private static String Add_Binary(String a, String b) {
        StringBuilder s = new StringBuilder();
        int i = a.length()-1, j = b.length()-1 , carry = 0;

        while(i >= 0 || j >= 0){
            int sum = carry;
            if(i >= 0) sum += a.charAt(i--) - '0';
            if(j >= 0) sum += b.charAt(j--) - '0';

            s.append(sum % 2);
            carry = sum / 2 ;
        }

        if(carry != 0 ){
            s.append(carry);
        }
        return s.reverse().toString();
    }
}
