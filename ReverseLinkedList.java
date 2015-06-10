package leetcode;

import java.util.Stack;

public class ReverseLinkedList {
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
        node.next = null;//非常重要,最后一个节点一定要指向null
        return head;
    }
}
