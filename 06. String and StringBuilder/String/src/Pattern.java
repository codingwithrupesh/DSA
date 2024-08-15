import java.util.Scanner;

public class Pattern {
    public static void pattern(String str){
        for (int i = 0; i<str.length(); i++) {
            for(int j= 0; j<=i ; j++){
                System.out.print(str.charAt(j));
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter a String :");
            String str =  s.nextLine();
            pattern(str);
        }
    }
}
