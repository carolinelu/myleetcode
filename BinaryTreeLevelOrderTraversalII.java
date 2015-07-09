package leetcode;

import java.util.LinkedList;
import java.util.List;

public class BinaryTreeLevelOrderTraversalII {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        List<List<Integer>> finalres = new LinkedList<List<Integer>>();
        getResult(result, root, 0);
        for(int j=result.size()-1; j>=0;j--){
            finalres.add(result.get(j));
        }
        return finalres;
    }
    
    public void getResult(List<List<Integer>> result, TreeNode root, int level){
        if(root == null) return;
        if(result.size() <= level){
            List<Integer> subresult = new LinkedList<Integer>();
            result.add(subresult);
        }
        result.get(level).add(root.val);
        if(root.left != null) getResult(result,root.left,level+1);
        if(root.right != null) getResult(result,root.right,level+1);
    }
    
}
