package leetcode;

import java.util.Stack;

public class ReverseLinkedList {
    //˼·���ԣ�������Ϊstack�ᵼ���ڴ�������޷�ͨ��leetcode����
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
