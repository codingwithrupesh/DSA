import java.util.Arrays;

public class diff_maxEven_minodd {
    public static void main(String[] args) {
        int[] arr = {0, 2, 9};
        System.out.println(Diff_maxEven_minOdd(arr));

    }
    static int Diff_maxEven_minOdd(int[] arr){
        int counteven = 0,cntodd=0;
        for (int j : arr) {
            if ((j % 2 == 0)) {
                counteven++;
            } else {
                cntodd++;
            }
        }
        int[] even = new int [counteven];
        int[] odd  = new int [cntodd];
        int inde = 0, indo = 0;
        for (int j : arr) {
            if ((j % 2 == 0)) {
                even[inde] = j;
                inde++;
            } else {
                odd[indo] = j;
                indo++;
            }
        }
        Arrays.sort(even);
        Arrays.sort(odd);
        int evenmax = even[even.length-1];
        int oddmin = odd[0];
        return (evenmax-oddmin) ;
    }
}
