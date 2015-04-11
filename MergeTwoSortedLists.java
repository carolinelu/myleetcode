package leetcode;

public class MergeTwoSortedLists {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null && l2 == null) 
        	return null;
        else if(l1 == null){
        	return l2;
        }else if(l2 == null){
        	return l1;
        }
        ListNode l11 = l1;
        ListNode l22 = l2;
        if(l1.val > l2.val){
        	l11 = l2;
            l22 = l1;
        }
        ListNode head = l11;
        l11 = l11.next;
        ListNode l3 = head;
       
        while(l11 != null && l22 != null){
        	if(l11.val < l22.val){
        		l3.next = l11;
        		l3 = l3.next;
        		l11 = l11.next;
        	}else{
        		l3.next = l22;
        		l3 = l3.next;
        		l22 = l22.next;
        	}
        }
        if(l11 == null && l22 != null){
    		while(l22 != null){
    			l3.next = l22;
    			l3 = l3.next;
    			l22 = l22.next;
    		}
    	}
    	if(l11 != null && l22 == null){
    		while(l11 != null){
    			l3.next = l11;
    			l3 = l3.next;
    			l11 = l11.next;
    		}
    	}
        return head;
    }
}
