package leetcode;

public class RemoveLinkedListElements {
	public ListNode removeElements(ListNode head, int val) {
		ListNode dummy = new ListNode(0);
		dummy.next = head;
	    ListNode result = dummy;
		while(result.next != null){
			if(result.next.val == val){
				result.next = result.next.next;
			}else{
				result = result.next;
			}
		}
        return dummy.next;
    }
}
