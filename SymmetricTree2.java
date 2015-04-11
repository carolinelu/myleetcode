package leetcode;

import java.util.Stack;

public class SymmetricTree2 {
	public boolean isSymmetric(TreeNode root) {
		if(root == null) return true;
		
		Stack<TreeNode> leftstack = new Stack<TreeNode>();
		Stack<TreeNode> rightstack = new Stack<TreeNode>();
		leftstack.push(root.left);
		rightstack.push(root.right);
		
		while(!leftstack.isEmpty() && !rightstack.isEmpty()){
			TreeNode left = leftstack.pop();
			TreeNode right = rightstack.pop();
			if(left == null && right == null) continue;
			if(left == null || right == null) return false;
			if(left.val != right.val) return false;
			
			leftstack.push(left.left);
			leftstack.push(left.right);
			rightstack.push(right.right);
			rightstack.push(right.left);
		}
		
		return true;
    }
}
