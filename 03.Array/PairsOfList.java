public class PairsOfList {
    public static void pairs(int[] numbers ){
        int count = 0;
        for (int i =0 ; i<numbers.length; i++){
            for (int k = i+1; k<numbers.length; k++){
                System.out.print("("+numbers[i]+","+numbers[k]+") ,");
                count++;
            }
            System.out.println();
        }
        System.out.println("total pairs makes of given no of list = "+count);
    }





    public static void main(String[] args) {
        int[] numbers = {2,5,6,70,9,20};
        pairs(numbers);
    }
}
