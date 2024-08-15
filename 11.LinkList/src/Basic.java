class Node3 {
    int val ;
    Node3 next;
    Node3(int x){
        val = x;
        next = null;
    }
}

public class Basic {
    public static void main(String[] args) {
        Node3 head = Creat_List(5);

        // return size of LinkList
        System.out.println(size(head));

    }
    static Node3 Creat_List(int val) {
        Node3 head = new Node3(1);
        Node3 temp = head;
        for(int i=2; i<=val; i++){
            temp.next = new Node3(i);
            temp = temp.next;
        }
        return head;

    }
    static int size(Node3 head){
        Node3 temp = head;
        int count = 0;
        while(temp != null){
            temp = temp.next;
            count++;
        }
        return count;
    }
}
