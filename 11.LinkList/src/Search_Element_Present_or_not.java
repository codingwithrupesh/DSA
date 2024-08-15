class NodeA {
    int val;
    NodeA next ;
    NodeA(int x){
        val = x;
        next = null;
    }
}


public class Search_Element_Present_or_not {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        int search_ele = 4;

        NodeA head = Create_list(arr);

        System.out.println(isSearch(head , search_ele));
    }

    static NodeA Create_list(int[] arr){
        NodeA head = new NodeA(arr[0]);
        NodeA temp = head;
        for(int i=1; i<arr.length; i++){
            temp.next = new NodeA(arr[i]);
            temp = temp.next;
        }
        return head;
    }

    static boolean isSearch(NodeA head , int val){
        NodeA temp = head;
        while(temp != null){
            if(temp.val == val){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
}
