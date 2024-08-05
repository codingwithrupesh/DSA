import static java.lang.Math.PI;

public class PreetyPrinting {
    public static void main(String[] args) {
        float a = 24.3545f;
        // it gives formatted number and also round off
        System.out.printf("Formatted number is %.2f", a);
        System.out.println();

        System.out.printf("Pie : %.3f" ,PI);
        System.out.println();

        System.out.printf("My name is %s and I am %s" , "Raj" , "cool");
        System.out.println();
    }
}
