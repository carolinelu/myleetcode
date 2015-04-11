package leetcode;

public class RemoveDuplicatesFromSortedList {
	public ListNode deleteDuplicates(ListNode head) {
		if(head == null){
			return head;
		}
		ListNode first = head;
		ListNode second = head;
		while(second != null){
			if(first.val == second.val){
				second=second.next;
				if(second==null){
					first.next = null;
				}
			}else{
				first.next=second;
				first=first.next;
				second=second.next;	
			}
		}
        return head;
    }
}
