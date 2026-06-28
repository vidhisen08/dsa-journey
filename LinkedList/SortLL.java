package LinkedList;

import java.util.Arrays;

public class SortLL {
    public ListNode sortList(ListNode head) {
        ListNode curr = head;
        int n=0;
        while(curr!=null){
            n++;
            curr = curr.next;
        }
        int[] arr = new int[n];
        curr = head;
        for(int i=0;i<n;i++){
            arr[i]=curr.val;
            curr = curr.next;
        }
        Arrays.sort(arr);
        curr = head;
            for(int i=0;i<n;i++){
                curr.val = arr[i];
                curr = curr.next;
            }
        return head;
    }
}
