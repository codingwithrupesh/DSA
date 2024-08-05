import java.util.*;
import java.lang.*;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any no ");
        int a = sc.nextInt();
        boolean check = true ;
        for(int i =2 ; i<=a/2; ++i){
            if(a%i==0){
                check= false ;
                break;
            }
        }
        if(check) {
            System.out.println("prime");
         }
        else {
           System.out.println("not prime");
        }
    }
}
