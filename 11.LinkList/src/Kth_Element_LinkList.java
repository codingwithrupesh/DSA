class Node4{
    int val ;
    Node4 next;

    Node4(int x ){
        val = x;
        next = null;
    }
}

public class Kth_Element_LinkList {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        int pos = 1;

        Node4 head = Create_List(arr);

        System.out.println(Find_Element(head , pos ));

    }
    static Node4 Create_List(int[] arr){
        Node4 head = new Node4(arr[0]);
        Node4 temp = head;
        for(int i=1; i<arr.length; i++){
            temp.next = new Node4(arr[i]);
            temp = temp.next;
        }
        return head;
    }
    static int Find_Element (Node4 head , int pos){
        Node4 temp = head;
        for(int i =0; i<=pos; i++ ){
            temp = temp.next;
        }
        if(temp != null){
            return temp.val;
        }else{
            return -1;
        }

    }
}
