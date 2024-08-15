public class Check_i_bit_set_unset {
    public static void main(String[] args) {
        int n = 20 ;
        int i = 2 ;
        System.out.println(Check_set_Unset(n , i));


    }
    // 1st method using right shift

//    static boolean Check_set_Unset(int n , int i){
//        if(((n>>i) & 1) == 0){
//          return false;
//        }else{                // return ((n >> i) & 1) != 0;
//            return true;
//        }
////        or
////        return ((n>>i) & 1) == 1 ;
//    }


    // 2nd method using left shift
//    static boolean Check_set_Unset(int n, int i){
//        if ((n & (1<<i)) == 0){
//            return false;
//        }else {                     //   return (n & (1 << i)) != 0;
//            return true;
//        }
////        return !((n & (1<<i)) == 0);
////            // or
////        return ((n & (1<<i)) != 1);
//    }

    static boolean Check_set_Unset(int n, int i){
        if ((n & (1<<i)) == (1<<i)){
            return true;
        }else {              //  return (n & (1 << i)) == (1 << i);
            return false;
        }

    }
}
