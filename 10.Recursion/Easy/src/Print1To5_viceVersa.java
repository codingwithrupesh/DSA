public class Print1To5_viceVersa {
    public static void main(String[] args) {
        int n = 5 ;
        System.out.println("Print " + n + " to 1 using Recursion : ");
        print1(n);

        System.out.println("Print 1 to " + n + " using Recursion : ");
        print2(n) ;

        System.out.println("Print " + n + " to 1 and 1 to "+n+ " using Recursion : ");
        print(n);

    }
    // Print N to 1 ;
    static void print1( int n) {
        if(n == 1){
            System.out.println(1);
            return ;
        }
        System.out.println(n);
        print1(n-1);
    }
    // Print 1 to N
    static void print2( int n) {
        if(n == 1){
            System.out.println(1);
            return ;
        }
        print2(n-1);
        System.out.println(n);
    }
    // Print Both 1 to 5 and vice versa ;

    static void print(int n){
        if(n == 1){
            System.out.println(1);
            return ;
        }
        System.out.println(n);
        print(n-1);
        System.out.println(n);
    }
}
