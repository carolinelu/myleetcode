package leetcode;

import java.util.LinkedList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal {
	public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        int level = 0;
        getResult(result,root,level);
        return result;
    }
	
	public void getResult(List<List<Integer>> list, TreeNode root, int level){
		if(root == null) return;
		if(list.size()<=level){
			List<Integer> sublist = new LinkedList<Integer>();
			list.add(sublist);
		}
		list.get(level).add(root.val);
		
		if(root.left != null) getResult(list,root.left,level+1);
		if(root.right != null) getResult(list,root.right,level+1);
	}
	
}
