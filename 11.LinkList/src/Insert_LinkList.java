import java.util.LinkedList;

public class Insert_LinkList {
    public static void main(String[] args) {
        LinkedList<Integer> data = new LinkedList<>();

        // add data in LinkList
        data.add(1);
        data.add(2);
        data.add(3);

//        Print_LinkList(data);
        Print(data);
    }

    static void Print_LinkList(LinkedList<Integer> data) {
        for(int i : data){
            System.out.print(i +" ");
        }
    }
    // print data using get methods
    static void Print (LinkedList<Integer> data){
        for(int  i=0; i<data.size(); i++){
            System.out.print(data.get(i)+" ");
        }
    }

}
