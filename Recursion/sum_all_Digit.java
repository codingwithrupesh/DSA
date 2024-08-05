public class sum_all_Digit {
    public static void main(String[] args) {
        System.out.println("Sum of all digit from last digit : "+sum_lastdigit(2536));
        System.out.println("Sum of all digit from First digit : "+sum_firstdigit(236));

    }
    static int sum_lastdigit(int num){
        if(num == 0){
            return 0;
        }
        return (num%10)+sum_lastdigit(num/10);
    }
    static int sum_firstdigit(int num){
        if(num == 0){
            return 0;

        }
        return sum_firstdigit(num/10) + (num%10);
    }
}
