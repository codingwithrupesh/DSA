public class Node {
    int val ;
    Node1 next;
    Node (int x){
        val = x ;
        next = null;
    }
    static Node1 CreateList(int x){
        Node1 h = new Node1(1);
        Node1 l = h;
        for(int i=2; i<=x; i++){
            l.next = new Node1(i);
            l = l.next;
        }
        return h;
    }
    static void Print(Node1 h){
        while (h != null) {
            System.out.print(h.val+" ");
            // l.next = h.next;
            h = h.next;
        }
    }

    public static void main(String[] args) {
        Node1 list = CreateList(5);
        Print(list);
    }

}
