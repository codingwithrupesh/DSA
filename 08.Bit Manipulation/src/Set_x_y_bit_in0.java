public class Set_x_y_bit_in0 {
    public static void main(String[] args) {
        int n = 0;
        int x = 2;
        int y = 5;

        System.out.println(Set_x_y(x , y));
    }

    // 1st method using OR operation
//    static int Set_x_y(int x , int y){
//        if( x == y){
//            return  1<<x ;
//        }else{
//            return  (1<<x | 1<<y);
//        }
//    }

    // 2nd method using Ternary Operator
    static int Set_x_y(int x , int y){
        return ((1<<x) | (1<<y) );

    }
}
