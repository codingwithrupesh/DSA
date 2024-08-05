import java.util.Scanner;

public class   print1to10 {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a no : ");
        int a = s.nextInt();
//        print1to10(a);
//        System.out.println("Print no."+a+" to 1 : ");
//        printNto1(a);
        printBoth(a);

    }
    public static void print1to10(int num){
        if(num == 0){
            return ;

        }
        print1to10(num-1);
        System.out.println(num);

    }
    public static void printNto1(int num){
        if(num == 0){
            return;
        }
        System.out.println(num);
        printNto1(num-1);
    }
    static void printBoth(int num){
        if(num==0){
            return ;
        }
        System.out.println(num);
        printBoth(num-1);
        System.out.println(num);
    }
}
