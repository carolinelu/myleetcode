package leetcode;

public class MaximumDepthofBinaryTree {
	public int maxDepth(TreeNode root) {
		int depth = 0;
		if(root == null) return depth;
		return getDepth(depth,root);
        
    }
	
	public int getDepth(int beforedepth, TreeNode root){
		int left = beforedepth + 1;
		int right = beforedepth + 1;
		if(root.left != null){
			left = getDepth(left, root.left);
		}
		if(root.right != null){
			right = getDepth(right, root.right);
		}
		if(left > right) return left;
		else return right;
	}
}
