import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        int[] arr = {-3,6,2,8,7,14,9,21};
        int s = 2, e = 5;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=s; i<=e; i++){
            ans.add(arr[i]);


        }
        System.out.print(10);
        System.out.println(20);
        int sub_Array_length = e-s+1;    // Find sub Array length
        System.out.println(sub_Array_length);

//    Print sub Array
        for(int i=0; i<ans.size(); i++){
            System.out.print(ans.get(i)+" ");
        }
    }
}