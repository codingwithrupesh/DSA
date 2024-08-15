import java.util.ArrayList;

public class Product_array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        ArrayList<Integer> pr = new ArrayList<>();
        ans(arr, pr);
        print(pr);

    }
    static ArrayList<Integer> ans(int[] arr , ArrayList<Integer> pr){
        int product = 1;
        for(int i=0; i<arr.length; i++){
            product = product * arr[i];
        }
        for(int i=0; i<arr.length; i++){
            pr.add(product/arr[i]);
        }
        return pr;
    }
    static void print(ArrayList<Integer> pr){
        for(int i=0; i<pr.size(); i++){
            System.out.print(pr.get(i)+" ");
        }
    }
}
