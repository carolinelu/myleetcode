package leetcode;

public class BalancedBinaryTree2 {
	private boolean result = true;
	public boolean isBalanced(TreeNode root) {
		getMaxDepth(root);
		return result;
    }
	
	public int getMaxDepth(TreeNode root){
		if(root == null) return 0;
		int left = getMaxDepth(root.left);
		int right = getMaxDepth(root.right);
		if(Math.abs(left - right) > 1) result = false;
		return Math.max(left, right) + 1;
	}
}
