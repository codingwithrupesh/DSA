class Node1 {
    int val ;
    Node1 next ;

    // Node1 Constructor
    public Node1(int data){
        val = data ;
        next = null ;
    }
}

public class Insert_New_Node {
    public static void main(String[] args) {
        // Create a Link_List and add Node1
        Node1 list = Create_LinkList(5);

        // Insert new Node1 at position 3
        Insert(list, 52 , 3);

        // Print all data of LinkList
        Print(list);

    }
    //  method to create a LinkList and add Node1
    static Node1 Create_LinkList(int x){
        Node1 head = new Node1(1);
        Node1 temp = head;
        for(int i =2; i<=x; i++){
            temp.next = new Node1(i);
            temp = temp.next;
        }
        return head;

    }

    static Node1 Insert(Node1 head, int val, int position){
        Node1 n = new Node1(val);
        if(position == 0){
            n.next = head;
            head = n;
            return head;
        }
        Node1 t = head;
        for(int i=1; i<position; i++){
            t = t.next;
        }
        n.next = t.next;
        t.next = n;
        return head;
    }
    static void Print(Node1 list){
        while(list != null){
            System.out.print(list.val +" ");
            list = list.next;
        }
    }
}
