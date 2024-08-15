import java.util.Scanner;

public class Basic {
    public static void displayLenght(String str) {
        System.out.println("Length of "+str+" = "+str.length());
    }
    public static void  Count_Vowel(String str){
        int vol = 0 ;
        char ch ;
        for (int i = 0; i<str.length() ; i++){
            ch= Character.toUpperCase(str.charAt(i));
            switch (ch) {
                case 'A', 'E', 'I', 'O', 'U' -> vol++;
            }
        }
        System.out.println(" total vowel of "+str+" = "+vol);
    }
    public static void Count_alphabet_digit_symbol(String str){
        int alph = 0 , digit = 0, symbol = 0 ;
        char ch;
        for (int i =0 ; i<str.length(); i++){

            ch = str.charAt(i);
            if(Character.isLetter(ch)){
                alph++;
            } else if (Character.isDigit(ch)) {
                digit++;

            }
            else {
                symbol++;
            }
        }
        System.out.println("Total no Alphabets,Digits and Symbols of"+str+" : ");
        System.out.println("Alphabet = "+alph);
        System.out.println("Digits = "+digit);
        System.out.println("Symbol = "+symbol);
    }
    public static void UpperCase(String str){
        System.out.println("Upper case of "+str+" = "+str.toUpperCase());
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = s.nextLine();
        displayLenght(str);
        Count_Vowel(str);
        Count_alphabet_digit_symbol(str);
        UpperCase(str);


    }
}
