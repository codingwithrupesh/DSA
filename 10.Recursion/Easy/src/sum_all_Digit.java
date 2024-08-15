public class sum_all_Digit {
    public static void main(String[] args) {
        System.out.println("Sum of all digit from last digit : "+sum_lastDigit(2536));
        System.out.println("Sum of all digit from First digit : "+sum_firstDigit(236));

    }
    static int sum_lastDigit(int num){
        if(num == 0){
            return 0;
        }
        return (num%10)+sum_lastDigit(num/10);
    }
    static int sum_firstDigit(int num){
        if(num == 0){
            return 0;
        }
        return sum_firstDigit(num/10) + (num%10);
    }
}
