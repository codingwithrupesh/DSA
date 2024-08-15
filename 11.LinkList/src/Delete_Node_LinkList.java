class Node_B {
    int val;
    Node_B next;
    Node_B(int x ){
        val = x;
        next = null;
    }

}

public class Delete_Node_LinkList {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int del_idx = 3;
        // Creat a LinkList
        Node_B head = CreateList(arr);

        // Print LinkList Before Deleting
        Print_LinkList(head);

        // Delete a Node in LinkList
        Delete_Node(head ,del_idx );

        // Print LinkList After Deleting
        Print_LinkList(head);

    }
    static Node_B CreateList(int[] arr){
        Node_B head = new Node_B(arr[0]);
        Node_B temp = head;
        for(int i=1; i<arr.length; i++){
            temp.next = new Node_B(arr[i]);
            temp = temp.next;
        }
        return head;
    }
    static void Print_LinkList(Node_B head){
        Node_B temp = head;
        while (temp != null){
            System.out.print(temp.val +" ");
            temp = temp.next;
        }
        System.out.println();
    }

    static Node_B Delete_Node(Node_B head ,int  del_idx){
        if(del_idx == 0){
            return head.next;
        }
        Node_B temp = head;
        for(int i=1; i<del_idx; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}
