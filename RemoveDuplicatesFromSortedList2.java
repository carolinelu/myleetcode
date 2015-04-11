package leetcode;

public class RemoveDuplicatesFromSortedList2 {
	public ListNode deleteDuplicates(ListNode head) {
		ListNode first = head;
		while(first != null){
			if(first.next==null){
				break;
			}
			if(first.val == first.next.val){
				first.next = first.next.next;
			}else{
				first=first.next;
			}
		}
        return head;
    }
}
