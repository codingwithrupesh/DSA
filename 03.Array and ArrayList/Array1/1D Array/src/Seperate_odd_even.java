public class Seperate_odd_even {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 2, 3, 4, 5, 3, 4, 3, 2};
        seperate_odd_even(arr);

    }
    static void seperate_odd_even(int[] arr){
        int counteven = 0,cntodd=0;
        for(int i=0; i<arr.length; i++){
            if( (arr[i]%2 ==0)  ){
                counteven++;
            }
            else{
                cntodd++;
            }
        }
        int[] even = new int [counteven];
        int[] odd  = new int [cntodd];
        int inde = 0, indo = 0;
        for(int i=0; i<arr.length; i++){
            if( (arr[i]%2 ==0)  ){
                even[inde] = arr[i];
                inde++;
            }
            else{
                odd[indo] = arr[i];
                indo++;
            }
        }
        print(odd);
        print(even);
        System.out.print(cntodd+" ");
        System.out.print(counteven);

    }
    static void print(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
