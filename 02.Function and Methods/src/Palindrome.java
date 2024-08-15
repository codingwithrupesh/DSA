import java.util.Scanner;

public class Palindrome {
    // Reverse number
    public static int  reverse(int num){
        int reverse_no = 0;
        while (num > 0){
            int lastDigit = num % 10;
            reverse_no = reverse_no*10 + lastDigit;
            num /= 10;
        }
        return reverse_no;
    }
    // isPalindrome or not
    public static boolean isPalindrome(int num){
        boolean b = num == reverse(num);
        return b;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter any no ");
        int num =  s.nextInt();
        System.out.println(num+" is a palindrome no = "+isPalindrome(num));

    }
}
