package leetcode;

public class BalancedBinaryTree {
	public boolean isBalanced(TreeNode root) {
		if(root == null) return true;
		int result = Math.abs(getMaxDepth(root.left) - getMaxDepth(root.right));
		if(result>1) return false;
		else return isBalanced(root.left) && isBalanced(root.right);
    }
	
	public int getMaxDepth(TreeNode root){
		if(root == null) return 0;
		int left = getMaxDepth(root.left);
		int right = getMaxDepth(root.right);
		return Math.max(left, right) + 1;
	}
}
