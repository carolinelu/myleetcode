package leetcode;

public class IntersectionOfTwoLinkedLists {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       ListNode hA = headA;
       ListNode hB = headB;
       int lengthA = 0,countA = 0;
       int lengthB = 0,countB = 0;
       if(hA == null || hB == null) return null;
       
       while(hA!=null){
    	   countA++;
    	   hA = hA.next;
       }
       while(hB!=null){
    	   countB++;
    	   hB = hB.next;
       }
       //如果最后一个元素不相同，那么一定不可能存在公共节点
       if(hA != hB) return null;
       int num = 0;
       hA = headA;
       hB = headB;
       if(countA > countB){
    	   num = countA - countB;
    	   for(int i=0;i<num;i++){
    		   hA = hA.next; 
    	   }
       }else{
    	   num = countB - countA;
    	   for(int i=0;i<num;i++){
    		   hB = hB.next; 
    	   }
       }
       while(hA != null && hB != null && hA != hB){
    	   hA = hA.next;
    	   hB = hB.next;
       }
       return hA;
    }
}
