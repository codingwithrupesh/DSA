public class FunctionOverLoading {
    //add 2 integer number
    public static int sum (int a, int b){
        return a+b;
    }
    //add 3 integer value
    public static int sum (int a,int b, int c){
        return a+b+c;
    }
    //add 2 double value
    public static double sum (double a , double b){
        return a+b;
    }
    // function overloading only depends on function  parameter or signature
    // function overloading not depend upon function return type
    public static void main(String[] args) {
        System.out.println(sum(2,3));
        System.out.println(sum(5,6,8));
        System.out.println(sum(12.5d , 76.9d));

    }
}
