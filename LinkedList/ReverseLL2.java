package LinkedList;

public class ReverseLL2 {
    public ListNode reverseList(ListNode head) {
        Stack<Integer> s = new Stack<>();
        ListNode curr = head;
        while(curr!=null){
            s.push(curr.val);
            curr = curr.next;
        }
        curr = head;
        while(curr!=null){
            curr.val = s.pop();
            curr = curr.next;
        }
        return head;
    }
}
