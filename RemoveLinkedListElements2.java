package leetcode;

public class RemoveLinkedListElements2 {
	public ListNode removeElements(ListNode head, int val) {
	    ListNode result = head;
	    if(result == null) return result;
	    result.next = removeElements(head.next,val);
		if(result.val == val)
			return result.next;
		else 
			return result;
    }
}
