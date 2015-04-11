package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class SameTree {
	public boolean isSameTree(TreeNode p, TreeNode q) {
		
		if(p == null && q == null) return true;
		if(p == null || q == null) return false;
		if(!isSameNode(p,q)) return false;
		Queue<TreeNode> qp = new LinkedList<TreeNode>();
		Queue<TreeNode> qq = new LinkedList<TreeNode>();
		
		qp.add(q);
		qq.add(p);
		while(!qp.isEmpty() && !qq.isEmpty()){
			TreeNode pnode = qp.peek();
			TreeNode qnode = qq.peek();
			
			qp.poll();
			qq.poll();
			
			if(!isSameNode(pnode.left,qnode.left)) return false;
			if(pnode.left != null && qnode.left != null){
				qp.add(pnode.left);
				qq.add(qnode.left);
			}
			
			if(!isSameNode(pnode.right,qnode.right)) return false;
			if(pnode.right != null && qnode.right != null){
				qp.add(pnode.right);
				qq.add(qnode.right);
			}
		}
        return true;
    }
	
	public boolean isSameNode(TreeNode p, TreeNode q){
		if(p==null && q==null) return true;
		if(p==null || q==null) return false;
		return p.val == q.val;
	}
}
