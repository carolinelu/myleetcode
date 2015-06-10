package leetcode;

import java.util.Stack;

public class ReverseLinkedList2 {
    //best one
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode a = head;
        ListNode b = a.next;
        while(b != null){
            ListNode c = b.next;
            b.next = a;
            a = b;
            b = c;
        }
        head.next = null; //非常非常重要,最后一个节点一定要指向null
        return a;
    }
    
    public ListNode reverseList2(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode a = head;
        ListNode b = a.next;
        ListNode c = b.next;
        while(b != null){
            b.next = a;
            a = b;
            b = c;
            if(c != null) c = c.next;    
        }
        
        return a;
    }
}
