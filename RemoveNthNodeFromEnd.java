package leetcode;

public class RemoveNthNodeFromEnd {
	public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode first = head;
        ListNode second = head;
        for(int i=0;i<n;i++){
        	first = first.next;
        }
        if(first == null){
        	head = head.next;
        	return head;
        }
        while(first.next != null){
        	first = first.next;
        	second = second.next;
        }
        second.next = second.next.next;
        return head;
    }
}
