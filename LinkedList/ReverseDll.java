package LinkedList;

public class ReverseDll {
    public ListNode reverseDLL(ListNode head) {
        if (head == null || head.next == null){
            return null;
        }
        ListNode temp = null;
        ListNode curr = head;
        while(curr!=null){
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;

            curr = curr.prev;
        }
        return temp.prev;
    }
}
