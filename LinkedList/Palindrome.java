package LinkedList;

import java.util.Stack;

public class Palindrome {
    Stack<Integer> s = new Stack<>();
        ListNode curr = head;
        while(curr!=null){
            s.push(curr.val);
            curr = curr.next;
        }
        curr = head;
        while(curr!=null){
            if(curr.val!=s.pop()){
                return false;
            }
            curr = curr.next; 
        }
        return true;
}
