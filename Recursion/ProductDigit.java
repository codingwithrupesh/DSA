public class ProductDigit {
    public static void main(String[] args) {
        System.out.println("product of all digit : "+product_digit(55));

    }
    static int product_digit(int n){
        if(n%10 == n){
            return n;
        }
        return (n%10) * product_digit(n/10);
    }
}
