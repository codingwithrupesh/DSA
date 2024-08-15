class Node2 {
    int val ;
    Node2 next;
    Node2 (int x){
        val = x;
        next = null;
    }
}

public class Return_Size_LinkList {
    public static void main(String[] args) {
        Node2 head = Creat_List(5);

        // return size of LinkList
        System.out.println(size(head));

    }

    static Node2 Creat_List(int val) {
        Node2 head = new Node2(1);
        Node2 temp = head;
        for(int i=2; i<=val; i++){
            temp.next = new Node2(i);
            temp = temp.next;
        }
        return head;

    }

    static int size(Node2 head){
        Node2 temp = head;
        int count = 0;
        while(temp != null){
            temp = temp.next;
            count++;
        }
        return count;
    }
}
