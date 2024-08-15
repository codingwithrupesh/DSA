import java.util.Scanner;

public class Average3no {
    // average of 3 no

    public static int average(int x,int y,int z){
        return (x+y+z)/3;

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter three no ");
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        System.out.print(" average of "+a+" , "+b+" ,"+c+" = ");
        System.out.print(average(a,b,c));

    }
}
