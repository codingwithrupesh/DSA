public class reverseListno {
    public static void reverse(int[] list_no){
        int start = 0 ;
        int end = list_no.length-1;
        while(start < end ){
            // simple swap code for two no
            int temp = list_no[end];
            list_no[end]= list_no[start];
            list_no[start] = temp;
            start++;
            end--;

        }
    }
    public static void print(int[] list_no){
//        for (int i = 0 ; i< list_no.length ; i++){
            for (int j : list_no) {  // used inhanced loop
            System.out.print(j + ",");
        }
        System.out.println();
    }



    public static void main(String[] args) {
//        Scanner s = new Scanner (System.in);
        int[] list_no = {16,5,6,0,1,2,9};
        System.out.println(" Before reverse a list of no.");
        print(list_no);
        reverse(list_no);
        System.out.println("After reverse a list of no --> ");
        print(list_no);



    }
}
