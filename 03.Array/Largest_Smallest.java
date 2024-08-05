
public class Largest_Smallest {
    public static int Largest(int[] numbers){
        int largest = Integer.MIN_VALUE;  // it shows -infinity
        //  for (int i = 0 ; i< numbers.length ; i++){
        for (int number : numbers) {   //used inhanced loop
            if (number > largest)
                largest = number;
        }
        return largest;
    }
    public static int smallest(int[] numbers){
        int smallest = Integer.MAX_VALUE;  // it shows +infinity
        //for (int i = 0 ; i<numbers.length ; i++){
        for (int number : numbers) {  // used enhanced loop
            if (number < smallest)
                smallest = number;
        }
        return smallest;
    }
    public static void main(String[] args) {
        int[] numbers = {5,6,9,1,2,50,6,890,3};
        System.out.println("Largest no is "+Largest(numbers));
        System.out.println("Smallest no is "+smallest(numbers));

    }
}
