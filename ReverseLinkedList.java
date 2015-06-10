package leetcode;

import java.util.Stack;

public class ReverseLinkedList {
    //思路可以，但是因为stack会导致内存溢出，无法通过leetcode测试
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) return head;
        Stack<ListNode> stack = new Stack<ListNode>();
        while(head != null){
            stack.push(head);
            head = head.next;
        }
        head = stack.pop();
        ListNode node = head;
        while(!stack.empty()){
            node.next = stack.pop();
            node = node.next;
        }
        return head;
    }
}
