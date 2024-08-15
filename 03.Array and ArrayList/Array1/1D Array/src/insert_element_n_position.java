public class insert_element_n_position {
    public static void main(String[] args) {
        int[] arr = {2,39,6,7,8};
        int x = 3,y = 5;
        int[] newArr = new int[arr.length+1];
        for(int i=0; i<x ; i++){
            newArr[i] = arr[i];
        }
        arr[x] = y;
        for(int i=x+1 ; i<newArr.length; i++){
            newArr[i] = arr[i-1];
        }
        for(int i=0; i<newArr.length ; i++){
            System.out.print(newArr[i]+" ");
        }

    }
}
